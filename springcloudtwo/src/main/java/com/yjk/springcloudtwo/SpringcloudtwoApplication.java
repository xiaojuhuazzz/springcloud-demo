/*
    测试2
    springcloud服务提供
    时间：2019-3-21
 */
package com.yjk.springcloudtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
// 添加注释后，项目就具有了服务注册的功能。
// 启动工程后，就可以在注册中心的页面看到SPRING-CLOUD-PRODUCER服务。
@EnableDiscoveryClient
// @EnableDiscoveryClient与@EnableEurekaClient 功能相近
// 一般若注册中心为Eureka 则用后者
// 若注册中心是其他 则用第一个
public class SpringcloudtwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudtwoApplication.class, args);
    }

}
