package com.shixinke.practise.design.pattern.prep.principle.interfacesegregation.v1;

/**
 * 华为手机
 * @author shixinke
 */
public class HuweiMobile implements Mobile {
    public void call() {
        System.out.println("用华为手机打电话");
    }

    public void internet() {
        System.out.println("用华为手机上5G网网络");
    }
}
