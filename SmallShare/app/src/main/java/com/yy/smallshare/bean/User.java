package com.yy.smallshare.bean;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by Jaron Yu on 2016/3/8.
 */
public class User implements Serializable{

    /*
	 * �û���������
	 */
    private Long _id;
    /*
     * �û����
     */
    private String userId;
    /*
     * �û���
     */
    private String userName;
    /*
     * ��Ȩ��token����
     */
    private String token;

    /*
     * ��Ȩ��token����Կ����Oauth2��ʹ�ò�����ֻ����1.0����Ҫ�õ��ġ�
     */
    private String tokenSecret;

    //---------------mAccessToken--------------uid: 2230213540, access_token: 2.00I7kv7CdWjoND51a271cdb5LjvzJB, refresh_token: , expires_in: 1545935263760
	/*
	 * ˢ�����ƣ���token���ں󣬿���ʹ��ˢ���������滻token���ô����ӳ���Ȩʱ�䡣
	 */
    private String refreshToken;
    /*
     * ��Ȩ����ʱ�䡣
     */
    private Long expiressIn;
    /*
     * �û���������Ϣ��
     */
    private String description;
    /*
     * �û���ͼ�ꡣ
     */
    private Drawable userIcon;

    /*
     * ��˿��
     */
    private Long followers_count ;
    /*
     * ��ע��
     */
    private Long friends_count ;
    /*
     * ΢������
     */
    private Long statuses_count  ;
    /*
     * �û�UID
     */
    private int id;
    /*
     * �ַ����͵��û�UID
     */
    private String idstr;
    /*
     * �û��ǳ�
     */
    private String screen_name;
    /*
     * �Ѻ���ʾ����
     */
    private String name;
    /*
     * �û�����ʡ��ID
     */
    private int province;
    /*
     * �û����ڳ���ID
     */
    private int city;
    /*
     * �û����ڵ�
     */
    private String location;
    /*
     * �û����͵�ַ
     */
    private String url;
    /*
     * �û�ͷ���ַ����ͼ����50��50����
     */
    private String profile_image_url;
    /*
     * �û���΢��ͳһURL��ַ
     */
    private String profile_url ;
    /*
     * �û��ĸ��Ի�����
     */
    private String domain;
    /*
     * �û���΢��
     */
    private String weihao;
    /*
     * �Ա�m���С�f��Ů��n��δ֪
     */
    private String gender;
    /*
     * �ղ���
     */
    private int favourites_count;
    /*
     * �û�������ע�ᣩʱ��
     */
    private String created_at;
    /*
     * �Ƿ����������˸��ҷ�˽�ţ�true���ǣ�false����
     */
    private boolean allow_all_act_msg ;
    /*
     * �Ƿ������ʶ�û��ĵ���λ�ã�true���ǣ�false����
     */
    private boolean geo_enabled ;
    /*
     * �Ƿ���΢����֤�û�������V�û���true���ǣ�false����
     */
    private String verified;
    /*
     * �û���ע��Ϣ��ֻ���ڲ�ѯ�û���ϵʱ�ŷ��ش��ֶ�
     */
    private String remark ;
    /*
     * �û������һ��΢����Ϣ�ֶ�
     */
    private Weibo weibo;
    /*
     * �Ƿ����������˶��ҵ�΢���������ۣ�true���ǣ�false����
     */
    private boolean allow_all_comment ;
    /*
     * �û�ͷ���ַ����ͼ����180��180����
     */
    private String avatar_large;

    /*
     * �û�ͷ���ַ�����壩������ͷ��ԭͼ
     */
    private String avatar_hd ;
    /*
     * ��֤ԭ��
     */
    private String verified_reason ;
    /*
     * ���û��Ƿ��ע��ǰ��¼�û���true���ǣ�false����
     */
    private boolean follow_me;
    /*
     * �û�������״̬��0�������ߡ�1������
     */
    private int online_status ;



    /*
     * �û��Ļ�����
     */
    private int bi_followers_count ;
    /*
     * �û���ǰ�����԰汾��zh-cn���������ģ�zh-tw���������ģ�en��Ӣ��
     */
    private String lang ;

    private Drawable ssmall_icon;

    private Drawable ico;

    /*
     * ��ǰ��¼�û��Ƿ��ע���û���true���ǣ�false����
     */
    private boolean following;
    /*
     * �û������һ��΢��ID
     */
    private int status_id;


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

    public Drawable getUserIcon() {
        return userIcon;
    }

    public void setUserIcon(Drawable userIcon) {
        this.userIcon = userIcon;
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

    public Drawable getSsmall_icon() {
        return ssmall_icon;
    }

    public void setSsmall_icon(Drawable ssmall_icon) {
        this.ssmall_icon = ssmall_icon;
    }

    public Drawable getIco() {
        return ico;
    }

    public void setIco(Drawable ico) {
        this.ico = ico;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    @Override
    public String toString() {
        return "WeiboInfo [id=" + id + ", status_id=" + status_id + " , username=" + userName +"]";
    }
}
