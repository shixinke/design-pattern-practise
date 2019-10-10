package com.shixinke.practise.design.pattern.content.behavioral.strategy.v1;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.StrategyHandler;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略处理器工厂 : 生产或收集策略处理器
 * @author shixinke
 */
public class StrategyHandlerFactory {

    private static final Map<String, StrategyHandler> HANDLER_MAP = new HashMap<String, StrategyHandler>(5);

    public static void addHandler(String name, StrategyHandler handler) {
        HANDLER_MAP.put(name, handler);
    }

    public static StrategyHandler getHandler(String name) {
        StrategyHandler handler = HANDLER_MAP.get(name);
        if (handler == null) {
            throw new IllegalArgumentException("未找名称为" + name + "对应的handler");
        }
        return handler;
    }

}
