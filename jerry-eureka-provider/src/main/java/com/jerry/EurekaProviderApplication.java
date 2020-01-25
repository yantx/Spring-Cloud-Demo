package com.jerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author ：yantx
 * @Date ：16:51 2019-12-10
 * @Description：服务提供者
 * @Version : 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaProviderApplication.class,args);
    }
}
