package com.shixinke.practise.design.pattern.proxy.still;

public class StaticProxyDemo {

    public static void main(String[] args) {
        Driver driver = new Driver();
        ServiceShop serviceShop = new ServiceShop(driver);
        serviceShop.buyCar();
    }
}
