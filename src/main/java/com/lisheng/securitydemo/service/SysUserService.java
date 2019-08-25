package com.lisheng.securitydemo.service;

import com.lisheng.securitydemo.entity.SysUser;
import com.lisheng.securitydemo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public List<SysUser> getAllUsers(){
        return sysUserMapper.selectAll();
    }


}
