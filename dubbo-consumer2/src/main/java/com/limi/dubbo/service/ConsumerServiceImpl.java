package com.limi.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.limi.api.ConsumerService;

/**
 * @author luweiming
 * @date 2020/11/30 2:00 下午
 */
@Service(version = "${demo.service.version}")
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public String comsumerMessage(String name) {
        return name;
    }
}
