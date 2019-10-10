package com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.handler;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.StrategyHandler;

/**
 * 普通用户处理
 * @author shixinke
 */
public class GeneralUserStrategyHandler implements StrategyHandler {

    public String handle() {
        return "[会员]";
    }
}
