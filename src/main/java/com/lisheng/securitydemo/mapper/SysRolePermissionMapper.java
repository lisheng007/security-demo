package com.lisheng.securitydemo.mapper;

import com.lisheng.securitydemo.config.BaseMapper;
import com.lisheng.securitydemo.entity.SysRolePermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SysRolePermissionMapper extends BaseMapper<SysRolePermission> {
}
