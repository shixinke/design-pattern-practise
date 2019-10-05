package com.shixinke.practise.design.pattern.content.structural.facade;

/**
 * 订单服务接口
 * @author shixinke
 */
public interface OrderService {

    /**
     * 获取订单信息
     * @param orderId
     * @return
     */
    Order getOrder(Long orderId);

    /**
     * 取消订单
     * @param orderId
     * @return
     */
    boolean cancelOrder(Long orderId);
}
