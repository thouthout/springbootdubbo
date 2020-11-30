package com.example.dubboprovider2;

import com.alibaba.dubbo.config.annotation.Service;
import com.limi.api.HelloService;

/**
 * @author luweiming
 * @date 2020/11/30 1:04 下午
 */
@Service(version = "${demo.service.version}")
public class HelloServiceImpl  implements HelloService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
