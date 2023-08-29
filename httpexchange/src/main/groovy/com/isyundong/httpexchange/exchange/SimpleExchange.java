package com.isyundong.httpexchange.exchange;


import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/simple", accept = "application/json", contentType = "application/json")
public interface SimpleExchange {

    @GetExchange("/getId")
    String getId();

}
