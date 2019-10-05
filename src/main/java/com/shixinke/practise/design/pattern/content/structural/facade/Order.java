package com.shixinke.practise.design.pattern.content.structural.facade;

import java.math.BigDecimal;

/**
 * 订单实体
 * @author shixinke
 */
public class Order {
    /**
     * 订单ID
     */
    private Long orderId;
    /**
     * 用户
     */
    private Long userId;

    /**
     * 支付方式
     */
    private Short payment;
    /**
     * 金额
     */
    private BigDecimal amount;
    /**
     * 订单状态(这里为了简单，不将物流状态/支付状态等分开)
     */
    private Short status;

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Short getPayment() {
        return payment;
    }

    public void setPayment(Short payment) {
        this.payment = payment;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public enum Status {
        UNPAID(Short.valueOf("1")),
        PAID(Short.valueOf("2"));
        private Short value;
        Status(Short value) {
            this.value = value;
        }

        public Short getValue() {
            return value;
        }
    }


}
