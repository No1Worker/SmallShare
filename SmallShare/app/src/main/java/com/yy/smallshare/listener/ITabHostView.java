package com.yy.smallshare.listener;

import android.view.View;

import com.yy.smallshare.bean.Tab;

/**
 * Created by ysm on 2016/3/2.
 * TabHost的视图
 */
public interface ITabHostView {

    View buildIndicator(Tab tab);
}
