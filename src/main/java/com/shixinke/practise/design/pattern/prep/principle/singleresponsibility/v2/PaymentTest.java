package com.shixinke.practise.design.pattern.prep.principle.singleresponsibility.v2;

/**
 * 支付测试
 * @author shixinke
 */
public class PaymentTest {

    public static void main(String[] args) {
        Payment payment = new Alipay();
        payment.pay(38.9);

        Payment wepay = new Wepay();
        wepay.pay(38.9);
    }
}
