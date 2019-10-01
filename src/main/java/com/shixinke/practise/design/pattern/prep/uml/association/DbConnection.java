package com.shixinke.practise.design.pattern.prep.uml.association;

/**
 * 数据库连接类
 * @author shixinke
 */
public class DbConnection {

    public DbConnection() {
        System.out.println("连接数据库");
    }

    public void execute(String sql) {
        System.out.println("执行sql操作");
    }
}
