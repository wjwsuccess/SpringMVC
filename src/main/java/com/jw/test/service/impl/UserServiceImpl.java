package com.jw.test.service.impl;

import com.jw.test.dao.UserDao;
import com.jw.test.model.User;
import com.jw.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


@Service
public class UserServiceImpl implements UserService {


    @Resource
    private UserDao userDao;
    @Override
    public List<User> getUserList(int offset, int limit) {


        List<User> result_cache = userDao.queryAll(offset, limit);
        return null;
    }
}
