package com.shixinke.practise.design.pattern.prep.principle.singleresponsibility.v2;

/**
 * 微信支付
 * @author shixinke
 */
public class Wepay implements Payment {
    public boolean pay(Double price) {
        System.out.println("使用微信支付，支付金额为:" + price);
        return true;
    }
}
