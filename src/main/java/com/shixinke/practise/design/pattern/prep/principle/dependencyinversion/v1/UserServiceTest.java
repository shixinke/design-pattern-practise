package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v1;

/**
 * 用户服务测试类
 * @author shixinke
 */
public class UserServiceTest {

    public static void main(String[] args) {
        CacheDataSource cacheDataSource = new CacheDataSource();
        UserService userService = new UserService(cacheDataSource);
        System.out.println(userService.getData(1L));
    }
}
