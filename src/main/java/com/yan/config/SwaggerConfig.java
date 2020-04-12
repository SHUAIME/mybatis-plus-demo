package com.yan.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @Author: yan
 * @Date: 2020/4/11 10:39
 * @Description: com.yan.config
 * @version: 1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    //配置文档信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("帅me", "http://shuaime.top", "1427550725@qq.com");
        return new ApiInfo(
                "帅me的API文档", // 标题
                "即使再小的舫也能远航", // 描述
                "v1.0", // 版本
                "http://shuaime.top", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "http://www.apache.org/licenses/LICENSE-2.0", // 许可连接
                new ArrayList<>()// 扩展
        );
    }
}
