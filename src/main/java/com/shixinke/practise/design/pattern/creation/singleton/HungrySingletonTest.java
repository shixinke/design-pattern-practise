package com.shixinke.practise.design.pattern.creation.singleton;

class HungrySingletonRunnable implements Runnable {

    public void run() {
        System.out.println( HungrySingleton.getInstance());
    }
}

/**
 * 饿汉式测试
 * @author shixinke
 */
public class HungrySingletonTest {

    public static void main(String[] args) {
        new Thread(new HungrySingletonRunnable()).start();
        new Thread(new HungrySingletonRunnable()).start();
        new Thread(new HungrySingletonRunnable()).start();
    }
}
