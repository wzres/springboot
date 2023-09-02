package com.wzres;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName：TokenApplication
 * @description：
 * @date：2023-05-13 09:47
 */
@SpringBootApplication
@MapperScan("com.wzres.mapper")
public class TokenApplication {
    public static void main(String[] args) {
        SpringApplication.run(TokenApplication.class, args);
    }
}
