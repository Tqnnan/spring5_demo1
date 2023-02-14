package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 2:31,
 */
public class UserService {
    //创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("service add.......");
        userDao.update();
    }
}
