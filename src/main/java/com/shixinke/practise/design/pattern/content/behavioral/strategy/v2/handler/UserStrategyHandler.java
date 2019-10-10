package com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.handler;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.HandlerTable;
import com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.StrategyHandler;
import org.springframework.stereotype.Component;

/**
 * 处理用户表
 * @author shixinke
 */
@HandlerTable("user")
@Component
public class UserStrategyHandler implements StrategyHandler {
    public String handle() {
        return "处理用户数据";
    }
}
