package com.shixinke.practise.design.pattern.content.structural.facade;

import java.math.BigDecimal;

/**
 * 支付服务
 * @author shixinke
 */
public interface PaymentService {

    /**
     * 退款
     * @param userId 用户
     * @param amount 金额
     * @return
     */
    boolean refund(Long userId, BigDecimal amount);
}
