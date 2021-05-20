package com.xiaov.section01_factory_methon_pattern.scene00.goods;

import com.alibaba.fastjson.JSON;

/**
 * 模拟实物商品服务
 * @author xiaov
 * @since 2021-05-17 11:55
 */
public class GoodsService {

    /**
     * 发送事物奖品
     * @param req 请求参数对象
     * @return Boolean
     */
    public Boolean deliverGoods(DeliverReq req){
        System.out.println("模拟发货实物商品一个：");
        System.out.println("JSON.toJSONString(req) = " + JSON.toJSONString(req));
        return true;
    }
}
