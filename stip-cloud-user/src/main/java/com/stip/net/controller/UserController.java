package com.stip.net.controller;

import com.stip.net.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class UserController {
    @Autowired
    public RedisService redisService;

    @Value("${name}")
    private String name;

    @RequestMapping("/index")
    public String index() {
        return redisService.hello(this.name);
    }
}
