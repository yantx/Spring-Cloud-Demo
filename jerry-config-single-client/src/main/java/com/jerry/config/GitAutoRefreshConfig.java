package com.jerry.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：yantx
 * @version ： 1.0
 * @date ：2020/6/18 0:09
 * @description：
 */
@Data
@Component
@ConfigurationProperties(prefix = "data")
public class GitAutoRefreshConfig {
    private static class UserInfo{
        private String userName;
        private String password;

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
        @Override
        public String toString() {
            return "UserInfo{" +
                    "userName='" + userName + '\'' +
                    ", password='" + password + '\'' +
                    '}';
        }
    }
    private String env;
    private UserInfo user;

}
