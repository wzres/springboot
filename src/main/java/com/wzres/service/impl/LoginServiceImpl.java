package com.wzres.service.impl;

import com.wzres.domain.LoginUser;
import com.wzres.domain.User;
import com.wzres.service.LoginService;
import com.wzres.unify.ResponseResult;
import com.wzres.utils.JwtUtil;
import com.wzres.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @ClassName LoginServiceImpl
 * @date 2023-08-21 22:14
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    @Override
    public ResponseResult login(User user) {

        //TODO 2、自定义登录接口

        //AuthenticationManager的authenticate方法进行用户认证

        //参数为你要认证的用户名和密码
        UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(user.getUserName(),user.getPassword());

        //判断过程
        //authenticate方法最终会调用到数据库查询的用户名和密码与你登录的用户名和密码，两者对比如果不通过，authenticate对象为null
        Authentication authenticate = authenticationManager.authenticate(authenticationToken);

        //如果认证没通过，抛出异常提示


        //如果认证通过，使用userid生成一个jwt并存入ResponseResult返回


        //把完整的用户信息存入redis userid做为key，用户信息做为value
        return null;

    }

    @Override
    public ResponseResult logout() {
        //TODO 4、注销用户
        return null;
    }
}
