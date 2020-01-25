package com.jerry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @Author ：yantx
 * @Date ：19:02 2019-12-10
 * @Description：服务消费者
 * @Version : 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class EurekaCallerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaCallerApplication.class,args);
    }
}
