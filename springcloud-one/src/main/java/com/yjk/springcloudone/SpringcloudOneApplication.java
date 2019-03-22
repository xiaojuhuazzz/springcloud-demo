/*
    测试1
    springcloud服务注册中心
    时间：2019-3-21
 */
package com.yjk.springcloudone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
// 允许使用Eureka服务
@EnableEurekaServer
public class SpringcloudOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudOneApplication.class, args);
    }

}
