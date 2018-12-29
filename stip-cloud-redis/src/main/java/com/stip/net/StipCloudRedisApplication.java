package com.stip.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.stip")
@EnableDiscoveryClient
@SpringBootApplication
public class StipCloudRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(StipCloudRedisApplication.class, args);
    }
}
