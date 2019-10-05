package com.shixinke.practise.design.pattern.content.structural.facade;

/**
 * 订单对外接口
 * @author shixinke
 */
public interface OrderFacade {

    /**
     * 取消订单
     * @param orderId
     * @param userId
     * @return
     */
    ResponseDTO cancelOrder(Long orderId, Long userId);
}
