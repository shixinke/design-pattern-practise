package com.shixinke.practise.design.pattern.content.creation.singleton;


/**
 * 饿汉式
 * @author shixinke
 */

public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {

    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }

}
