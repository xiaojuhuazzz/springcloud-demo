/*
    springcloud-test4
    测试zuul路由
    网关
    时间：2019-3-28
 */

package com.yjk.springcloudfour;

import com.yjk.springcloudfour.filter.TokenFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//支持网关路由
@EnableZuulProxy
public class SpringcloudFourApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudFourApplication.class, args);
    }

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
    /*
        测试
        输入 http://localhost:8888/spring-cloud-producer/hello?name=a
        返回 token is empty
        输入 http://localhost:8888/spring-cloud-producer/hello?name=a&token=xx
        返回 hello a，this is first message
     */
}
