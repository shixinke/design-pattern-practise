package com.shixinke.practise.design.pattern.prep.principle.leastknowledge.v1;

/**
 * 运营工作人员
 * @author shixinke
 */
public class Operator {

    /**
     * 因为后台没有这个功能，所以运营需要开发查库才能获取数量
     */
    public void getOrderCount(Developer developer) {
        System.out.println("订单数:" + developer.getOrderCount());
    }
}
