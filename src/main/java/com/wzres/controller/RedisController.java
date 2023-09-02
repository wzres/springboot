package com.wzres.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName RedisController
 * @date 2023-06-27 22:21
 */
@RestController
public class RedisController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("/hello")
    public String quicker(){
        Long hello = stringRedisTemplate.opsForValue().increment("hello");
        return "更新" + hello;
    }
}
