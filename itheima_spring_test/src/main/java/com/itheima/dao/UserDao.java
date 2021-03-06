package com.itheima.dao;

import com.itheima.domain.Role;
import com.itheima.domain.User;

import java.util.List;

public interface UserDao {

    List<User> findAll();

    List<Role> findRoleByUserId(Long id);

    Long save(User user);

    void saveUserRoleRel(Long id, Long[] roleIds);

    void delUserRoleRel(Long userId);

    void del(Long userId);
}
