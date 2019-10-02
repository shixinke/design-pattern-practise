package com.shixinke.practise.design.pattern.prep.principle.openclose;

/**
 * 活动书籍
 * @author shixinke
 */
public class ActivityBook extends Book {

    public ActivityBook(Long productId, String name, Double price, String isbn) {
        super(productId, name, price, isbn);
    }

    /**
     * 获取原价
     * @return
     */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    /**
     * 获取活动价
     * @return
     */
    public Double getPrice() {
        return 0.9 * super.getPrice();
    }
}
