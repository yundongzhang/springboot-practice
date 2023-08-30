package com.isyundong.simpleserver.dto;

import lombok.Data;

import java.io.Serializable;

public class UserInfoDTO implements Serializable {

    private String uId;

    private String uName;

    public UserInfoDTO(String uId, String uName) {
        this.uId = uId;
        this.uName = uName;
    }

    public String getuId() {
        return uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
}
