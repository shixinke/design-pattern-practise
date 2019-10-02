package com.shixinke.practise.design.pattern.prep.principle.leastknowledge.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 开发者
 * @author shixinke
 */
public class Developer {

    public int getOrderCount() {
        /**
         * 查库
         */
        List<Order> orders = new ArrayList<Order>(20);
        for (int i = 0; i < 20; i++) {
            orders.add(new Order());
        }
        return orders.size();
    }
}
