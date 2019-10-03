package com.shixinke.practise.design.pattern.content.creation.builder;

/**
 * 构造器测试类
 * @author shixinke
 */
public class ItemBuilderTest {

    public static void main(String[] args) {
        Item item = Item.builder().setItemId(12L).build();

        System.out.println("item:"+item);
    }
}
