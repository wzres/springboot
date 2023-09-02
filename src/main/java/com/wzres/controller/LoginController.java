package com.wzres.controller;

import com.wzres.domain.User;
import com.wzres.service.LoginService;
import com.wzres.unify.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName LoginController
 * @date 2023-08-21 22:11
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;


    @PostMapping("login")
    public ResponseResult login(@RequestBody User user){
        return loginService.login(user);
    }

    @RequestMapping("user/logout")
    public ResponseResult logout(){
        return loginService.logout();
    }
}
