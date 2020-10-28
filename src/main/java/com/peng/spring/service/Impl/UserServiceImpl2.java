package com.peng.spring.service.Impl;

import com.peng.spring.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary    // 当同一个接口有多个实现类注入时，优先选择有 @Primary 注解的
@Service("userService")
public class UserServiceImpl2 implements UserService {

    @Override
    public int save() {
        return 0;
    }
}
