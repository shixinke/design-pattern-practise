package com.shixinke.practise.design.pattern.content.behavioral.strategy.v1;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.handler.GeneralUserStrategyHandler;
import com.shixinke.practise.design.pattern.content.behavioral.strategy.v1.handler.VipUserStrategyHandler;

/**
 * 策略模式测试
 * @author shixinke
 */
public class Test {

    static {
        StrategyHandlerFactory.addHandler("general", new GeneralUserStrategyHandler());
        StrategyHandlerFactory.addHandler("vip", new VipUserStrategyHandler());
    }

    private static void show(String type) {
        StrategyHandler handler = StrategyHandlerFactory.getHandler(type);
        System.out.println(handler.handle());
    }

    public static void main(String[] args) {
        /**
         * 普通用户
         */
        show("general");

        /**
         * VIP用户
         */
        show("vip");
    }
}
