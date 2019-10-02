package com.shixinke.practise.design.pattern.prep.principle.openclose;

/**
 * 商品接口
 * @author shixinke
 */
public interface Product {
    /**
     * 获取商品ID
     * @return
     */
    Long getProductId();

    /**
     * 获取商品名称
     * @return
     */
    String getName();

    /**
     * 价格
     * @return
     */
    Double getPrice();
}
