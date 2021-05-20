package com.xiaov.section01_factory_methon_pattern.scene02.store;

import java.util.Map;

/**
 * @author xiaov
 * @since 2021-05-18 20:34
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
