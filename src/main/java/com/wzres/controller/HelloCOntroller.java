package com.wzres.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName：HelloCOntroller
 * @description：
 * @date：2023-05-13 14:11
 */

@RestController
public class HelloCOntroller {

    @GetMapping("/hello")
    //@PreAuthorize("hasAuthority('test')")//该用户必须要有test权限才能访问
    //@PreAuthorize("hasAuthority('system:dept:list')") //从数据库查询权限信息
    public String hello(){
        return "springsecurity";
    }
}
