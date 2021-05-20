package com.xiaov.section01_factory_methon_pattern.scene01;

/**
 * @author xiaov
 * @since 2021-05-17 11:11
 */
public class AwardRes {
    private String code;    // 编码
    private String info;    // 描述

    public AwardRes(String code, String info) {
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
