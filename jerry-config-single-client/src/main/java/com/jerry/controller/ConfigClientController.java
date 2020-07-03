package com.jerry.controller;

import com.jerry.config.GitAutoRefreshConfig;
import com.jerry.config.GitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author ：yantx
 * @version ： 1.0
 * @date ：2020/6/18 0:14
 * @description：
 */
@RestController
@RefreshScope
@RequestMapping("a")
public class ConfigClientController {

    @Autowired
    private GitConfig gitConfig;

    @Autowired
    private GitAutoRefreshConfig gitAutoRefreshConfig;

    @GetMapping("show")
    public Object show(){
        return gitConfig;
    }

    @GetMapping("autoShow")
    public Object autoShow(){
        return gitAutoRefreshConfig;
    }
}
