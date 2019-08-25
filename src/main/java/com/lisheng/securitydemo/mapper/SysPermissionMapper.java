package com.lisheng.securitydemo.mapper;

import com.lisheng.securitydemo.config.BaseMapper;
import com.lisheng.securitydemo.entity.SysPermission;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SysPermissionMapper extends BaseMapper<SysPermission> {

    List<SysPermission> findByUserId(@Param("userId") int userId);

    List<SysPermission> findByUserName(@Param("userName") String userName);

}
