package com.shixinke.practise.design.pattern.prep.principle.singleresponsibility.v1;

/**
 * 支付测试
 * @author shixinke
 */
public class PaymentTest {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.pay("alipay", 58.9);
    }
}
