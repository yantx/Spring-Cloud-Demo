package com.jerry.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author ：yantx
 * @version ： 1.0
 * @date ：2020/6/18 0:05
 * @description：
 */
@Data
@Component
public class GitConfig {
    @Value("${data.env}")
    private String env;

    @Value("${data.user.username}")
    private String userName;

    @Value("${data.user.password}")
    private String password;
}
