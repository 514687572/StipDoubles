package com.stip.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class StipCloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(StipCloudZuulApplication.class, args);
    }

}

