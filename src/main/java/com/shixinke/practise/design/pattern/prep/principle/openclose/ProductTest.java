package com.shixinke.practise.design.pattern.prep.principle.openclose;

/**
 * 商品测试类
 * @author shixinke
 */
public class ProductTest {

    public static void main(String[] args) {
        /**
         * 平时
         */
        Product book = new Book(1001L, "java设计模式", 125D, "97845124578");

        /**
         * 活动期间
         */
        Product activityBook = new ActivityBook(1001L, "java设计模式", 125D, "97845124578");
        ActivityBook bookObj = (ActivityBook) activityBook;

        System.out.println("书籍名称:"+bookObj.getName() + " 书籍原价:" + bookObj.getOriginPrice() + " 书籍活动价:" + bookObj.getPrice());

    }
}
