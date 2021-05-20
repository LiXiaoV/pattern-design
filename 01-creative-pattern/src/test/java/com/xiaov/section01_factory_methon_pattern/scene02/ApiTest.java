package com.xiaov.section01_factory_methon_pattern.scene02;

import com.xiaov.section01_factory_methon_pattern.scene02.store.ICommodity;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaov
 * @since 2021-05-18 20:54
 */
public class ApiTest {

    @Test
    public void test_commodity() throws Exception{
        StoreFactory storeFactory = new StoreFactory();

        // 1. 优惠券
        ICommodity commodityService_1 = storeFactory.getCommodityService(1);
        commodityService_1.sendCommodity("10001","EGM1023938910232121323432",
                "791098764902132",null);

        // 2. 实物商品
        ICommodity commodityService_2 = storeFactory.getCommodityService(2);
        Map<String,String> extMap = new HashMap<String, String>();
        extMap.put("consigneeUserName","xiaoMing");
        extMap.put("consigneeUserPhone","15200292123");
        extMap.put("consigneeUserAddress","广东省.广州市.番禺区.小谷围街.华南理工大学");
        commodityService_2.sendCommodity("10001","9820198721311",
                "1023000020112221113",extMap);

        // 3. 第三方兑换卡(爱奇艺)
        ICommodity commodityService_3 = storeFactory.getCommodityService(3);
        commodityService_3.sendCommodity("10001","AQY1xjkUodl8LO975GdfrYUio",null,null);

    }
}
