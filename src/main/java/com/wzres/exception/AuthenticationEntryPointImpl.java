package com.wzres.exception;

import com.alibaba.fastjson.JSON;
import com.wzres.unify.ResponseResult;
import com.wzres.utils.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 认证失败处理对象
 *
 * @ClassName AuthenticationEntryPoint
 * @date 2023-08-30 15:57
 */
@Component
public class AuthenticationEntryPointImpl implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        ResponseResult responseResult = new ResponseResult(HttpStatus.UNAUTHORIZED.value(),"认证失败请重新登录");
        String jsonStr = JSON.toJSONString(responseResult);
        WebUtils.renderString(response, jsonStr);
    }
}
