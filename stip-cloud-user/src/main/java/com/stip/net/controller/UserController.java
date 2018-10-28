package com.stip.net.controller;

import com.stip.net.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    public RedisService redisService;

    @RequestMapping("/index/{name}")
    public String index(@PathVariable("name") String name) {
        return redisService.hello(name);
    }
}
