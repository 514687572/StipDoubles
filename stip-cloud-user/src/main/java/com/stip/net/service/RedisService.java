package com.stip.net.service;


import com.stip.net.hystrix.RedisHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "stip-cloud-redis", fallback = RedisHystrix.class)
@Service
public interface RedisService {

    @RequestMapping(method = RequestMethod.POST, value = "/hello", consumes = "application/json")
    String hello(@RequestParam(value = "name") String name);

}
