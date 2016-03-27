package com.yy.smallshare.model;

import android.content.Context;

import com.google.gson.Gson;
import com.yy.smallshare.bean.User;
import com.yy.smallshare.common.Session;
import com.yy.smallshare.common.WeiboUrl;
import com.yy.smallshare.httputils.OkHttpUtils;
import com.yy.smallshare.httputils.callback.StringCallback;
import com.yy.smallshare.listener.OnAuthListener;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;

/**
 * Created by Jaron Yu on 2016/3/8.
 */
public class OauthImpl implements IOauthModel {

    private Map<String,String> params=new HashMap<String, String>();

    @Override
    public void auth(Context context,User user,OnAuthListener onAuthListener) {
        getUserRequest(context,user,onAuthListener);
    }

    private void getUserRequest(Context context, final User user, final OnAuthListener onAuthListener){
        params.put("uid", user.getUserId());
        params.put("access_token", user.getToken());
        OkHttpUtils.post()
                .url(WeiboUrl.GET_USER)
                .params(params)
                .build()
                .execute(new StringCallback() {
                    @Override
                    public void onError(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(String response) {
                        Gson gson=new Gson();
                        User userinfo= gson.fromJson(response,User.class);
                        userinfo.setToken(user.getToken());
                        userinfo.setUserId(user.getUserId());
                        Session.user=userinfo;
                        onAuthListener.getAuthUserSuccess();
                    }
                });
    }

}
