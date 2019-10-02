package com.shixinke.practise.design.pattern.prep.principle.composition;

public class RedisDataSource implements DataSource {
    public String get(String id) {
        return "从Redis中获取数据";
    }
}
