package com.yy.smallshare.bean;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Jaron Yu on 2016/3/8.
 */
public class User implements Serializable{

    /*
	 * 用户表主键。
	 */
    private Long _id;
    /*
     * 用户编号
     */
    private String userId;
    /*
     * 用户名
     */
    private String userName;
    /*
     * 授权的token令牌
     */
    private String token;

    /*
     * 授权的token的密钥。在Oauth2中使用不到，只有在1.0中需要用到的。
     */
    private String tokenSecret;

    //---------------mAccessToken--------------uid: 2230213540, access_token: 2.00I7kv7CdWjoND51a271cdb5LjvzJB, refresh_token: , expires_in: 1545935263760
	/*
	 * 刷新令牌，在token过期后，可以使用刷新令牌来替换token，用此来延长授权时间。
	 */
    private String refreshToken;
    /*
     * 授权过期时间。
     */
    private Long expiressIn;
    /*
     * 用户的描述信息。
     */
    private String description;
    /*
     * 用户的图标。
     */
    private Drawable userIcon;

    /*
     * 粉丝数
     */
    private Long followers_count ;
    /*
     * 关注数
     */
    private Long friends_count ;
    /*
     * 微博数。
     */
    private Long statuses_count  ;
    /*
     * 用户UID
     */
    private int id;
    /*
     * 字符串型的用户UID
     */
    private String idstr;
    /*
     * 用户昵称
     */
    private String screen_name;
    /*
     * 友好显示名称
     */
    private String name;
    /*
     * 用户所在省市ID
     */
    private int province;
    /*
     * 用户所在城市ID
     */
    private int city;
    /*
     * 用户所在地
     */
    private String location;
    /*
     * 用户博客地址
     */
    private String url;
    /*
     * 用户头像地址（中图），50×50像素
     */
    private String profile_image_url;
    /*
     * 用户的微博统一URL地址
     */
    private String profile_url ;
    /*
     * 用户的个性化域名
     */
    private String domain;
    /*
     * 用户的微号
     */
    private String weihao;
    /*
     * 性别，m：男、f：女、n：未知
     */
    private String gender;
    /*
     * 收藏数
     */
    private int favourites_count;
    /*
     * 用户创建（注册）时间
     */
    private String created_at;
    /*
     * 是否允许所有人给我发私信，true：是，false：否
     */
    private boolean allow_all_act_msg ;
    /*
     * 是否允许标识用户的地理位置，true：是，false：否
     */
    private boolean geo_enabled ;
    /*
     * 是否是微博认证用户，即加V用户，true：是，false：否
     */
    private String verified;
    /*
     * 用户备注信息，只有在查询用户关系时才返回此字段
     */
    private String remark ;
    /*
     * 用户的最近一条微博信息字段
     */
    private Weibo weibo;
    /*
     * 是否允许所有人对我的微博进行评论，true：是，false：否
     */
    private boolean allow_all_comment ;
    /*
     * 用户头像地址（大图），180×180像素
     */
    private String avatar_large;

    /*
     * 用户头像地址（高清），高清头像原图
     */
    private String avatar_hd ;
    /*
     * 认证原因
     */
    private String verified_reason ;
    /*
     * 该用户是否关注当前登录用户，true：是，false：否
     */
    private boolean follow_me;
    /*
     * 用户的在线状态，0：不在线、1：在线
     */
    private int online_status ;



    /*
     * 用户的互粉数
     */
    private int bi_followers_count ;
    /*
     * 用户当前的语言版本，zh-cn：简体中文，zh-tw：繁体中文，en：英语
     */
    private String lang ;

    private Drawable ssmall_icon;

    private Drawable ico;

    /*
     * 当前登录用户是否关注该用户，true：是，false：否
     */
    private boolean following;
    /*
     * 用户的最近一条微博ID
     */
    private int status_id;


    public int getStatus_id() {
        return status_id;
    }
    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }
    public boolean isFollowing() {
        return following;
    }
    public void setFollowing(boolean following) {
        this.following = following;
    }
    public Drawable getIco() {
        return ico;
    }
    public void setIco(Drawable ico) {
        this.ico = ico;
    }

    public Drawable getUserIcon() {
        return userIcon;
    }
    public void setUserIcon(Drawable userIcon) {
        this.userIcon = userIcon;
    }
    public Drawable getSmall_icon() {
        return ssmall_icon;
    }
    public void setSsmall_icon(Drawable ssmall_icon) {
        this.ssmall_icon = ssmall_icon;
    }
    public Long get_id() {
        return _id;
    }
    public void set_id(Long _id) {
        this._id = _id;
    }
    public String getUserId() {
        return userId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }
    public String getTokenSecret() {
        return tokenSecret;
    }
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }
    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    public Long getExpiressIn() {
        return expiressIn;
    }
    public void setExpiressIn(Long expiressIn) {
        this.expiressIn = expiressIn;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Long getFollowers_count() {
        return followers_count;
    }
    public void setFollowers_count(Long followers_count) {
        this.followers_count = followers_count;
    }
    public Long getFriends_count() {
        return friends_count;
    }
    public void setFriends_count(Long friends_count) {
        this.friends_count = friends_count;
    }
    public Long getStatuses_count() {
        return statuses_count;
    }
    public void setStatuses_count(Long statuses_count) {
        this.statuses_count = statuses_count;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getIdstr() {
        return idstr;
    }
    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }
    public String getScreen_name() {
        return screen_name;
    }
    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getProvince() {
        return province;
    }
    public void setProvince(int province) {
        this.province = province;
    }
    public int getCity() {
        return city;
    }
    public void setCity(int city) {
        this.city = city;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getProfile_image_url() {
        return profile_image_url;
    }
    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }
    public String getProfile_url() {
        return profile_url;
    }
    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }
    public String getDomain() {
        return domain;
    }
    public void setDomain(String domain) {
        this.domain = domain;
    }
    public String getWeihao() {
        return weihao;
    }
    public void setWeihao(String weihao) {
        this.weihao = weihao;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getFavourites_count() {
        return favourites_count;
    }
    public void setFavourites_count(int favourites_count) {
        this.favourites_count = favourites_count;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public boolean isAllow_all_act_msg() {
        return allow_all_act_msg;
    }
    public void setAllow_all_act_msg(boolean allow_all_act_msg) {
        this.allow_all_act_msg = allow_all_act_msg;
    }
    public boolean isGeo_enabled() {
        return geo_enabled;
    }
    public void setGeo_enabled(boolean geo_enabled) {
        this.geo_enabled = geo_enabled;
    }
    public String getVerified() {
        return verified;
    }
    public void setVerified(String verified) {
        this.verified = verified;
    }
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Weibo getWeibo() {
        return weibo;
    }
    public void setWeibo(Weibo weibo) {
        this.weibo = weibo;
    }
    public boolean isAllow_all_comment() {
        return allow_all_comment;
    }
    public void setAllow_all_comment(boolean allow_all_comment) {
        this.allow_all_comment = allow_all_comment;
    }
    public String getAvatar_large() {
        return avatar_large;
    }
    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }
    public String getAvatar_hd() {
        return avatar_hd;
    }
    public void setAvatar_hd(String avatar_hd) {
        this.avatar_hd = avatar_hd;
    }
    public String getVerified_reason() {
        return verified_reason;
    }
    public void setVerified_reason(String verified_reason) {
        this.verified_reason = verified_reason;
    }
    public boolean isFollow_me() {
        return follow_me;
    }
    public void setFollow_me(boolean follow_me) {
        this.follow_me = follow_me;
    }
    public int getOnline_status() {
        return online_status;
    }
    public void setOnline_status(int online_status) {
        this.online_status = online_status;
    }
    public int getBi_followers_count() {
        return bi_followers_count;
    }
    public void setBi_followers_count(int bi_followers_count) {
        this.bi_followers_count = bi_followers_count;
    }
    public String getLang() {
        return lang;
    }
    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "WeiboInfo [id=" + id + ", status_id=" + status_id + " , username=" + userName +"]";
    }
}
