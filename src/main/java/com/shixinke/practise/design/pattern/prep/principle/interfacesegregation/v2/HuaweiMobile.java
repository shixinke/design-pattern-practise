package com.shixinke.practise.design.pattern.prep.principle.interfacesegregation.v2;

/**
 * 华为手机(即能打电话，也能上网)
 * @author shixinke
 */
public class HuaweiMobile implements CallableMobile, InternetMobile {
    public void call() {
        System.out.println("用华为手机打电话");
    }

    public void internet() {
        System.out.println("用华为手机上5G网网络");
    }
}
