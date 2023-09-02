package com.wzres.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @ClassName User
 * @date 2023-06-22 17:58
 */

@Data
@Accessors(chain = true) //支持set&get的函数式编程
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {
    String id;
    String username;
    Integer age;
    String address;
}
