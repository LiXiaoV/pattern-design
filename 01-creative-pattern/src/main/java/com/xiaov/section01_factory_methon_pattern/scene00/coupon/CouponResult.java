package com.xiaov.section01_factory_methon_pattern.scene00.coupon;

/**
 * @author xiaov
 * @since 2021-05-17 11:43
 */
public class CouponResult {
    private String code;    //编码
    private String info;    //描述

    public CouponResult(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
