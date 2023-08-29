package com.isyundong.simpleserver.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping("/getId")
    public String getId() {
        return UUID.randomUUID().toString();
    }

}
