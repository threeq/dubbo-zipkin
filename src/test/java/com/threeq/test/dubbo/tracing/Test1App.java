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
@ImportResource("file:src/test/java/resources/spring/dubbo-demo-service1-provider.xml")
@Configuration
@EnableAutoConfiguration
//@ComponentScan
public class Test1App {
    public static void main(String[] args) {
        SpringApplication.run(Test1App.class, args);
    }

}