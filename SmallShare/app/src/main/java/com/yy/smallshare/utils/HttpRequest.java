package com.yy.smallshare.utils;

import com.yy.smallshare.httputils.OkHttpUtils;
import com.yy.smallshare.httputils.callback.StringCallback;
import com.yy.smallshare.httputils.request.RequestCall;
import com.yy.smallshare.listener.IHttpRequestCallback;

import java.util.Map;

import okhttp3.Call;

/**
 * Created by Administrator on 2016/3/2.
 */
public class HttpRequest {

//    private static RequestCall build;

    public static void okHttpRequest(String type, String url, Map<String, String> params, final IHttpRequestCallback callback) {
        RequestCall build = null;
        if (type.equals("POST")) {
            build = OkHttpUtils.post().url(url).params(params).build();
        }
        if (type.equals("GET")) {
            build = OkHttpUtils.get().url(url).params(params).build();
        }
        build.execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {
                callback.onRequestFailed();
            }

            @Override
            public void onResponse(String response) {
                callback.onRequestSuccess(response);
            }
        });
    }
}
