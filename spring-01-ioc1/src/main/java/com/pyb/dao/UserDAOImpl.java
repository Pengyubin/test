package com.pyb.dao;

/**
 * @program: spring-study
 * @description:
 * @author: peng yu bin
 * @create: 2020-04-17 16:24
 */
public class UserDAOImpl implements UserDAO{
    @Override
    public void getUser() {
        System.out.println("默认获取用户的数据");
    }
}
