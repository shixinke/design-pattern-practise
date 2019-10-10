package com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.handler;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.HandlerTable;
import com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.StrategyHandler;
import org.springframework.stereotype.Component;

/**
 * 处理订单表
 * @author shixinke
 */
@HandlerTable("order")
@Component
public class OrderStrategyHandler implements StrategyHandler {

    public String handle() {
        return "处理订单数据";
    }
}
