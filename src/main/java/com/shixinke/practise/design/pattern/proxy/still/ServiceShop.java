package com.shixinke.practise.design.pattern.proxy.still;

/**
 * 4S店
 * @author shixinke
 */
public class ServiceShop {

    private Driver driver;

    public ServiceShop(Driver driver) {
        this.driver = driver;
    }

    public void buyCar() {
        System.out.println("4S不生产汽车，但它可以卖车");
        this.driver.buyCar();
        System.out.println("价格谈好，提车");
    }
}
