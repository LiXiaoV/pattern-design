package com.xiaov.section01_factory_methon_pattern.scene00.coupon;

/**
 * 模拟优惠券服务
 *
 * @author xiaov
 * @since 2021-05-17 11:45
 */
public class CouponService {
    /**
     * 发送优惠券
     * @param uId 被发送者的用户Id
     * @param couponNumber 优惠券号
     * @param uuid 优惠券uuid（防伪）
     * @return CouponResult对象
     */
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张:");
        System.out.println("uId = " + uId);
        System.out.println("couponNumber = " + couponNumber);
        System.out.println("uuid = " + uuid);
        return new CouponResult("0000", "发放成功");
    }
}
