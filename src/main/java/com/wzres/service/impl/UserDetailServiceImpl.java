package com.wzres.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.wzres.domain.LoginUser;
import com.wzres.domain.User;
import com.wzres.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


/**
 * @ClassName UserDetailServiceImpl
 * @date 2023-08-18 18:58
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {

    //TODO 1、从数据库查询账号密码

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        //TODO 查询对应的权限信息
        List<String> list = new ArrayList<>(Arrays.asList("test","dev"));

        //TODO 从数据库查询权限信息

        return null;
    }
}
