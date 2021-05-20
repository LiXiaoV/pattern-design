package com.xiaov.section01_factory_methon_pattern.scene02;

import com.xiaov.section01_factory_methon_pattern.scene02.store.ICommodity;
import com.xiaov.section01_factory_methon_pattern.scene02.store.impl.CardCommodityService;
import com.xiaov.section01_factory_methon_pattern.scene02.store.impl.CouponCommodityService;
import com.xiaov.section01_factory_methon_pattern.scene02.store.impl.GoodsCommodityService;

/**
 * @author xiaov
 * @since 2021-05-18 20:55
 */
public class StoreFactory {
    public ICommodity getCommodityService(Integer commodityType){
        if(null == commodityType) return null;
        if(1 == commodityType) return new CouponCommodityService();
        if(2 == commodityType) return new GoodsCommodityService();
        if(3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }
}
