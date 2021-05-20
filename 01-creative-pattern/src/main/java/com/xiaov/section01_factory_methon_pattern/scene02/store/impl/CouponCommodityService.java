package com.xiaov.section01_factory_methon_pattern.scene02.store.impl;

import com.alibaba.fastjson.JSON;
import com.xiaov.section01_factory_methon_pattern.scene00.coupon.CouponResult;
import com.xiaov.section01_factory_methon_pattern.scene00.coupon.CouponService;
import com.xiaov.section01_factory_methon_pattern.scene02.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author xiaov
 * @since 2021-05-18 20:42
 */
public class CouponCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        CouponResult couponResult = couponService.sendCoupon(uId, commodityId, bizId);
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));

        if(!"0000".equals(couponResult.getCode()))
            throw new RuntimeException(couponResult.getInfo());
    }
}
