package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicecloudProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudProviderDept8001Application.class, args);
    }

}
