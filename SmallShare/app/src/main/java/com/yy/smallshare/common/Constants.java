package com.yy.smallshare.common;

/**
 * Created by Jaron Yu on 2016/2/27.
 */
public class Constants {
    /**
     * ��ǰ DEMO Ӧ�õ� APP_KEY��������Ӧ��Ӧ��ʹ���Լ��� APP_KEY �滻�� APP_KEY
     */
    public static final String APP_KEY = "2045436852";

    /**
     * ��ǰ DEMO Ӧ�õĻص�ҳ��������Ӧ�ÿ���ʹ���Լ��Ļص�ҳ��
     * ����ʹ��Ĭ�ϻص�ҳ��https://api.weibo.com/oauth2/default.html
     */
    public static final String REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";

    /**
     * WeiboSDKDemo Ӧ�ö�Ӧ��Ȩ�ޣ�������������һ�㲻��Ҫ��ô�࣬��ֱ�����óɿռ��ɡ�
     * ������鿴 Demo �ж�Ӧ��ע�͡�
     */
    public static final String SCOPE =
            "email,direct_messages_read,direct_messages_write,"
                    + "friendships_groups_read,friendships_groups_write,statuses_to_me_read,"
                    + "follow_app_official_microblog," + "invitation_write";

    //底部导航首页
    public static final String TAB_HONE = "首页";
    //底部导航消息
    public static final String TAB_MESSAGE = "消息";
    //底部导航发现
    public static final String TAB_DISCOVER = "发现";
    //底部导航我
    public static final String TAB_MINE = "我";
}
