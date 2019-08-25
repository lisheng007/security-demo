package com.lisheng.securitydemo.service.security;

import com.lisheng.securitydemo.entity.SysPermission;
import com.lisheng.securitydemo.entity.SysUser;
import com.lisheng.securitydemo.mapper.SysPermissionMapper;
import com.lisheng.securitydemo.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomUserServiceImpl implements UserDetailsService { //自定义UserDetailsService 接口

    @Autowired
    SysUserMapper userDao;
    @Autowired
    SysPermissionMapper permissionDao;

    //返回 user和user拥有的权限功能 by username
    public UserDetails loadUserByUsername(String username) {
        SysUser user = new SysUser();
        user.setUserName(username);
        user = userDao.selectOne(user);
        if (user != null) {
            List<SysPermission> permissions = permissionDao.findByUserName(user.getUserName());
            List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
            for (SysPermission permission : permissions) {
                if (permission != null && permission.getName()!=null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(permission.getName());
                    //1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行权限验证时会使用GrantedAuthority 对象。
                    grantedAuthorities.add(grantedAuthority);
                }
            }
            System.out.println(user.toString());
            return new User(user.getUserName(), user.getPassword(), grantedAuthorities);
        } else {
            throw new UsernameNotFoundException("user: " + username + " do not exist!");
        }
    }

}
