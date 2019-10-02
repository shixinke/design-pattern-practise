package com.shixinke.practise.design.pattern.prep.principle.composition;

/**
 * 数据源测试
 * @author shixinke
 */
public class DataSourceTest {

    public static void main(String[] args) {
        DataSource ds = new RedisDataSource();
        UserDao userDao = new UserDao(ds);
        System.out.println(userDao.getUserInfo("11"));
    }
}
