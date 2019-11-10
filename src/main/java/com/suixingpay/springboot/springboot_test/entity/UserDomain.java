package com.suixingpay.springboot.springboot_test.entity;

import com.suixingpay.springboot.springboot_test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.stereotype.Component;

@Component
@EnableCaching
@CacheConfig(cacheNames = "user")
public class UserDomain {

    @Autowired
    public UserDao dao;

    @Cacheable(value="id=", key="#id")
    public User findById(String id) {
        return dao.findById(id);
    }

}

