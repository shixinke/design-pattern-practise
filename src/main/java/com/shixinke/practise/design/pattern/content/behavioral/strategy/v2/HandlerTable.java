package com.shixinke.practise.design.pattern.content.behavioral.strategy.v2;

import java.lang.annotation.*;

/**
 * 处理的表
 * @author shixinke
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface HandlerTable {
    String value();
}
