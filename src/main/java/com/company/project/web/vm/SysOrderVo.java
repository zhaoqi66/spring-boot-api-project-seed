package com.company.project.web.vm;

import com.company.project.model.GoodsOrderProduct;
import com.company.project.model.GoodsOrderShipping;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author FHZD.xiaoxun
 * @date 2018/12/10
 */
@Data
public class SysOrderVo {

    /**
     * 订单展示ID
     */
    private String orderShowId;

    /**
     * 实付金额
     */
    private BigDecimal orderPrice;

    /**
     * 状态：1、未付款，2、已付款，未发货，3、未取货，4、已发货，5、交易成功，6、交易取消
     */
    private String orderStatus;

    /**
     * 订单创建时间
     */
    private Date orderCreateTime;

    /**
     * 订单详情列表
     */
    private List<GoodsOrderProduct> goodsOrderProductList;

    /**
     * 订单物流情况
     */
    private GoodsOrderShipping goodsOrderShipping;
}
