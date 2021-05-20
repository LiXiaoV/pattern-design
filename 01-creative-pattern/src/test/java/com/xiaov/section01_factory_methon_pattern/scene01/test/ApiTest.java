package com.xiaov.section01_factory_methon_pattern.scene01.test;

import com.alibaba.fastjson.JSON;
import com.xiaov.section01_factory_methon_pattern.scene01.AwardReq;
import com.xiaov.section01_factory_methon_pattern.scene01.AwardRes;
import com.xiaov.section01_factory_methon_pattern.scene01.PrizeController;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @author xiaov
 * @since 2021-05-17 15:11
 */
public class ApiTest {
    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    @Test
    public void test_awardToUser() {
        PrizeController prizeController = new PrizeController();

        System.out.println("\r\n模拟发放优惠券测试\r\n");
        // 模拟发放优惠券测试
        AwardReq awardReq01 = new AwardReq();
        awardReq01.setuId("10001");
        awardReq01.setAwardType(1);
        awardReq01.setAwardNumber("EGM1023938910232121323432");
        awardReq01.setBizId("791098764902132");
        AwardRes awardRes01 = prizeController.awardToUser(awardReq01);

        logger.info("请求参数：{}", JSON.toJSON(awardReq01));
        logger.info("测试结果：{}", JSON.toJSON(awardRes01));

        System.out.println("\r\n模拟发放实物商品测试\r\n");
        // 模拟发放实物商品测试
        AwardReq awardReq02 = new AwardReq();
        awardReq02.setuId("10001");
        awardReq02.setAwardType(2);
        awardReq02.setAwardNumber("9820198721311");
        awardReq02.setBizId("1023000020112221113");
        awardReq02.setExtMap(new HashMap<String, String>(){{
            put("consigneeUserName","xiaoMing");
            put("consigneeUserPhone","15200292123");
            put("consigneeUserAddress","广东省.广州市.番禺区.小谷围街.华南理工大学");
        }});

        AwardRes awardRes02 = prizeController.awardToUser(awardReq02);
        logger.info("请求参数：{}", JSON.toJSON(awardReq02));
        logger.info("测试结果：{}", JSON.toJSON(awardRes02));

        System.out.println("\r\n模拟发放第三方兑换卡(爱奇艺)测试\r\n");
        // 模拟发放第三方兑换卡(爱奇艺)测试
        AwardReq awardReq03 = new AwardReq();
        awardReq03.setuId("10001");
        awardReq03.setAwardType(3);
        awardReq03.setAwardNumber("AQY1xjkUodl8LO975GdfrYUio");

        AwardRes awardRes03 = prizeController.awardToUser(awardReq03);
        logger.info("请求参数：{}", JSON.toJSON(awardReq03));
        logger.info("测试结果：{}", JSON.toJSON(awardRes03));
    }
}
