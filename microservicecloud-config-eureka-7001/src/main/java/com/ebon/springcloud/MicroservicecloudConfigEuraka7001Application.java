package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicecloudConfigEuraka7001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigEuraka7001Application.class, args);
    }

}
