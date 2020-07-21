package com.swaggerui.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.nio.file.Path;
import java.util.ArrayList;

/**
 * @author xiaolong
 * @create 2020-07-19 22:32
 * @description swagger-ui主页面信息配置
 */
@Configuration
@EnableSwagger2
@EnableKnife4j
public class SwaggerConfig {

//    设置分组
//    @Bean
//    public Docket dockethello(){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                /*忽略掉一些不是外部传入的参数
//                .ignoredParameterTypes()
//                 */
//                .ignoredParameterTypes(HttpSession.class, HttpServletRequest.class, HttpServletResponse.class)
//                //设置分组
//                .groupName("你好")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.swaggerui.controller"))
//                //配置过滤器，过滤选定路径的请求
//                .paths(PathSelectors.ant("/hello/**"))
//                .build();
//                /*默认为true,正常显示;设置为false,则不显示swagger文档
//                .enable()
//                 */
//    }
//
//    @Bean
//    public Docket docketuser(){
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                .ignoredParameterTypes(HttpServletRequest.class,HttpServletResponse.class,HttpSession.class)
//                .groupName("用户")
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.swaggerui.controller"))
//                .paths(PathSelectors.ant("/user/**"))
//                .build();
//    }

    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                /*忽略一些内部调用的参数
                    .ignoredParameterTypes
                 */
                .ignoredParameterTypes(HttpSession.class,HttpServletRequest.class,HttpServletResponse.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.swaggerui.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        Contact contact=new Contact("codelong","www.codelong.com","1234567@qq.com");
        return new ApiInfo("Swagger接口文档",
                "下面是Swagger接口文档信息",
                "v1.0",
                "http://localhost:8080",
                contact,
                "",
                "",
                new ArrayList<>());
    }
}
