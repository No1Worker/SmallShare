package com.yy.smallshare.bean;

import java.io.Serializable;

/**
 * 基本消息字段
 * Created by Jaron Yu on 2016/3/15.
 */
public class Message implements Serializable{
    private String type;//消息类型
    private String receiver_id;//消息的接收者
    private String sender_id;//消息的发送者
    private String created_at;//消息创建时间
    private String text;//消息内容

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
