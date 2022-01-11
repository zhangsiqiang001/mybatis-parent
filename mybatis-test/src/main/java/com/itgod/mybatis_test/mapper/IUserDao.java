package com.itgod.mybatis_test.mapper;


import com.itgod.mybatis_test.domin.User;

import java.util.List;

/**
 * 用户的持久层接口
 */
public interface IUserDao {
    /**
     * 查询所有的用户
     *
     * @return
     */
    List<User> findAll();
}
