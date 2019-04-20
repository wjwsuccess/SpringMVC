package com.cenyol.example.model.autowire;


import com.jw.test.dao.BaseDAO;
import com.jw.test.dao.BaseDAOImpl;
import com.jw.test.dao.UserDao;
import com.jw.test.model.Tuser;
import com.jw.test.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)

// 指定要创建bean的xml文件
@ContextConfiguration("classpath:spring.xml")
public class TestDemoDao {

    @Resource
    private UserDao userDao;


    private BaseDAO<Tuser> baseDao;


    public BaseDAO<Tuser> getUserDao() {
        return baseDao;
    }

    @Autowired
    public void setUserDao(BaseDAO<Tuser> baseDao) {
        this.baseDao = baseDao;
    }
    @Test
    public void testQueryAll() {
        List<User> list=userDao.queryAll(0, 100);
        for (User user : list) {
            System.out.println(user);
        }
    }
    @Test
    @Transactional(readOnly=true)
    public void testHibernate() {
        String hql = "select count(*) from Tuser t";
        List<Object> values = new ArrayList<Object>();
        Long count = baseDao.count(hql, values);
        System.out.println(count);
    }


}
