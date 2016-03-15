package com.yy.smallshare.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 除位置消息之外的所有消息都可以使用此类。注意，Text类型消息data为空
 * Created by Jaron Yu on 2016/3/15.
 */
public class MessageBasic extends Message implements Serializable{
    private List<MessageBasicData> data;

    public List<MessageBasicData> getData() {
        return data;
    }

    public void setData(List<MessageBasicData> data) {
        this.data = data;
    }
}
