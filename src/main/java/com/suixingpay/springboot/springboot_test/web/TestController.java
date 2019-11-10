package com.suixingpay.springboot.springboot_test.web;

import com.suixingpay.springboot.springboot_test.service.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private RegisterServiceImpl registerService;

    @RequestMapping("getResult")
    public String home(){

        return registerService.getPassword("456");
//        registerService.getPassword("yutao")
    }
}
