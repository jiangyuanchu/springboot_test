package com.suixingpay.springboot.springboot_test.service;

import com.suixingpay.springboot.springboot_test.dao.RegisterDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements register {
    @Autowired
    private RegisterDao registerDao;

    @Override
    public String getPassword(String username) {

        return registerDao.getPassword(username);
    }
}
