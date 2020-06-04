package com.shixinke.practise.design.pattern.content.structural.flyweight;

import java.math.BigDecimal;

/**
 * 饰品数据对象
 * @author shixinke
 */
public class ItemDO {
    /**
     * 饰品ID
     */
    private Long id;
    /**
     * 饰品名称
     */
    private String name;

    /**
     * 游戏ID
     */
    private Integer appId;
    /**
     * 饰品定价
     */
    private BigDecimal price;
    /**
     * 饰品手续费
     */
    private BigDecimal fee;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "ItemDO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", appId=" + appId +
                ", price=" + price +
                ", fee=" + fee +
                '}';
    }
}
