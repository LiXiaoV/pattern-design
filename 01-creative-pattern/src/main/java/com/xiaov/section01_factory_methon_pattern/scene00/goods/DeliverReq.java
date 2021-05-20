package com.xiaov.section01_factory_methon_pattern.scene00.goods;

/**
 * @author xiaov
 * @since 2021-05-17 11:50
 */
public class DeliverReq {
    private String username;                // 用户姓名
    private String userPhone;               // 用户手机号
    private String sku;                     // 商品SKU
    private String orderId;                 // 订单ID
    private String consigneeUserName;       // 收货人姓名
    private String consigneeUserPhone;      // 收货人手机号
    private String consigneeUserAddress;    // 收货人地址

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getConsigneeUserName() {
        return consigneeUserName;
    }

    public void setConsigneeUserName(String consigneeUserName) {
        this.consigneeUserName = consigneeUserName;
    }

    public String getConsigneeUserPhone() {
        return consigneeUserPhone;
    }

    public void setConsigneeUserPhone(String consigneeUserPhone) {
        this.consigneeUserPhone = consigneeUserPhone;
    }

    public String getConsigneeUserAddress() {
        return consigneeUserAddress;
    }

    public void setConsigneeUserAddress(String consigneeUserAddress) {
        this.consigneeUserAddress = consigneeUserAddress;
    }
}
