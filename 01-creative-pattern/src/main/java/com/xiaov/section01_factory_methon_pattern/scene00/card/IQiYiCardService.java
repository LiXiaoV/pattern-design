package com.xiaov.section01_factory_methon_pattern.scene00.card;

/**
 * 模拟爱奇艺会员卡服务
 * @author xiaov
 * @since 2021-05-17 11:39
 */
public class IQiYiCardService {

    /**
     * 授权token
     * @param bindMobileNumber 手机号
     * @param cardId 会员卡Id
     */
    public void grantToken(String bindMobileNumber,String cardId){
        System.out.println("模拟发放爱奇艺会员卡一张：");
        System.out.println("bindMobileNumber = " + bindMobileNumber);
        System.out.println("cardId = " + cardId);
    }
}
