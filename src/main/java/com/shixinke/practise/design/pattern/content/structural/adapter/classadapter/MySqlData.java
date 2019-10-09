package com.shixinke.practise.design.pattern.content.structural.adapter.classadapter;

/**
 * MySQL数据
 * @author jiangfangtao
 */
public class MySqlData {
    /**
     * 获取用户数据
     * @return
     */
    public User getUserData() {
        /**
         * 从数据库中获取数据
         */
        return new User(10000L, "张三", "zhangsan@foxmail.com", 1, Long.valueOf(System.currentTimeMillis()/1000).intValue());
    }
}
