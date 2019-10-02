package com.shixinke.practise.design.pattern.prep.principle.singleresponsibility.v2;

/**
 * 支付宝支付
 * @author shixinke
 */
public class Alipay implements Payment {
    public boolean pay(Double price) {
        System.out.println("使用支付宝支付，支付金额为:"+price);
        return true;
    }
}
