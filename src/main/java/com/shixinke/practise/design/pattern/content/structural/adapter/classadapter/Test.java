package com.shixinke.practise.design.pattern.content.structural.adapter.classadapter;

/**
 * 数据转换测试
 * @author shixinke
 */
public class Test {

    public static void main(String[] args) {
        DataAdapter dataAdapter = new DataAdapter();
        System.out.println(dataAdapter.parse().toJSONString());
    }
}
