package com.example.dubboconsumer2;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@DubboComponentScan(basePackages = "com.**")
@EnableDubbo
@SpringBootApplication
public class DubboConsumer2Application {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumer2Application.class, args);
    }

}
