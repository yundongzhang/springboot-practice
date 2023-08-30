package com.isyundong.httpexchange.exchange;


import com.isyundong.httpexchange.dto.UserInfoDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;
import org.springframework.web.service.annotation.PostExchange;


@HttpExchange(url = "/simple", accept = "application/json", contentType = "application/json")
public interface SimpleExchange {

    @GetExchange("/getId")
    String getId();

    @PostExchange("/getUserInfo")
    UserInfoDTO getUserInfo(@RequestBody UserInfoDTO uInfo);
}
