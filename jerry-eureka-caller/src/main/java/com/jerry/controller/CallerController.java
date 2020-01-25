package com.jerry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @Author ：yantx
 * @Date ：19:09 2019-12-10
 * @Description：服务调用测试API
 * @Version : 1.0
 */
@RestController
@RequestMapping(path = "call")
public class  CallerController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/say")
    public Object call(){
        return restTemplate.getForObject("http://eureka-provider/provider/", Map.class);
    }
}
