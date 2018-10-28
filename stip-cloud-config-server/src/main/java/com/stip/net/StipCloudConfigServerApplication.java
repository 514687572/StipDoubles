package com.stip.net;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class StipCloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StipCloudConfigServerApplication.class, args);
    }
}
