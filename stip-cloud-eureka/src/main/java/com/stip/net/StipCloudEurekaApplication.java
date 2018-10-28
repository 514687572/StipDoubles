package com.stip.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StipCloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(StipCloudEurekaApplication.class, args);
    }
}
