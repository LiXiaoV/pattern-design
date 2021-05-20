package com.xiaov.section01_factory_methon_pattern.scene01;

import com.alibaba.fastjson.JSON;
import com.xiaov.section01_factory_methon_pattern.scene00.card.IQiYiCardService;
import com.xiaov.section01_factory_methon_pattern.scene00.coupon.CouponResult;
import com.xiaov.section01_factory_methon_pattern.scene00.coupon.CouponService;
import com.xiaov.section01_factory_methon_pattern.scene00.goods.DeliverReq;
import com.xiaov.section01_factory_methon_pattern.scene00.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.geom.QuadCurve2D;

/**
 * 模拟发奖服务
 * @author xiaov
 * @since 2021-05-17 11:11
 */
public class PrizeController {
    private Logger logger = LoggerFactory.getLogger(PrizeController.class);

    public AwardRes awardToUser(AwardReq req){
        String reqJson = JSON.toJSONString(req);
        AwardRes awardRes = null;

        try {
            logger.info("奖品发放开始{}。req:{}", req.getuId(), reqJson);
            // 按照不同类型方法商品[1优惠券、2实物商品、3第三方兑换卡(爱奇艺)]
            if(req.getAwardType() == 1){
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(req.getuId(), req.getAwardNumber(), req.getBizId());
                if("0000".equals(couponResult.getCode())){
                    awardRes = new AwardRes("0000","发放成功");
                }else {
                    awardRes = new AwardRes("0001", couponResult.getInfo());
                }
            }else if (req.getAwardType() == 2){
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                deliverReq.setUsername(queryUserName(req.getuId()));
                deliverReq.setUserPhone(queryUserPhoneNumber(req.getuId()));
                deliverReq.setSku(req.getAwardNumber());
                deliverReq.setOrderId(req.getBizId());
                deliverReq.setConsigneeUserName(req.getExtMap().get("consigneeUserName"));
                deliverReq.setConsigneeUserPhone(req.getExtMap().get("consigneeUserPhone"));
                deliverReq.setConsigneeUserAddress(req.getExtMap().get("consigneeUserAddress"));
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if(isSuccess){
                    awardRes = new AwardRes("0000","发放成功");
                }else {
                    awardRes = new AwardRes("0001","发放失败");
                }
            }else if(req.getAwardType() == 3){
                String bindMobileNumber = queryUserPhoneNumber(req.getuId());
                IQiYiCardService iQiYiCardService = new IQiYiCardService();
                iQiYiCardService.grantToken(bindMobileNumber,req.getAwardNumber());
                awardRes = new AwardRes("0000","发放成功");
            }
            logger.info("奖品发放完成{}。", req.getuId());
        } catch (Exception e) {
            logger.error("奖品发放失败{}。req:{}", req.getuId(), reqJson, e);
            awardRes = new AwardRes("0001", e.getMessage());
        }

        return awardRes;
    }

    private String queryUserPhoneNumber(String uId) {
        return "17787603239";
    }

    private String queryUserName(String uId) {
        return "xiaov";
    }


}
