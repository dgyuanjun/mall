package com.juejue.micro.mall.api;

import com.alibaba.dubbo.config.annotation.Reference;
import com.juejue.micro.mall.DemoService;
import org.springframework.stereotype.Service;

/**
 * @author yuanjun
 */
@Service
public class ConsumerService {

    @Reference(timeout = 3000, init = true)
    private DemoService demoService;

    public void demo(String name) {
        demoService.sayHello(name);
    }
}
