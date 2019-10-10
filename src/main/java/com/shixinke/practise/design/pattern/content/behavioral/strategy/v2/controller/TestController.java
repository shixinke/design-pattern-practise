package com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.controller;

import com.shixinke.practise.design.pattern.content.behavioral.strategy.v2.StrategyHandlerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 测试类
 * @author shixinke
 */
@RestController
public class TestController {

    @Resource
    private StrategyHandlerFactory strategyHandlerFactory;

    @GetMapping("/test")
    public String test(@RequestParam("type") String type) {
        return strategyHandlerFactory.getHandler(type).handle();
    }
}
