package com.yy.smallshare.listener;

/**
 * Created by Administrator on 2016/3/2.
 */
public interface IHttpRequestCallback {
    void onRequestSuccess(String response);

    void onRequestFailed();
}
