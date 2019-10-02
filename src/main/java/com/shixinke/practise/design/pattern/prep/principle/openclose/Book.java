package com.shixinke.practise.design.pattern.prep.principle.openclose;

/**
 * 书籍类商品
 * @author shixinke
 */
public class Book implements Product {

    /**
     * 商品ID
     */
    private Long productId;
    /**
     * 商品名称
     */
    private String name;
    /**
     * 商品价格
     */
    private Double price;

    /**
     * ISBN号
     */
    private String isbn;

    public Book(Long productId, String name, Double price, String isbn) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.isbn = isbn;
    }

    public Long getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
