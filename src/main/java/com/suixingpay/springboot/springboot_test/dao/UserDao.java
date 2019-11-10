package com.suixingpay.springboot.springboot_test.dao;

import com.suixingpay.springboot.springboot_test.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao{

    User findById(String id);

}