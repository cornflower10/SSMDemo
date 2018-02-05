package com.ssm.service;

import com.ssm.dao.UserDao;
import com.ssm.model.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserService implements IUserService {

    @Resource
    private UserDao userdao;

    public void addUser(User user) {
        userdao.insert(user);
    }
}