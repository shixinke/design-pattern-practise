package com.shixinke.practise.design.pattern.content.structural.adapter.classadapter;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 * 数据适配器
 * @author shixinke
 */
public class DataAdapter extends MySqlData implements ElasticSearchData  {
    /**
     * 解析数据
     * @return
     */
    public JSONObject parse() {
        User user = getUserData();
        return JSON.parseObject(JSON.toJSONString(user));
    }
}
