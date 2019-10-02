package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v2;

/**
 * 数据库数据源
 * @author shixinke
 */
public class DatabaseDataSource implements DataSource {
    public String get(Long userId) {
        return "从数据库中获取数据";
    }
}
