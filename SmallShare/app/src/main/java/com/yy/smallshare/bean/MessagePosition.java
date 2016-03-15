package com.yy.smallshare.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 位置消息。包含经纬度字段
 * Created by Jaron Yu on 2016/3/15.
 */
public class MessagePosition extends Message implements Serializable {
    private List<MessagePositionData> data;

    public List<MessagePositionData> getData() {
        return data;
    }

    public void setData(List<MessagePositionData> data) {
        this.data = data;
    }
}
