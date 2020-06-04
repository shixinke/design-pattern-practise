package com.shixinke.practise.design.pattern.content.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 手续费计算工厂
 * @author shixinke
 */
public class FeeRateFactory {

    private Map<Integer, Double> rateMap = new ConcurrentHashMap<Integer, Double>(10);

    public double getRate(Integer appId) {
        if (rateMap.containsKey(appId)) {
            return rateMap.get(appId);
        }
        System.out.println("从数据库中查询appId="+appId+"的费率");
        /**
         * 通过appId查询数据库等获取费率
         */
        double rate = getConfig(appId);
        rateMap.put(appId, rate);
        return rate;
    }

    /**
     * 查询数据库获取费率配置(这里省略掉过程)
     * @param appId
     * @return
     */
    private double getConfig(Integer appId) {
        /**
         * 查询数据库获取费率(省略)
         */
        return Math.random();
    }
}
