package com.shixinke.practise.design.pattern.prep.principle.leastknowledge.v2;

/**
 * 老板
 * @author shixinke
 */
public class Boss {

    /**
     * 问运营今天有多少订单数
     * @param operator
     */
    public void getOrderCount(Operator operator) {
        operator.getOrderCount();
    }
}
