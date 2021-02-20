package com.tmf.spring.service.impl;


import com.tmf.spring.dao.UserMapper;
import com.tmf.spring.entry.EmpEntry;
import com.tmf.spring.entry.UserEntry;
import com.tmf.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author taomofan
 * @Date 2021/2/1 8:27 下午
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    protected UserMapper userMapper;

    @Override
    public List<UserEntry> getAllUsers() {
        return userMapper.getAllUsers();
    }
    @Override
    public List<EmpEntry> getAllEmps() {
        return userMapper.getAllEmps();
    }
}
