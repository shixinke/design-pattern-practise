package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v1;

/**
 * 缓存数据源
 * @author shixinke
 */
public class CacheDataSource {

    public String get(Long userId) {
        return "从缓存中获取数据";
    }
}
