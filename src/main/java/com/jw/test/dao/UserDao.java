package com.jw.test.dao;

import com.jw.test.model.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserDao {


    /**
     * 根据偏移量查询用户列表
     *
     * @param offset
     * @param limit
     * @return
     */
    List<User> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
