package com.yy.smallshare.module.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.sina.weibo.sdk.auth.WeiboAuth;
import com.sina.weibo.sdk.auth.WeiboAuthListener;
import com.sina.weibo.sdk.exception.WeiboException;
import com.yy.smallshare.R;
import com.yy.smallshare.bean.User;
import com.yy.smallshare.common.Constants;
import com.yy.smallshare.listener.IAuthView;
import com.yy.smallshare.presenter.Oauth2Presenter;

import java.util.HashMap;
import java.util.Map;

/**
 * 微分享认证界面
 * <p/>
 * Created by Jaron Yu on 2016/3/8.
 */
public class Oauth2Activity extends Activity implements IAuthView {
    private static final String TAG = "OAuth2Activity";

    /**
     * 微博Web授权类，提供了登录等功能
     */

    private WeiboAuth mWeiboAuth;

    private Oauth2Presenter oauth2Presenter = null;

    /**
     * 封装了 "access_token"，"expires_in"，"refresh_token"，并提供了他们的管理功能
     */
    private Oauth2AccessToken mAccessToken;

    private Context context = null;

    private String type = "sina";

    private User user;

    /**
     * 获取微博信息所需参数对象。
     */
    private Map<String, Object> params = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.oauth2);
        mWeiboAuth = new WeiboAuth(this, Constants.APP_KEY,
                Constants.REDIRECT_URL, Constants.SCOPE);
        mWeiboAuth.anthorize(new AuthListener());
    }

    @Override
    public User getAuthUserParams() {
        return user;
    }

    @Override
    public void putAuthParams(Map<String, Object> params) {

    }

    @Override
    public void toMainActivity() {
    Intent i=new Intent();
        i.setClass(this,MainActivity.class);
        startActivity(i);
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    class AuthListener implements WeiboAuthListener {

        @Override
        public void onComplete(Bundle bundle) {
// 授权认证后，返回给我们认证信息，当前项目中主要用到:uid, access_token
            mAccessToken = Oauth2AccessToken.parseAccessToken(bundle);
            Log.d(TAG, "values--uid: -->" + mAccessToken.getUid());
            // 判断mAccessToken是否有效。
            if (mAccessToken.isSessionValid()) {
                Toast.makeText(Oauth2Activity.this, "认证成功~", Toast.LENGTH_SHORT)
                        .show();
                user = new User();
                user.setUserId(mAccessToken.getUid());
                user.setExpiressIn(mAccessToken.getExpiresTime());
                user.setRefreshToken(mAccessToken.getRefreshToken());
                user.setToken(mAccessToken.getToken());
                params = new HashMap<String, Object>();
                params.put("uid", user.getUserId());
                params.put("access_token", user.getToken());
                Toast.makeText(Oauth2Activity.this, "正在获取用户信息...",
                        Toast.LENGTH_SHORT).show();
                oauth2Presenter = new Oauth2Presenter(Oauth2Activity.this);
                oauth2Presenter.inputAuthParams(Oauth2Activity.this);
            } else {

            }
        }

        @Override
        public void onWeiboException(WeiboException e) {

        }

        @Override
        public void onCancel() {
            Toast.makeText(context, "您取消了授权!",
                    Toast.LENGTH_SHORT).show();
            finish();
        }
    }

}
