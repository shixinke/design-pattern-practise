package com.shixinke.practise.design.pattern.prep.principle.composition;

public class MysqlDataSource implements DataSource {
    public String get(String id) {
        return "从MySQL中获取数据";
    }
}
