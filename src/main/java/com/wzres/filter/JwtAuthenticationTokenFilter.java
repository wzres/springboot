package com.wzres.filter;

import com.wzres.domain.LoginUser;
import com.wzres.utils.JwtUtil;
import com.wzres.utils.RedisCache;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Objects;

/**
 * @ClassName JwtAuthenticationTokenFilter
 * @date 2023-08-21 23:25
 */

@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {

    //TODO 3、登录校验，判断用户有没有登录

    @Autowired
    private RedisCache redisCache;
    

    @Override
    protected void doFilterInternal(HttpServletRequest Request, HttpServletResponse Response, FilterChain filterChain) throws ServletException, IOException {
        //获取token
        String token = Request.getHeader("token");

        //判断token，为空就放行
        filterChain.doFilter(Request,Response);


        //解析token获取其中的userid


        //通过userid从redis中获取LoginUser


        //判断redis获取的loginUser是否为空，为空就抛异常


        //TODO 获取权限信息封装到Authentication中
        //如果能从redis中获取到loginUser就存入SecurityContextHolder

        //放行



    }
}
