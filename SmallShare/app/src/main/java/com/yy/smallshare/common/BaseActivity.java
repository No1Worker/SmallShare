package com.yy.smallshare.common;

import android.os.Bundle;

import com.zhy.autolayout.AutoLayoutActivity;

/**
 * Created by ysm on 2016/3/1.
 */
public abstract class BaseActivity extends AutoLayoutActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initContentView();
        initView();
        initData();
        initListener();
    }

    /**
     * 加载布局
     */
    public abstract void initContentView();

    /**
     * 加载视图
     */
    public abstract void initView();

    /**
     * 初始化数据
     * 可以重写，也可以不重写
     */
    public void initData() {
    }

    /**
     * 初始化监听事件
     * 可以重写，也可以不重写
     */
    public void initListener() {
    }

}
