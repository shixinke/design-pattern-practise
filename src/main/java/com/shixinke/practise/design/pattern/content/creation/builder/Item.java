package com.shixinke.practise.design.pattern.content.creation.builder;

import java.math.BigDecimal;

/**
 * 商品实体(数据库实体)
 * @author shixinke
 */
public class Item {
    /**
     * 商品ID
     */
    private Long itemId;

    /**
     * 商品名称
     */
    private String itemName;

    /**
     * 商品标识名称
     */
    private String itemMarketName;

    /**
     * 商品原价
     */
    private BigDecimal originalPrice;

    /**
     * 市场价
     */
    private BigDecimal marketPrice;

    /**
     * 在售状态
     */
    private Short saleStatus;

    /**
     * 创建时间
     */
    private Integer createTime;

    /**
     * 更新时间
     */
    private Integer updateTime;

    public Long getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemMarketName() {
        return itemMarketName;
    }

    public BigDecimal getOriginalPrice() {
        return originalPrice;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public Short getSaleStatus() {
        return saleStatus;
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemMarketName='" + itemMarketName + '\'' +
                ", originalPrice=" + originalPrice +
                ", marketPrice=" + marketPrice +
                ", saleStatus=" + saleStatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    /**
     * 调用建造者方法
     * @return
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Item建造者类
     */
    public static class Builder {
        private Item item;
        private Builder() {
            item  = new Item();
        }

        public Builder setItemId(Long itemId) {
            item.itemId = itemId;
            return this;
        }

        public Builder setItemName(String itemName) {
            item.itemName = itemName;
            return this;
        }


        public Builder setItemMarketName(String itemMarketName) {
            item.itemMarketName = itemMarketName;
            return this;
        }

        public Builder setOriginalPrice(BigDecimal originalPrice) {
            item.originalPrice = originalPrice;
            return this;
        }

        public Builder setMarketPrice(BigDecimal marketPrice) {
            item.marketPrice = marketPrice;
            return this;
        }


        public Builder setSaleStatus(Short saleStatus) {
            item.saleStatus = saleStatus;
            return this;
        }

        public Builder setCreateTime(Integer createTime) {
            item.createTime = createTime;
            return this;
        }


        public Builder setUpdateTime(Integer updateTime) {
            item.updateTime = updateTime;
            return this;
        }

        public Item build() {
            return item;
        }
    }
}
