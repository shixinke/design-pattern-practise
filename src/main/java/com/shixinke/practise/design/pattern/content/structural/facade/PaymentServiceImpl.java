package com.shixinke.practise.design.pattern.content.structural.facade;

import java.math.BigDecimal;

/**
 * 支付服务
 * @author shixinke
 */
public class PaymentServiceImpl implements PaymentService {

    /**
     * 退款
     * @param userId 用户
     * @param amount 金额
     * @return
     */
    public boolean refund(Long userId, BigDecimal amount) {
        System.out.println("发起退款操作");
        return true;
    }
}
