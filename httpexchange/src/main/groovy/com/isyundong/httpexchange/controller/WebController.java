package com.isyundong.httpexchange.controller;

import com.isyundong.httpexchange.dto.UserInfoDTO;
import com.isyundong.httpexchange.exchange.SimpleExchange;
import jakarta.annotation.Resource;
import org.apache.groovy.util.Maps;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.UUID;

@RestController
@RequestMapping("/web")
public class WebController {

    @Resource
    private SimpleExchange simpleExchange;

    @GetMapping("/uuid")
    public String uuid() {
        return simpleExchange.getId();
    }

    @GetMapping("/userInfo/{uId}")
    public UserInfoDTO userInfo(@PathVariable("uId") String uId) {
        return simpleExchange.getUserInfo(new UserInfoDTO(uId));
    }
}
