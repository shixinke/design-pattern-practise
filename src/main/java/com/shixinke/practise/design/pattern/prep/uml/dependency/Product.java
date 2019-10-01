package com.shixinke.practise.design.pattern.prep.uml.dependency;

import java.math.BigDecimal;

/**
 * 商品类
 * @author shixinke
 */
public class Product {
    private String name;
    private Long productId;

    private Price price;

    public Product() {
        price = new Price();
    }

    public BigDecimal getPrice() {
        return this.price.getProductPrice(this.productId);
    }
}
