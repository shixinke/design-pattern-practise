package com.shixinke.practise.design.pattern.content.behavioral.strategy.v2;

import org.springframework.beans.BeansException;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 策略处理器工厂 : 生产或收集策略处理器
 * @author shixinke
 */
@Component
public class StrategyHandlerFactory implements CommandLineRunner, ApplicationContextAware {

    private  Map<String, StrategyHandler> handlerMap = new ConcurrentHashMap<String, StrategyHandler>(5);

    private ApplicationContext applicationContext;

    public StrategyHandler getHandler(String name) {
        StrategyHandler handler = handlerMap.get(name);
        if (handler == null) {
            throw new IllegalArgumentException("未找名称为" + name + "对应的handler");
        }
        return handler;
    }

    public void run(String... args) throws Exception {
        initHandlerMap();
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    private void initHandlerMap() {
        Collection<StrategyHandler> handlerList = this.applicationContext.getBeansOfType(StrategyHandler.class).values();
        for (StrategyHandler handler : handlerList) {
            Class<? extends StrategyHandler> clazz = handler.getClass();
            HandlerTable handlerTable = clazz.getAnnotation(HandlerTable.class);
            if (handlerTable != null) {
                handlerMap.put(handlerTable.value(), handler);
            }
        }
    }
}
