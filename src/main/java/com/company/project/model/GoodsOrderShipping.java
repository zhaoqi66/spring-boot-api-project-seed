package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "goods_order_shipping")
public class GoodsOrderShipping {
    /**
     * 物流id
     */
    @Id
    @Column(name = "shipping_id")
    private String shippingId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 收货人名字
     */
    @Column(name = "shipping_customer_name")
    private String shippingCustomerName;

    /**
     * 收货人联系方式
     */
    @Column(name = "shipping_customer_telephone")
    private String shippingCustomerTelephone;

    /**
     * 收货详细地址
     */
    @Column(name = "shipping_area_detail")
    private String shippingAreaDetail;

    /**
     * 物流单创建时间
     */
    @Column(name = "shipping_create_time")
    private Date shippingCreateTime;

    /**
     * 物流单更新时间
     */
    @Column(name = "shipping_update_time")
    private Date shippingUpdateTime;

    /**
     * 物流方式：0、物流配送，1、自提
     */
    @Column(name = "shipping_type")
    private String shippingType;

    /**
     * 物流名称
     */
    @Column(name = "shipping_name")
    private String shippingName;

    /**
     * 物流单号
     */
    @Column(name = "shipping_code")
    private String shippingCode;

    /**
     * 获取物流id
     *
     * @return shipping_id - 物流id
     */
    public String getShippingId() {
        return shippingId;
    }

    /**
     * 设置物流id
     *
     * @param shippingId 物流id
     */
    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取收货人名字
     *
     * @return shipping_customer_name - 收货人名字
     */
    public String getShippingCustomerName() {
        return shippingCustomerName;
    }

    /**
     * 设置收货人名字
     *
     * @param shippingCustomerName 收货人名字
     */
    public void setShippingCustomerName(String shippingCustomerName) {
        this.shippingCustomerName = shippingCustomerName;
    }

    /**
     * 获取收货人联系方式
     *
     * @return shipping_customer_telephone - 收货人联系方式
     */
    public String getShippingCustomerTelephone() {
        return shippingCustomerTelephone;
    }

    /**
     * 设置收货人联系方式
     *
     * @param shippingCustomerTelephone 收货人联系方式
     */
    public void setShippingCustomerTelephone(String shippingCustomerTelephone) {
        this.shippingCustomerTelephone = shippingCustomerTelephone;
    }

    /**
     * 获取收货详细地址
     *
     * @return shipping_area_detail - 收货详细地址
     */
    public String getShippingAreaDetail() {
        return shippingAreaDetail;
    }

    /**
     * 设置收货详细地址
     *
     * @param shippingAreaDetail 收货详细地址
     */
    public void setShippingAreaDetail(String shippingAreaDetail) {
        this.shippingAreaDetail = shippingAreaDetail;
    }

    /**
     * 获取物流单创建时间
     *
     * @return shipping_create_time - 物流单创建时间
     */
    public Date getShippingCreateTime() {
        return shippingCreateTime;
    }

    /**
     * 设置物流单创建时间
     *
     * @param shippingCreateTime 物流单创建时间
     */
    public void setShippingCreateTime(Date shippingCreateTime) {
        this.shippingCreateTime = shippingCreateTime;
    }

    /**
     * 获取物流单更新时间
     *
     * @return shipping_update_time - 物流单更新时间
     */
    public Date getShippingUpdateTime() {
        return shippingUpdateTime;
    }

    /**
     * 设置物流单更新时间
     *
     * @param shippingUpdateTime 物流单更新时间
     */
    public void setShippingUpdateTime(Date shippingUpdateTime) {
        this.shippingUpdateTime = shippingUpdateTime;
    }

    /**
     * 获取物流方式：0、物流配送，1、自提
     *
     * @return shipping_type - 物流方式：0、物流配送，1、自提
     */
    public String getShippingType() {
        return shippingType;
    }

    /**
     * 设置物流方式：0、物流配送，1、自提
     *
     * @param shippingType 物流方式：0、物流配送，1、自提
     */
    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    /**
     * 获取物流名称
     *
     * @return shipping_name - 物流名称
     */
    public String getShippingName() {
        return shippingName;
    }

    /**
     * 设置物流名称
     *
     * @param shippingName 物流名称
     */
    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    /**
     * 获取物流单号
     *
     * @return shipping_code - 物流单号
     */
    public String getShippingCode() {
        return shippingCode;
    }

    /**
     * 设置物流单号
     *
     * @param shippingCode 物流单号
     */
    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }
}