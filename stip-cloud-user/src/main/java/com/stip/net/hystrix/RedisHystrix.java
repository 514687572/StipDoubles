package com.stip.net.hystrix;

import com.stip.net.service.RedisService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class RedisHystrix implements RedisService {

    @Override
    public String hello(@RequestParam String name) {
        return "hello " + name + "，service biz";
    }
}
