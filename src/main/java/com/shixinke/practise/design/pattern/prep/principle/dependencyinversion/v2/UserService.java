package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v2;


/**
 * 用户数据访问服务
 * @author shixinke
 */
public class UserService {

    /**
     * 数据源
     */
    private DataSource dataSource;

    public UserService(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    /**
     * 获取数据
     * @param userId
     * @return
     */
    public String getData(Long userId) {
        return dataSource.get(userId);
    }
}