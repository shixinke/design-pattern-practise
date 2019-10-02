package com.shixinke.practise.design.pattern.prep.principle.singleresponsibility.v1;

/**
 * 订单支付
 * @author shixinke
 */
public class Payment {

    /**
     * 支付订单
     * @param paymentType
     * @param price
     * @return
     */
    public boolean pay(String paymentType, Double price) {
        if ("alipay".equalsIgnoreCase(paymentType)) {
            System.out.println("使用支付宝支付,支付金额为:"+price);
            /**
             * 支付宝支付逻辑
             */
            return true;
        } else if ("wepay".equalsIgnoreCase(paymentType)) {
            System.out.println("使用微信支付,支付金额为:"+price);
            /**
             * 微信支付逻辑
             */
            return true;
        }
        System.out.println("暂不支持其他支付方式");
        return false;
    }
}
