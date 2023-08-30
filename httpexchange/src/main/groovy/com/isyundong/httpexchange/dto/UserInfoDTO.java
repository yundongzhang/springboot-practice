package com.isyundong.httpexchange.dto;

import lombok.Data;

import java.io.Serializable;

public class UserInfoDTO implements Serializable {

    private String uId;

    private String uName;

    public UserInfoDTO() {
    }

    public UserInfoDTO(String uId) {
        this.uId = uId;
    }

    public String getuId() {
        return uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
