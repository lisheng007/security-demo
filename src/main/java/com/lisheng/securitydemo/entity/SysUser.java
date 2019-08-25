package com.lisheng.securitydemo.entity;

import lombok.Data;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "sys_user")
public class SysUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @UniqueElements
    private String userName;

    private String password;

    private String realName;

    private String sex;

    private String email;

    private String phone;

    private Integer status;

    private Date createTime;

    private Date updateTime;

}
