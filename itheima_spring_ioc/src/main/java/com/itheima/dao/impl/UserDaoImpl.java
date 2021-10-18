package com.itheima.dao.impl;

import com.itheima.dao.UserDao;

public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
        System.out.println("UserDaoImpl创建...");
    }

    @Override
    public void save() {
        System.out.println("save running...");
    }
}
