package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v2;

/**
 * 用户数据测试类
 * @author shixinke
 */
public class UserServiceTest {

    public static void main(String[] args) {
        DataSource cache = new CacheDataSource();
        UserService userService = new UserService(cache);
        System.out.println(userService.getData(1L));

        /**
         * 如果从其他数据源获取，只需要使用以下形式，而不用修改UserService类
         */
        DataSource db = new DatabaseDataSource();
        userService = new UserService(db);
        System.out.println(userService.getData(1L));
    }
}
