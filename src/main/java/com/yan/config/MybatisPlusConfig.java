package com.yan.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: yan
 * @Date: 2020/4/12 15:14
 * @Description: com.yan.config
 * @version: 1.0
 */
@Configuration
public class MybatisPlusConfig {
    // 分页插件
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
