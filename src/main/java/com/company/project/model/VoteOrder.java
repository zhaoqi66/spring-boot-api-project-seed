package com.company.project.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "vote_order")
public class VoteOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 订单创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 注册用户id
     */
    @Column(name = "open_id")
    private String openId;

    /**
     * 订单描述
     */
    @Column(name = "order_desc")
    private String orderDesc;

    /**
     * 管理端订单号展示id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 订单金额
     */
    @Column(name = "order_money")
    private BigDecimal orderMoney;

    /**
     * 预支付id
     */
    @Column(name = "prepay_id")
    private String prepayId;

    /**
     * 微信支付订单号
     */
    @Column(name = "transaction_id")
    private String transactionId;

    /**
     * 人气数
     */
    @Column(name = "vote_poll")
    private Integer votePoll;

    /**
     * 活动id
     */
    @Column(name = "activity_id")
    private Integer activityId;

    /**
     * 支付状态（0-未支付成功，1-支付成功）
     */
    private String status;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单创建时间
     *
     * @return create_time - 订单创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间
     *
     * @param createTime 订单创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取注册用户id
     *
     * @return open_id - 注册用户id
     */
    public String getOpenId() {
        return openId;
    }

    /**
     * 设置注册用户id
     *
     * @param openId 注册用户id
     */
    public void setOpenId(String openId) {
        this.openId = openId;
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
     * 获取管理端订单号展示id
     *
     * @return order_id - 管理端订单号展示id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置管理端订单号展示id
     *
     * @param orderId 管理端订单号展示id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单金额
     *
     * @return order_money - 订单金额
     */
    public BigDecimal getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置订单金额
     *
     * @param orderMoney 订单金额
     */
    public void setOrderMoney(BigDecimal orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * 获取预支付id
     *
     * @return prepay_id - 预支付id
     */
    public String getPrepayId() {
        return prepayId;
    }

    /**
     * 设置预支付id
     *
     * @param prepayId 预支付id
     */
    public void setPrepayId(String prepayId) {
        this.prepayId = prepayId;
    }

    /**
     * 获取微信支付订单号
     *
     * @return transaction_id - 微信支付订单号
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * 设置微信支付订单号
     *
     * @param transactionId 微信支付订单号
     */
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    /**
     * 获取人气数
     *
     * @return vote_poll - 人气数
     */
    public Integer getVotePoll() {
        return votePoll;
    }

    /**
     * 设置人气数
     *
     * @param votePoll 人气数
     */
    public void setVotePoll(Integer votePoll) {
        this.votePoll = votePoll;
    }

    /**
     * 获取活动id
     *
     * @return activity_id - 活动id
     */
    public Integer getActivityId() {
        return activityId;
    }

    /**
     * 设置活动id
     *
     * @param activityId 活动id
     */
    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    /**
     * 获取支付状态（0-未支付成功，1-支付成功）
     *
     * @return status - 支付状态（0-未支付成功，1-支付成功）
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置支付状态（0-未支付成功，1-支付成功）
     *
     * @param status 支付状态（0-未支付成功，1-支付成功）
     */
    public void setStatus(String status) {
        this.status = status;
    }
}