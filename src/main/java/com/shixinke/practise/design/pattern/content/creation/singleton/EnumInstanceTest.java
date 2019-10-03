package com.shixinke.practise.design.pattern.content.creation.singleton;

class EnumSingletonRunnable implements Runnable {

    public void run() {
        System.out.println( EnumInstance.getInstance());
    }
}
/**
 * 枚举测试
 * @author
 */
public class EnumInstanceTest {
    public static void main(String[] args) {
        new Thread(new EnumSingletonRunnable()).start();
        new Thread(new EnumSingletonRunnable()).start();
        new Thread(new EnumSingletonRunnable()).start();
    }
}
