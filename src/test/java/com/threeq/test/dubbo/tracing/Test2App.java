package com.threeq.test.dubbo.tracing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @Date 2017/2/8
 * @User three
 */
//@SpringBootApplication
//@ComponentScan//组件扫描
@Configuration//配置控制
@EnableAutoConfiguration//启用自动配置
@ImportResource({"file:src/test/java/resources/spring/dubbo-demo-service2-provider.xml"})
public class Test2App {
    public static void main(String[] args) {
        SpringApplication.run(Test2App.class, args);
    }

}