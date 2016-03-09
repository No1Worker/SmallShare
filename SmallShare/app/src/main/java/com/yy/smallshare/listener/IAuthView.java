package com.yy.smallshare.listener;

import com.yy.smallshare.bean.User;

import java.util.Map;

/**
 * Created by Jaron Yu on 2016/3/9.
 */
public interface IAuthView {
    User getAuthUserParams();
    void putAuthParams(Map<String,Object> params);
    void toMainActivity();
    void showLoading();
    void hideLoading();
}
