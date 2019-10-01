package com.shixinke.practise.design.pattern.content.creation.singleton;

/**
 * 内部类的方式
 * @author shixinke
 */
public class InnerClassSingleton {

    private InnerClassSingleton() {

    }

    public static InnerClassSingleton getInstance() {
        return Inner.INSTANCE;
    }

    private static class Inner {
        private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
    }

}
