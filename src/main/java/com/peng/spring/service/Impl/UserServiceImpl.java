package com.peng.spring.service.Impl;

import com.peng.spring.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public int save() {
        System.out.println("ha");
        return 0;
    }
}
