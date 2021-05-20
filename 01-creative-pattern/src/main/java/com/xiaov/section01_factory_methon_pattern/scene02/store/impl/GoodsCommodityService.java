package com.xiaov.section01_factory_methon_pattern.scene02.store.impl;

import com.alibaba.fastjson.JSON;
import com.xiaov.section01_factory_methon_pattern.scene00.goods.DeliverReq;
import com.xiaov.section01_factory_methon_pattern.scene00.goods.GoodsService;
import com.xiaov.section01_factory_methon_pattern.scene02.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * @author xiaov
 * @since 2021-05-18 20:46
 */
public class GoodsCommodityService implements ICommodity {

    private Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUsername(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(commodityId);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if(!isSuccess)
            throw new RuntimeException("实物商品发放失败");
    }

    private String queryUserPhoneNumber(String uId) {
        return "17787603239";
    }

    private String queryUserName(String uId) {
        return "xiaov";
    }
}
