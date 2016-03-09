package com.yy.smallshare.listener;

import com.yy.smallshare.bean.User;

/**
 * Created by Jaron Yu on 2016/3/9.
 */
public interface OnAuthListener {
    void getUserSucess(User user);
    void getUserFailed();
}
