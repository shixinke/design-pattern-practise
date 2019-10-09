package com.shixinke.practise.design.pattern.content.structural.adapter.classadapter;

import com.alibaba.fastjson.JSONObject;

/**
 * ElasticSearch数据
 * @author shixinke
 */
public interface ElasticSearchData {
    /**
     * 获取JSON类型的原始数据
     * @return
     */
    JSONObject parse();
}
