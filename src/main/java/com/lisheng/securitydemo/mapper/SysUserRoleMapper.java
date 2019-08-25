package com.lisheng.securitydemo.mapper;

import com.lisheng.securitydemo.config.BaseMapper;
import com.lisheng.securitydemo.entity.SysUserRole;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
}
