package com.pyb.dao;

/**
 * @program: spring-study
 * @description:
 * @author: peng yu bin
 * @create: 2020-04-17 16:33
 */
public class UserDAOMysqlImpl implements UserDAO {
    @Override
    public void getUser() {
        System.out.println("获取数据库数据");
    }
}
