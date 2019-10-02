package com.shixinke.practise.design.pattern.prep.principle.composition;

/**
 * 数据源
 * @author shixinke
 */
public interface DataSource {
    /**
     * 获取数据
     * @param id
     * @return
     */
    String get(String id);
}
