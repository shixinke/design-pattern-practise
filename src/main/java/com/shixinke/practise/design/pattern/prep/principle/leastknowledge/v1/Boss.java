package com.shixinke.practise.design.pattern.prep.principle.leastknowledge.v1;

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
        Developer developer = new Developer();
        operator.getOrderCount(developer);
    }
}
