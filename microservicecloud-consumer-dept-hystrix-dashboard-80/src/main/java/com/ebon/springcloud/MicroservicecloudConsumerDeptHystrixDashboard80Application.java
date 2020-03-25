package com.ebon.springcloud;

import com.ebon.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "MICROSERVICECLOUD-DEPT-HYSTRIX",configuration = MySelfRule.class)
@EnableHystrixDashboard
public class MicroservicecloudConsumerDeptHystrixDashboard80Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicecloudConsumerDeptHystrixDashboard80Application.class, args);
    }

}
