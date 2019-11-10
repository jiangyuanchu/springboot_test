package com.suixingpay.springboot.springboot_test.web;

import com.suixingpay.springboot.springboot_test.entity.User;
import com.suixingpay.springboot.springboot_test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping("/getUser/{id}")
    public User getUser(@PathVariable String id) {
        return service.getUser(id);
    }
}

