package com.wzres;

import com.wzres.domain.User;
import com.wzres.mapper.MenuMapper;
import com.wzres.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.List;

/**
 * @ClassName MPTest
 * @date 2023-08-18 17:08
 */

@SpringBootTest
public class MPTest {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private MenuMapper menuMapper;

    //测试自定义方法
    @Test
    public void testMenuMapper(){
        List<String> list = menuMapper.selectPermsByUserId(2L);
        System.out.println(list);
    }

    //测试BCryptPasswordEncoder
    @Test
    public void testBCryptPasswordEncoder(){
        //对明文加密
        String encode = passwordEncoder.encode("1234");
        System.out.println(encode);

        //判断明文是否能解析成这个密文，如果能返回true
        System.out.println(passwordEncoder.matches("1234", "$2a$10$ee1fv9A9sjpvh51cki5YuuYqs3Q01xOoXjnd0ri/PkLPMj/6Q6YWe"));
    }

    //测试MybatisPlus环境
    @Test
    public void testUserMapper(){
        List<User> users = userMapper.selectList(null);
        System.out.println(users);
    }

}
