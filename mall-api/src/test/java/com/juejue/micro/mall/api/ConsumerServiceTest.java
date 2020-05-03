package com.juejue.micro.mall.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerServiceTest {

    @Resource
    private ConsumerService consumerService;
    @Test
    public void demo() {
        consumerService.demo("援军");
    }
}