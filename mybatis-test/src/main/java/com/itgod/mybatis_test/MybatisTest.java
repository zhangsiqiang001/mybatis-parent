package com.itgod.mybatis_test;

import com.itgod.mybatis_test.domin.User;
import com.itgod.mybatis_test.mapper.IUserDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * mybatis的入门案例使用main函数执行
 */
public class MybatisTest {
    /**
     * 入门案例
     */
    public static void main(String[] args) throws Exception {
        // 1. 读取配置文件
        InputStream in = Resources.getResourceAsStream("org/mybatis/config/SqlMapConfig.xml");
        // 2. 创建一个SqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        // 3. 使工厂生产SQLSession对象
        SqlSession session = factory.openSession();
        // 4. 使用SQLSession创建Dao接口的代理对象（动态代理）
        IUserDao userDao = session.getMapper(IUserDao.class);
        // 5. 使用代理对象执行方法
        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println(user);
        }
        // 6. 释放资源
        session.close();
        in.close();
    }
}
