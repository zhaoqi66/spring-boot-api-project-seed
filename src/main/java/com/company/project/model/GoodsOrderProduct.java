package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Table(name = "goods_order_product")
public class GoodsOrderProduct {
    /**
     * 订单详情ID
     */
    @Id
    @Column(name = "order_product_id")
    private String orderProductId;

    /**
     * 商品id
     */
    @Column(name = "goods_id")
    private String goodsId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品购买数量
     */
    @Column(name = "order_goods_number")
    private Integer orderGoodsNumber;

    /**
     * 商品名称
     */
    @Column(name = "order_goods_title")
    private String orderGoodsTitle;

    /**
     * 商品单价
     */
    @Column(name = "order_goods_price")
    private BigDecimal orderGoodsPrice;

    /**
     * 商品总金额
     */
    @Column(name = "order_total_fee")
    private BigDecimal orderTotalFee;

    /**
     * 商品图片
     */
    @Column(name = "order_goods_image")
    private String orderGoodsImage;

    /**
     * 获取订单详情ID
     *
     * @return order_product_id - 订单详情ID
     */
    public String getOrderProductId() {
        return orderProductId;
    }

    /**
     * 设置订单详情ID
     *
     * @param orderProductId 订单详情ID
     */
    public void setOrderProductId(String orderProductId) {
        this.orderProductId = orderProductId;
    }

    /**
     * 获取商品id
     *
     * @return goods_id - 商品id
     */
    public String getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品id
     *
     * @param goodsId 商品id
     */
    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
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
     * 获取商品购买数量
     *
     * @return order_goods_number - 商品购买数量
     */
    public Integer getOrderGoodsNumber() {
        return orderGoodsNumber;
    }

    /**
     * 设置商品购买数量
     *
     * @param orderGoodsNumber 商品购买数量
     */
    public void setOrderGoodsNumber(Integer orderGoodsNumber) {
        this.orderGoodsNumber = orderGoodsNumber;
    }

    /**
     * 获取商品名称
     *
     * @return order_goods_title - 商品名称
     */
    public String getOrderGoodsTitle() {
        return orderGoodsTitle;
    }

    /**
     * 设置商品名称
     *
     * @param orderGoodsTitle 商品名称
     */
    public void setOrderGoodsTitle(String orderGoodsTitle) {
        this.orderGoodsTitle = orderGoodsTitle;
    }

    /**
     * 获取商品单价
     *
     * @return order_goods_price - 商品单价
     */
    public BigDecimal getOrderGoodsPrice() {
        return orderGoodsPrice;
    }

    /**
     * 设置商品单价
     *
     * @param orderGoodsPrice 商品单价
     */
    public void setOrderGoodsPrice(BigDecimal orderGoodsPrice) {
        this.orderGoodsPrice = orderGoodsPrice;
    }

    /**
     * 获取商品总金额
     *
     * @return order_total_fee - 商品总金额
     */
    public BigDecimal getOrderTotalFee() {
        return orderTotalFee;
    }

    /**
     * 设置商品总金额
     *
     * @param orderTotalFee 商品总金额
     */
    public void setOrderTotalFee(BigDecimal orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    /**
     * 获取商品图片
     *
     * @return order_goods_image - 商品图片
     */
    public String getOrderGoodsImage() {
        return orderGoodsImage;
    }

    /**
     * 设置商品图片
     *
     * @param orderGoodsImage 商品图片
     */
    public void setOrderGoodsImage(String orderGoodsImage) {
        this.orderGoodsImage = orderGoodsImage;
    }
}