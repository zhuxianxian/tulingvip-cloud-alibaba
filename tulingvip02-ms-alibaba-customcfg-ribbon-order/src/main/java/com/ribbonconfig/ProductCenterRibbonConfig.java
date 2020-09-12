package com.ribbonconfig;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by smlz on 2019/11/20.
 * 写在启动类上一层目录，不能被启动类扫描到，扫到了就变成了全局配置
 */
@Configuration
public class ProductCenterRibbonConfig {

    @Bean
    public IRule randomRule() {
        return new RandomRule();//随机策略
    }
}
