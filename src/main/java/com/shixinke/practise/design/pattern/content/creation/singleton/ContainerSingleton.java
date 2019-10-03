package com.shixinke.practise.design.pattern.content.creation.singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器类型的单例
 * @author shixinke
 */
public class ContainerSingleton {
    /**
     * 保存实例的容器
     */
    private static Map<String, Object> INSTANCE_MAP = new ConcurrentHashMap<String, Object>(10);


    private ContainerSingleton() {

    }


    /**
     * 添加instance到容器
     * @param key
     * @param instance
     */
    public static void register(String key, Object instance) {
        if (key != null && instance != null) {
            if (!INSTANCE_MAP.containsKey(key)) {
                INSTANCE_MAP.put(key, instance);
            }
        }
    }

    /**
     * 取instance
     * @param key
     * @return
     */
    public static Object getInstance(String key) {
        return INSTANCE_MAP.get(key);
    }
}
