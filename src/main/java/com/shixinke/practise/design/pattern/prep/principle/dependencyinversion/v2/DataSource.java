package com.shixinke.practise.design.pattern.prep.principle.dependencyinversion.v2;

/**
 * 数据源接口
 * @author shixinke
 *
 */
public interface DataSource {
    /**
     * 获取数据
     * @param userId
     * @return
     */
    String get(Long userId);
}
