package com.wzres;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName：UserApplication
 * @description：
 * @date：2023-04-09 03:59
 */
@SpringBootApplication
@MapperScan("com.wzres.mapper")
public class UserApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class,args);
    }
}
