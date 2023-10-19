package org.study.coupon.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

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
    @Bean
    @LoadBalanced
    public WebClient.Builder register() {
        return WebClient.builder();
    }

}
