package com.company.project.service.impl.DTO;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;


@Data
public class VoteOrderDTO {
    /**
     * 管理端订单号展示id
     */
    private String orderId;

    /**
     * 订单金额
     */
    private BigDecimal orderMoney;

    /**
     * 订单创建时间
     */
    private Date createTime;

    /**
     * 活动id
     */
    private Integer activityId;

    public VoteOrderDTO() {
    }

    public VoteOrderDTO(String orderId, BigDecimal orderMoney, Date createTime, Integer activityId) {
        this.orderId = orderId;
        this.orderMoney = orderMoney;
        this.createTime = createTime;
        this.activityId = activityId;
    }
}
