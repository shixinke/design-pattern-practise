package com.shixinke.practise.design.pattern.content.structural.flyweight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 享元测试
 * @author shixinke
 */
public class FlyweightTest {

    public static void main(String[] args) {
        FeeRateFactory feeRateFactory = new FeeRateFactory();
        List<ItemDO> itemList = new ArrayList<ItemDO>(9);
        create(1, BigDecimal.valueOf(15.2), itemList);
        create(9, BigDecimal.valueOf(10.3), itemList);
        create(3, BigDecimal.valueOf(5.2), itemList);
        create(2, BigDecimal.valueOf(3.8), itemList);
        create(6, BigDecimal.valueOf(7.6), itemList);
        create(8, BigDecimal.valueOf(4.7), itemList);
        create(7, BigDecimal.valueOf(8.9), itemList);
        create(4, BigDecimal.valueOf(11.5), itemList);
        create(5, BigDecimal.valueOf(18.3), itemList);
        for (ItemDO itemDO : itemList) {
            itemDO.setFee(BigDecimal.valueOf(feeRateFactory.getRate(itemDO.getAppId())).multiply(itemDO.getPrice()));
            System.out.println(itemDO);
        }
    }

    private static void create(int i, BigDecimal price,  List<ItemDO> itemList) {
        ItemDO itemDO = new ItemDO();
        itemDO.setId((long) i);
        itemDO.setName("饰品" + i);
        itemDO.setAppId(i % 3 + 1);
        itemDO.setPrice(price);
        itemList.add(itemDO);
    };
}
