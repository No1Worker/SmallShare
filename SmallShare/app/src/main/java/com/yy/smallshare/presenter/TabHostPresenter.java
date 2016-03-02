package com.yy.smallshare.presenter;

import android.widget.TabHost;

import com.yy.smallshare.bean.Tab;
import com.yy.smallshare.listener.ITabHostView;
import com.yy.smallshare.model.TabHostImpl;
import com.yy.smallshare.utils.FragmentTabHost;

import java.util.List;

/**
 * Created by ysm on 2016/3/2.
 * 处理TabHostView和TabHostModel的交互
 */
public class TabHostPresenter {

    private TabHostImpl mTabHostData;
    private ITabHostView tabHostView;

    public TabHostPresenter(ITabHostView tabHostView) {
        mTabHostData = new TabHostImpl();
        this.tabHostView = tabHostView;
    }

    public void tabHostResult(FragmentTabHost mFragmentTabHost) {
        List<Tab> mTabDatas = mTabHostData.tabList();
        for (Tab tab : mTabDatas) {
            TabHost.TabSpec tabSpec = mFragmentTabHost.newTabSpec(tab.getTitle());
            tabSpec.setIndicator(tabHostView.buildIndicator(tab));
            mFragmentTabHost.addTab(tabSpec, tab.getFragment(), null);
        }
    }
}
