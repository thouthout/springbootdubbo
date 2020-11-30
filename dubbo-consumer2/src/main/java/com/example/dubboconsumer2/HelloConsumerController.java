package com.example.dubboconsumer2;

import com.alibaba.dubbo.config.annotation.Reference;
import com.limi.api.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luweiming
 * @date 2020/11/30 1:16 下午
 */
@RestController
public class HelloConsumerController {

    @Reference(version = "${demo.service.version}")
    private HelloService helloService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        String result = helloService.sayHello(name);
        return result;
    }

}
