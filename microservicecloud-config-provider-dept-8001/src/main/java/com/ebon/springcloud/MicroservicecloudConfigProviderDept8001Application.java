package com.ebon.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroservicecloudConfigProviderDept8001Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConfigProviderDept8001Application.class, args);
    }

}
