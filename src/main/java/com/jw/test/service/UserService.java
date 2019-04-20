package com.jw.test.service;

import com.jw.test.model.User;

import java.util.List;

public interface UserService {


    List<User> getUserList(int offset, int limit);


}
