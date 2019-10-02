package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v1;

/**
 * 用户数据访问服务
 * @author shixinke
 */
public class UserService {

    /**
     * 缓存数据源
     */
    private CacheDataSource cacheDataSource;

    public UserService(CacheDataSource cacheDataSource) {
        this.cacheDataSource = cacheDataSource;
    }

    /**
     * 获取数据
     * @param userId
     * @return
     */
    public String getData(Long userId) {
        return cacheDataSource.get(userId);
    }
}
