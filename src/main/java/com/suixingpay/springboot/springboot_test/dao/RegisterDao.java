package com.suixingpay.springboot.springboot_test.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Mapper
public interface RegisterDao {
    String getPassword(String username);
}
