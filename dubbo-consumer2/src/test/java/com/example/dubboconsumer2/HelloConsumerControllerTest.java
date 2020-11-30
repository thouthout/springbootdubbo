package com.example.dubboconsumer2;

import com.alibaba.dubbo.config.annotation.Reference;
import com.limi.api.HelloService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author luweiming
 * @date 2020/11/30 5:14 下午
 */
@SpringBootTest
public class HelloConsumerControllerTest {

    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    @Test
    void sayHello() {
        String hello = helloService.sayHello("hello");
        System.out.println(hello);
    }

}
