package com.yy.smallshare.bean;

import java.io.Serializable;

/**
 * Created by Jaron Yu on 2016/3/15.
 */
public class MessageBasicData implements Serializable{
    private String vfid;
    private String tovfid;

    public String getVfid() {
        return vfid;
    }

    public void setVfid(String vfid) {
        this.vfid = vfid;
    }

    public String getTovfid() {
        return tovfid;
    }

    public void setTovfid(String tovfid) {
        this.tovfid = tovfid;
    }
}
