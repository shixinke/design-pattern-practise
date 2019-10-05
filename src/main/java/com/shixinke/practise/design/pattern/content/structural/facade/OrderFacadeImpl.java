package com.shixinke.practise.design.pattern.content.structural.facade;

/**
 * 订单(实现)
 */
public class OrderFacadeImpl implements OrderFacade {

    /**
     * 取消订单
     * @param orderId
     * @param userId
     * @return
     */
    public ResponseDTO cancelOrder(Long orderId, Long userId) {

        /**
         * 1.获取订单信息
         */
        OrderService orderService = new OrderServiceImpl();
        Order order = orderService.getOrder(orderId);
        if (order == null) {
            return ResponseDTO.error(404, "订单不存在");
        }

        /**
         * 订单所属用户判断(查看是否有权限)
         */
        if (!order.getUserId().equals(userId)) {
            return ResponseDTO.error(401, "订单不存在");
        }

        /**
         * 订单状态判断(哪些状态不能取消)
         */

        /**
         * 2.取消订单操作
         */
        boolean result = orderService.cancelOrder(orderId);

        if (!result) {
            return ResponseDTO.error(500, "订单取消失败");
        }

        /**
         * 退款操作(可以是通过异步MQ,或同步操作方法，记录日志等)
         */
        boolean needRefund = true; //哪些状态需要退款
        if (needRefund) {
            PaymentService paymentService = new PaymentServiceImpl();
            boolean refundResult = paymentService.refund(userId, order.getAmount());
            if (!refundResult) {
                //退款失败的操作，回滚或者其他
            }
        }


        return ResponseDTO.success(null);
    }
}
