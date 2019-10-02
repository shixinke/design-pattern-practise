package com.shixinke.practise.design.pattern.prep.principle.composition;

/**
 * 用户数据操作类
 * @author shixinke
 */
public class UserDao {

    private DataSource dataSource;

    public UserDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public String getUserInfo(String id) {
        return dataSource.get(id);
    }
}
