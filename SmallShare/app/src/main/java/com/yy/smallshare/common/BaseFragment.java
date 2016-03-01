package com.yy.smallshare.common;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ysm on 2016/3/1.
 */
public abstract class BaseFragment extends Fragment {
    public Activity mActivity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivity = getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return initView();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
        initLitener();
    }

    /**
     * 加载视图
     *
     * @return
     */
    public abstract View initView();

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
    public void initLitener() {
    }
}
