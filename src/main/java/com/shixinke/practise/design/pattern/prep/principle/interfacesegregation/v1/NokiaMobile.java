package com.shixinke.practise.design.pattern.prep.principle.interfacesegregation.v1;

/**
 * 诺基亚手机(砸核桃的那种)
 * @author shixinke
 */
public class NokiaMobile implements Mobile {
    public void call() {
        System.out.println("用诺基亚手机打电话");
    }

    public void internet() {
        System.out.println("用诺基亚无法上网");
    }
}
