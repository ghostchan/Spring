package com.itheima.controller;

import com.itheima.domain.Role;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/role")
public class RoleController {

    private RoleService roleService;

    public void setRoleService(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("/list")
    public ModelAndView list() {
        ModelAndView modelAndView = new ModelAndView();
        List<Role> roleList = roleService.list();
        modelAndView.addObject("roleList", roleList);
        //设置视图
        modelAndView.setViewName("role-list");
        return modelAndView;
    }
}
