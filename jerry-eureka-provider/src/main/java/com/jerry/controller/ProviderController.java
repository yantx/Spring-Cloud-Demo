package com.jerry.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author ：yantx
 * @Date ：9:52 2019-12-11
 * @Description：服务提供测试API
 * @Version : 1.0
 */
@Slf4j
@RestController
@RequestMapping(path = "provider")
public class ProviderController {

    @RequestMapping("/")
    public Map<String, String> hello(){
        Map<String,String> resMap = new HashMap<>();
        resMap.put("result","hello world!!!");
        return resMap;
    }
}
