package com.pyb.service;

import com.pyb.dao.UserDAO;
import com.pyb.dao.UserDAOImpl;
import com.pyb.dao.UserDAOMysqlImpl;

/**
 * @program: spring-study
 * @description:
 * @author: peng yu bin
 * @create: 2020-04-17 16:29
 */
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public void setUserDAO(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public void getUser() {
        userDAO.getUser();
    }
}
