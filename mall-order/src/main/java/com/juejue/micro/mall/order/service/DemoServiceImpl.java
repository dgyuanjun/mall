package com.juejue.micro.mall.order.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.juejue.micro.mall.DemoService;


/**
 * @author yuanjun
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public void sayHello(String name) {
        System.out.println("hello" + name);
    }
}
