package com.threeq.test.dubbo.tracing;

import com.threeq.test.dubbo.tracing.api.Service1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * @Date 2017/2/8
 * @User three
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(name = "TestService1Consumer",
        classes = Test0App.class,
        loader = SpringApplicationContextLoader.class)

//@RunWith(SpringRunner.class)
//@SpringBootTest(properties = {"spring.application.name=TestService1Consumer"})
//@ContextConfiguration(locations = {"classpath:spring/dubbo-demo-service1-consumer.xml"}, classes = TestApp.class)
public class TestService1Consumer {

    @Autowired
    Service1 service1;

    @Test
    public void testConsumer() {
        try {
            String name = UUID.randomUUID().toString();
            System.out.println("发送名字：  "+ name);

            String aaa = service1.hi(name);

            for(int i=0; i<5; i++) {
                System.out.println("等待测试提交数据。。。");
                Thread.sleep(3000);

            }

            System.out.println("测试完毕。。。  "+ aaa);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
