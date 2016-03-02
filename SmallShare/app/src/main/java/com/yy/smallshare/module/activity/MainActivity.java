package com.yy.smallshare.module.activity;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yy.smallshare.R;
import com.yy.smallshare.bean.Tab;
import com.yy.smallshare.common.BaseActivity;
import com.yy.smallshare.listener.ITabHostView;
import com.yy.smallshare.presenter.TabHostPresenter;
import com.yy.smallshare.utils.FragmentTabHost;

public class MainActivity extends BaseActivity implements ITabHostView {
    private LayoutInflater mInflater = null;
    private FragmentTabHost mFragmentTabHost = null;
    private TabHostPresenter tabHostPresenter = null;

    @Override
    public void initContentView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    public void initView() {
        mInflater = LayoutInflater.from(this);
        mFragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.tab_content);

    }

    @Override
    public void initData() {
        super.initData();
        tabHostPresenter = new TabHostPresenter(this);
        tabHostPresenter.tabHostResult(mFragmentTabHost);
        mFragmentTabHost.getTabWidget().setShowDividers(LinearLayout.SHOW_DIVIDER_NONE);
        mFragmentTabHost.setCurrentTab(0);
    }

    @Override
    public View buildIndicator(Tab tab) {
        View view = mInflater.inflate(R.layout.tab_indicator, null);
        ImageView img = (ImageView) view.findViewById(R.id.tab_indicator_icon);
        img.setBackgroundResource(tab.getIcon());
        TextView tv = (TextView) view.findViewById(R.id.tab_indicator_txt);
        if (!tab.getTitle().equals("")) {
            tv.setText(tab.getTitle());
        } else {
            tv.setVisibility(View.GONE);
        }
        return view;
    }
}
