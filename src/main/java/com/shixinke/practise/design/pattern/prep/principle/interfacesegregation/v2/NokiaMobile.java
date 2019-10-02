package com.shixinke.practise.design.pattern.prep.principle.interfacesegregation.v2;

/**
 * 诺基亚手机(它可以打电话，因此实现打电话的功能)
 * @author shixinke
 */
public class NokiaMobile implements CallableMobile {
    public void call() {
        System.out.println("用诺基亚手机打电话");
    }
}
