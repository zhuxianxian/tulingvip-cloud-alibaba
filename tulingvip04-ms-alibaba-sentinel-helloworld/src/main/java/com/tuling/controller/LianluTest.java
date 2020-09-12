package com.tuling.controller;

import com.tuling.service.TestCommon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试sentinel 链路功能
 */
@RestController
public class LianluTest {
    @Autowired
    TestCommon testCommon;

    @RequestMapping("/testA")
    public String testA() {
        return testCommon.common();
    }

    @RequestMapping("/testB")
    public String testB() {
        return testCommon.common();
    }
}
