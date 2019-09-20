package com.shixinke.practise.design.pattern.creation.singleton;


class InnerClassRunnable implements Runnable {

    public void run() {
        System.out.println(InnerClassSingleton.getInstance());
    }
}

/**
 * 内部类测试
 * @author shixinke
 */
public class InnerClassSingletonTest {


    public static void singleThread() {
        InnerClassSingleton ls1 = InnerClassSingleton.getInstance();
        InnerClassSingleton ls2 = InnerClassSingleton.getInstance();
        System.out.println(ls1);
        System.out.println(ls2);
    }

    public static void main(String[] args) {
        //singleThread();

        new Thread(new InnerClassRunnable()).start();
        new Thread(new InnerClassRunnable()).start();
        new Thread(new InnerClassRunnable()).start();
    }
}
