package com.tmf.spring.dao;

import com.tmf.spring.entry.EmpEntry;
import com.tmf.spring.entry.UserEntry;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author taomofan
 * @Date 2021/2/2 2:54 下午
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from person")
    List<UserEntry> getAllUsers();

    @Select("select * from employees")
    List<EmpEntry> getAllEmps();
}
