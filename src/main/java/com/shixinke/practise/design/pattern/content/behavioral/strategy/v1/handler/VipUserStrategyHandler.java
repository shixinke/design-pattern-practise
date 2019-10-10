package com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.handler;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.StrategyHandler;

/**
 * VIP用户处理
 * @author shixinke
 */
public class VipUserStrategyHandler implements StrategyHandler {
    public String handle() {
        return "[VIP尊享]";
    }
}
