package com.yy.smallshare.httputils.callback;

import java.io.IOException;

import okhttp3.Response;

/**
 * Created by Jaron Yu on 2016/2/29.
 */
public abstract class StringCallback extends Callback<String>{
    @Override
    public String parseNetworkResponse(Response response) throws IOException
    {
        return response.body().string();
    }

}
