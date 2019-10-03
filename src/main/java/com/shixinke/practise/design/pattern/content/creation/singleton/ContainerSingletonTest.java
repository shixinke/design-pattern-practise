package com.shixinke.practise.design.pattern.content.creation.singleton;

class RegisterSingletonRunnable implements Runnable {

    private String key;
    private Object value;

    public RegisterSingletonRunnable(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public void run() {
        ContainerSingleton.register(this.key, this.value);
    }
}

class GetSingletonRunnable implements Runnable {

    public void run() {
        System.out.println( ContainerSingleton.getInstance("object"));
    }
}
/**
 * 容器单例测试类
 * @author shixinke
 */
public class ContainerSingletonTest {

    public static void main(String[] args) {
        new Thread(new RegisterSingletonRunnable("object", new Object())).start();
        new Thread(new RegisterSingletonRunnable("object", new Object())).start();
        new Thread(new RegisterSingletonRunnable("object2", new Object())).start();
        new Thread(new GetSingletonRunnable()).start();
        new Thread(new GetSingletonRunnable()).start();
        new Thread(new GetSingletonRunnable()).start();
    }
}
