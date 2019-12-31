package com.cms.admin.controller;

import com.cms.admin.domain.master.SysUser;
import com.cms.admin.domain.slave.User;
import com.cms.admin.service.SysUserService;
import com.cms.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by zhm on 2019/12/31 17:27
 */
@RestController
public class TestController {


    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private UserService userService;


    @RequestMapping("/test")
    public Object getUser() {
        List<SysUser> list = sysUserService.listUser();
        return list;
    }


    @RequestMapping("/test1")
    public Object getUser1() {
        List<User> list = userService.listUser();
        return list;
    }


}
