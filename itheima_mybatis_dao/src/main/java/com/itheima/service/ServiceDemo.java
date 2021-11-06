package com.itheima.service;

import com.itheima.dao.impl.UserMapperImpl;
import com.itheima.domain.User;

import java.io.IOException;
import java.util.List;

public class ServiceDemo {
    public static void main(String[] args) throws IOException {

        //创建dao层对象 当前dao层实现是手动编写的
        UserMapperImpl userMapper = new UserMapperImpl();
        List<User> all = userMapper.findAll();

        System.out.println(all);
    }
}
