package com.yy.smallshare.presenter;

import android.content.Context;

import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.yy.smallshare.listener.IAuthView;
import com.yy.smallshare.model.IOauthModel;
import com.yy.smallshare.model.OauthImpl;

/**
 * Created by Jaron Yu on 2016/3/8.
 */
public class Oauth2Presenter {

    private IOauthModel iOauthModel;
    /**
     * 封装了 "access_token"，"expires_in"，"refresh_token"，并提供了他们的管理功能
     */
    private Oauth2AccessToken mAccessToken;
    private IAuthView iAuthView;

    public Oauth2Presenter(IAuthView iAuthView) {
        this.iAuthView = iAuthView;
        iOauthModel = new OauthImpl();
    }

    public void getUserInfo(Context context){
        iAuthView.showLoading();
        iOauthModel.auth(context, iAuthView.getAuthUserParams());
    }


    public void inputAuthParams(final Context context){
        getUserInfo(context);
    }

}
