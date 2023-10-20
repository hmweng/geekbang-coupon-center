package org.study.coupon.customer;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author：jicai
 * @description：
 * @date：created in 2023/10/19 2:58 下午
 * @modified by:
 */
// Configuration注解声明配置类
@org.springframework.context.annotation.Configuration
public class Configuration {

    // 注册Bean并添加负载均衡功能
   /* @Bean
    @LoadBalanced
    public WebClient.Builder register() {
        return WebClient.builder();
    }*/

    @Bean
    Logger.Level feignLogger() {
        return Logger.Level.FULL;
    }

}
