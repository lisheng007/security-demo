package com.lisheng.securitydemo.controller;

import com.lisheng.securitydemo.common.BaseResponse;
import com.lisheng.securitydemo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("getAllUsers")
    public BaseResponse getAllUsers() throws Exception{
        return BaseResponse.ok(sysUserService.getAllUsers());
    }


}
