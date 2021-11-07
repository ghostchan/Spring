package com.itheima.mapper;

import com.itheima.domain.User;

import java.util.List;

public interface UserMapper {

    public void save(User user);

    public void update(User user);

    public void delete(int id);

    public User findById(int id);

    public List<User> findAll();
}
