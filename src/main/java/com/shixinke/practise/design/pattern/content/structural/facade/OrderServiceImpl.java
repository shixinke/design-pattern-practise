package com.shixinke.practise.design.pattern.content.structural.facade;

/**
 * 订单服务(实现)
 * @author shixinke
 */
public class OrderServiceImpl implements OrderService {

    /**
     * 获取订单
     * @param orderId
     * @return
     */
    public Order getOrder(Long orderId) {
        /**
         * 查询操作
         */
        Order order = new Order();
        return order;
    }

    /**
     * 取消订单操作
     * @param orderId
     * @return
     */
    public boolean cancelOrder(Long orderId) {
        System.out.println("修改订单状态，将订单修改为已取消");
        return true;
    }
}
