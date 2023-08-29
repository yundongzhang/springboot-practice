package com.isyundong.httpexchange.controller;

import com.isyundong.httpexchange.exchange.SimpleExchange;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
