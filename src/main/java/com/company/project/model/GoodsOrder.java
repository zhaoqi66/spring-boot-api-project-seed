package com.company.project.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "goods_order")
public class GoodsOrder {
    /**
     * 订单id
     */
    @Id
    @Column(name = "order_id")
    private String orderId;

    /**
     * 订单展示ID
     */
    @Column(name = "order_show_id")
    private String orderShowId;

    /**
     * 商品总金额
     */
    @Column(name = "order_old_price")
    private BigDecimal orderOldPrice;

    /**
     * 订单总金额
     */
    @Column(name = "order_pre_price")
    private BigDecimal orderPrePrice;

    /**
     * 实付金额
     */
    @Column(name = "order_price")
    private BigDecimal orderPrice;

    /**
     * 商品总数量
     */
    @Column(name = "order_number")
    private Integer orderNumber;

    /**
     * 支付类型：1、在线支付，2、货到付款
     */
    @Column(name = "order_line_pay")
    private String orderLinePay;

    /**
     * 邮费
     */
    @Column(name = "express_price")
    private BigDecimal expressPrice;

    /**
     * 状态：1、未付款，2、已付款，未发货，3、未取货，4、已发货，5、交易成功，6、交易取消
     */
    @Column(name = "order_status")
    private String orderStatus;

    /**
     * 订单创建时间
     */
    @Column(name = "order_create_time")
    private Date orderCreateTime;

    /**
     * 订单更新时间
     */
    @Column(name = "order_update_time")
    private Date orderUpdateTime;

    /**
     * 付款时间
     */
    @Column(name = "order_pay_time")
    private Date orderPayTime;

    /**
     * 发货时间
     */
    @Column(name = "send_express")
    private Date sendExpress;

    /**
     * 交易完成时间
     */
    @Column(name = "get_goods_time")
    private Date getGoodsTime;

    /**
     * 交易关闭时间
     */
    @Column(name = "order_cancel_time")
    private Date orderCancelTime;

    /**
     * 物流ID
     */
    @Column(name = "shipping_id")
    private String shippingId;

    /**
     * 用户ID
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 买家留言
     */
    @Column(name = "order_buyer_message")
    private String orderBuyerMessage;

    /**
     * 用户预支付id
     */
    @Column(name = "prepay_id")
    private String prepayId;

    /**
     * 订单描述
     */
    @Column(name = "order_desc")
    private String orderDesc;

    /**
     * 微信支付成功的交易单号
     */
    @Column(name = "transaction_id")
    private String transactionId;

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
     * 获取订单展示ID
     *
     * @return order_show_id - 订单展示ID
     */
    public String getOrderShowId() {
        return orderShowId;
    }

    /**
     * 设置订单展示ID
     *
     * @param orderShowId 订单展示ID
     */
    public void setOrderShowId(String orderShowId) {
        this.orderShowId = orderShowId;
    }

    /**
     * 获取商品总金额
     *
     * @return order_old_price - 商品总金额
     */
    public BigDecimal getOrderOldPrice() {
        return orderOldPrice;
    }

    /**
     * 设置商品总金额
     *
     * @param orderOldPrice 商品总金额
     */
    public void setOrderOldPrice(BigDecimal orderOldPrice) {
        this.orderOldPrice = orderOldPrice;
    }

    /**
     * 获取订单总金额
     *
     * @return order_pre_price - 订单总金额
     */
    public BigDecimal getOrderPrePrice() {
        return orderPrePrice;
    }

    /**
     * 设置订单总金额
     *
     * @param orderPrePrice 订单总金额
     */
    public void setOrderPrePrice(BigDecimal orderPrePrice) {
        this.orderPrePrice = orderPrePrice;
    }

    /**
     * 获取实付金额
     *
     * @return order_price - 实付金额
     */
    public BigDecimal getOrderPrice() {
        return orderPrice;
    }

    /**
     * 设置实付金额
     *
     * @param orderPrice 实付金额
     */
    public void setOrderPrice(BigDecimal orderPrice) {
        this.orderPrice = orderPrice;
    }

    /**
     * 获取商品总数量
     *
     * @return order_number - 商品总数量
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * 设置商品总数量
     *
     * @param orderNumber 商品总数量
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * 获取支付类型：1、在线支付，2、货到付款
     *
     * @return order_line_pay - 支付类型：1、在线支付，2、货到付款
     */
    public String getOrderLinePay() {
        return orderLinePay;
    }

    /**
     * 设置支付类型：1、在线支付，2、货到付款
     *
     * @param orderLinePay 支付类型：1、在线支付，2、货到付款
     */
    public void setOrderLinePay(String orderLinePay) {
        this.orderLinePay = orderLinePay;
    }

    /**
     * 获取邮费
     *
     * @return express_price - 邮费
     */
    public BigDecimal getExpressPrice() {
        return expressPrice;
    }

    /**
     * 设置邮费
     *
     * @param expressPrice 邮费
     */
    public void setExpressPrice(BigDecimal expressPrice) {
        this.expressPrice = expressPrice;
    }

    /**
     * 获取状态：1、未付款，2、已付款，未发货，3、未取货，4、已发货，5、交易成功，6、交易取消
     *
     * @return order_status - 状态：1、未付款，2、已付款，未发货，3、未取货，4、已发货，5、交易成功，6、交易取消
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置状态：1、未付款，2、已付款，未发货，3、未取货，4、已发货，5、交易成功，6、交易取消
     *
     * @param orderStatus 状态：1、未付款，2、已付款，未发货，3、未取货，4、已发货，5、交易成功，6、交易取消
     */
    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单创建时间
     *
     * @return order_create_time - 订单创建时间
     */
    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param orderCreateTime 订单创建时间
     */
    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    /**
     * 获取订单更新时间
     *
     * @return order_update_time - 订单更新时间
     */
    public Date getOrderUpdateTime() {
        return orderUpdateTime;
    }

    /**
     * 设置订单更新时间
     *
     * @param orderUpdateTime 订单更新时间
     */
    public void setOrderUpdateTime(Date orderUpdateTime) {
        this.orderUpdateTime = orderUpdateTime;
    }

    /**
     * 获取付款时间
     *
     * @return order_pay_time - 付款时间
     */
    public Date getOrderPayTime() {
        return orderPayTime;
    }

    /**
     * 设置付款时间
     *
     * @param orderPayTime 付款时间
     */
    public void setOrderPayTime(Date orderPayTime) {
        this.orderPayTime = orderPayTime;
    }

    /**
     * 获取发货时间
     *
     * @return send_express - 发货时间
     */
    public Date getSendExpress() {
        return sendExpress;
    }

    /**
     * 设置发货时间
     *
     * @param sendExpress 发货时间
     */
    public void setSendExpress(Date sendExpress) {
        this.sendExpress = sendExpress;
    }

    /**
     * 获取交易完成时间
     *
     * @return get_goods_time - 交易完成时间
     */
    public Date getGetGoodsTime() {
        return getGoodsTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param getGoodsTime 交易完成时间
     */
    public void setGetGoodsTime(Date getGoodsTime) {
        this.getGoodsTime = getGoodsTime;
    }

    /**
     * 获取交易关闭时间
     *
     * @return order_cancel_time - 交易关闭时间
     */
    public Date getOrderCancelTime() {
        return orderCancelTime;
    }

    /**
     * 设置交易关闭时间
     *
     * @param orderCancelTime 交易关闭时间
     */
    public void setOrderCancelTime(Date orderCancelTime) {
        this.orderCancelTime = orderCancelTime;
    }

    /**
     * 获取物流ID
     *
     * @return shipping_id - 物流ID
     */
    public String getShippingId() {
        return shippingId;
    }

    /**
     * 设置物流ID
     *
     * @param shippingId 物流ID
     */
    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    /**
     * 获取用户ID
     *
     * @return open_id - 用户ID
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置用户ID
     *
     * @param openId 用户ID
     */
    public void setOpenId(String openId) {
        this.openId = openId;
    }

    /**
     * 获取买家留言
     *
     * @return order_buyer_message - 买家留言
     */
    public String getOrderBuyerMessage() {
        return orderBuyerMessage;
    }

    /**
     * 设置买家留言
     *
     * @param orderBuyerMessage 买家留言
     */
    public void setOrderBuyerMessage(String orderBuyerMessage) {
        this.orderBuyerMessage = orderBuyerMessage;
    }

    /**
     * 获取用户预支付id
     *
     * @return prepay_id - 用户预支付id
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * 设置用户预支付id
     *
     * @param prepayId 用户预支付id
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    /**
     * 获取订单描述
     *
     * @return order_desc - 订单描述
     */
    public String getOrderDesc() {
        return orderDesc;
    }

    /**
     * 设置订单描述
     *
     * @param orderDesc 订单描述
     */
    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    /**
     * 获取微信支付成功的交易单号
     *
     * @return transaction_id - 微信支付成功的交易单号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置微信支付成功的交易单号
     *
     * @param transactionId 微信支付成功的交易单号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
}