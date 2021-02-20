package com.tmf.spring.service;


import com.tmf.spring.entry.EmpEntry;
import com.tmf.spring.entry.UserEntry;

import java.util.List;

/**
 * @Author taomofan
 * @Date 2021/2/1 8:26 下午
 * @Version 1.0
 */
public interface UserService {
    List<UserEntry> getAllUsers();

    List<EmpEntry> getAllEmps();
}
