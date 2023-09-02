package com.wzres.exception;

import com.alibaba.fastjson.JSON;
import com.wzres.unify.ResponseResult;
import com.wzres.utils.WebUtils;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 授权失败处理对象
 *
 * @ClassName AccessDeniedHandlerImpl
 * @date 2023-08-30 15:55
 */

@Component
public class AccessDeniedHandlerImpl implements AccessDeniedHandler {

    @Override
    public void handle(HttpServletRequest request, HttpServletResponse response, AccessDeniedException e) throws IOException, ServletException {
        ResponseResult responseResult = new ResponseResult(HttpStatus.FORBIDDEN.value(),"授权失败，你的权限不足");
        String jsonStr = JSON.toJSONString(responseResult);
        WebUtils.renderString(response, jsonStr);
    }
}
