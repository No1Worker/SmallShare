package com.yy.smallshare.model;

import com.yy.smallshare.R;
import com.yy.smallshare.bean.Tab;
import com.yy.smallshare.common.Constants;
import com.yy.smallshare.module.fragment.DiscoverFragment;
import com.yy.smallshare.module.fragment.HomeFragment;
import com.yy.smallshare.module.fragment.MenuFragment;
import com.yy.smallshare.module.fragment.MessageFragment;
import com.yy.smallshare.module.fragment.MineFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ysm on 2016/3/2.
 */
public class TabHostImpl implements ITabHostModel {

    @Override
    public List<Tab> tabList() {
        List<Tab> mTabDatas = new ArrayList<>();
        Tab homeTab = new Tab(Constants.TAB_HONE, R.drawable.selector_icon_home, HomeFragment.class);
        Tab messageTab = new Tab(Constants.TAB_MESSAGE, R.drawable.selector_icon_message, MessageFragment.class);
        Tab menuTab = new Tab("", R.drawable.selector_icon_compose, MenuFragment.class);
        Tab discoverTab = new Tab(Constants.TAB_DISCOVER, R.drawable.selector_icon_discover, DiscoverFragment.class);
        Tab mineTab = new Tab(Constants.TAB_MINE, R.drawable.selector_icon_mine, MineFragment.class);

        mTabDatas.add(homeTab);
        mTabDatas.add(messageTab);
        mTabDatas.add(menuTab);
        mTabDatas.add(discoverTab);
        mTabDatas.add(mineTab);
        return mTabDatas;
    }
}
