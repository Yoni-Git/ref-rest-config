package com.server.config.cloud.serverconfigcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServerconfigcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerconfigcloudApplication.class, args);
    }
}
