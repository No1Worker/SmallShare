package com.yy.smallshare.model;

import android.content.Context;

import com.yy.smallshare.bean.User;
import com.yy.smallshare.listener.OnAuthListener;

/**
 * Created by Jaron Yu on 2016/3/8.
 */
public interface IOauthModel {
    void auth(Context context,User user,OnAuthListener onAuthListener);
}
