package com.wzres.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wzres.domain.Menu;

import java.util.List;

public interface MenuMapper extends BaseMapper<Menu> {

    // 自定义方法，需要创建对应的mapper文件，定义对应的sql语句
    List<String> selectPermsByUserId(Long id);
}
