package com.shixinke.practise.design.pattern.content.creation.singleton.example;

/**
 * jdk中的单例模式
 * @author shixinke
 */
public class JdkExample {

    public static void main(String[] args) {
        /**
         * 懒汉式
         */
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
    }
}
