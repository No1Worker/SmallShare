package com.yy.smallshare.common;

import android.text.SpannableString;

/**
 * Created by Jaron Yu on 2016/3/9.
 */
public interface WeiboUrl {
    /*
    *获取用户信息
     */
    String GET_USER = "https://api.weibo.com/2/users/show.json";

     /*查看（下载）认证用户接收到的语音方法一(查看图片一样)
        curl "https://upload.api.weibo.com/2/mss/msget?access_token=RECIPIENT_ACCESS_TOKEN&fid=TOVFID"
        1."RECIPIENT_ACCESS_TOKEN"：返回结果中接收者（recipient_id）通过OAuth2授权返回的access_token；
        2."TOVFID"：返回结果data字段中的tovfid。
        */
    String UPLOAD_MESSAGE_DATA="https://upload.api.weibo.com/2/mss/msget";

}



