package com.shixinke.practise.design.pattern.content.creation.singleton;

class DoubleCheckLazyRunnable implements Runnable {

    public void run() {
        System.out.println( DoubleCheckLazySingleton.getInstance());
    }
}

/**
 * 双重检测测试
 * @author
 */
public class DoubleCheckSingletonTest {

    public static void main(String[] args) {
        new Thread(new DoubleCheckLazyRunnable()).start();
        new Thread(new DoubleCheckLazyRunnable()).start();
        new Thread(new DoubleCheckLazyRunnable()).start();
    }
}
