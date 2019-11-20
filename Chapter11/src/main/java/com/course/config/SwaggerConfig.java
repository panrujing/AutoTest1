package com.course.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * created by panrujing on 2019/11/15.
 */
@Configuration   // 加载配置文件
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")   //配置路径
                .select()    //选择目录
                .paths(PathSelectors.regex("/.*"))   //选择路径
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("我的测试接口")
                .build();
    }
}
