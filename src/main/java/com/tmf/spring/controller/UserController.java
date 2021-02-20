package com.tmf.spring.controller;


import com.tmf.spring.entry.EmpEntry;
import com.tmf.spring.entry.UserEntry;
import com.tmf.spring.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author taomofan
 * @Date 2021/2/1 8:29 下午
 * @Version 1.0
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<UserEntry> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "/emp",method = RequestMethod.GET)
    public List<EmpEntry> getAllEmp() { return userService.getAllEmps();}
}
