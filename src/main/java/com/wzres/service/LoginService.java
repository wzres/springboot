package com.wzres.service;

import com.wzres.domain.User;
import com.wzres.unify.ResponseResult;

public interface LoginService {
    ResponseResult login(User user);

    ResponseResult logout();
}
