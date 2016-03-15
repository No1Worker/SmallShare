package com.yy.smallshare.common;

/**
 * Created by Jaron Yu on 2016/2/27.
 */
public class Constants {
    /** 当前应用的 APP_KEY，第三方应用应该使用自己的 APP_KEY 替换该 APP_KEY */
    public static final String APP_KEY = "544123567";

    /**
     * 当前应用的APP_SECRET, 第三方应用应该使用自己的APP_SECRET替换 APP_SECRET
     */
    public static final String APP_SECRET = "c083d8b85ceb3f7da0be15b1ee085948";

    /**
     * 当前应用的回调页，第三方应用可以使用自己的回调页。
     *
     * <p>
     * 注：关于授权回调页对移动客户端应用来说对用户是不可见的，所以定义为何种形式都将不影响，
     * 但是没有定义将无法使用 SDK 认证登录。
     * 建议使用默认回调页：https://api.weibo.com/oauth2/default.html
     * </p>
     */
    public static final String REDIRECT_URL = "https://api.weibo.com/oauth2/default.html";
    /**
     * Scope 是 OAuth2.0 授权机制中 authorize 接口的一个参数。通过 Scope，平台将开放更多的
     * 微博核心功能给开发者，同时也加强用户隐私保护，提升了用户体验，用户在新 OAuth2.0 授权
     * 页中有权利选择赋予应用的功能。
     * 我们通过新浪微博开放平台-->管理中心-->我的应用-->接口管理处，能看到我们目前已有哪些接
     * 口的使用权限，高级权限需要进行申请。
     * 目前 Scope 支持传入多个 Scope 权限，用逗号分隔。
     *
     * 有关哪些 OpenAPI 需要权限申请，请查看：http://open.weibo.com/wiki/%E5%BE%AE%E5%8D%9AAPI
     * 关于 Scope 概念及注意事项，请查看：http://open.weibo.com/wiki/Scope
     */
    public static final String SCOPE = "email,direct_messages_read,direct_messages_write,"
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
