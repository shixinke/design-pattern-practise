package com.shixinke.practise.design.pattern.prep.uml.dependency;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * 价格服务
 * @author shixinke
 */
public class Price {

    public BigDecimal getProductPrice(Long productId) {
        Map<Long, BigDecimal> priceMap = new HashMap<Long, BigDecimal>(2);
        priceMap.put(1L, new BigDecimal(200));
        priceMap.put(2L, new BigDecimal(500));
        return priceMap.get(productId);
    }
}
