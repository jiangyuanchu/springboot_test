package com.suixingpay.springboot.springboot_test.service;

import com.suixingpay.springboot.springboot_test.entity.User;
import com.suixingpay.springboot.springboot_test.entity.UserDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDomain domain;

    public User getUser(String id) {
        return domain.findById(id);
    }

}

