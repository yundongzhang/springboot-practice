package com.isyundong.simpleserver.controller;


import com.isyundong.simpleserver.dto.UserInfoDTO;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/simple")
public class SimpleController {

    @GetMapping("/getId")
    public String getId() {
        return UUID.randomUUID().toString();
    }

    @PostMapping("/getUserInfo")
    public UserInfoDTO getUserInfo(@RequestBody UserInfoDTO uInfo) {
        return new UserInfoDTO(uInfo.getuId(), "张三");
    }

}
