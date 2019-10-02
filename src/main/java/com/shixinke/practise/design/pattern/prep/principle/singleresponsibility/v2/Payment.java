package com.shixinke.practise.design.pattern.prep.principle.singleresponsibility.v2;

/**
 * 订单支付
 * @author shixinke
 */
public interface Payment {

    /**
     * 订单支付
     * @param price
     * @return
     */
    boolean pay(Double price);
}
