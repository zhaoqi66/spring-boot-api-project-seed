package com.company.project.web.vm;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/16
 */
@Data
public class GoodsVm {

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品名称
     */
    private String goodsName;

    /**
     * 商品图片
     */
    private String[] goodsImg;

    /**
     * 商品价格
     */
    private BigDecimal goodsPrice;

    /**
     * 商品数量
     */
    private Integer goodsNum;

    /**
     * 商品描述
     */
    private String goodsBrief;

    /**
     * 分类ID
     */
    private String typeId;

    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 上下架状态(0下架 1上架)
     */
    private Byte goodsStatus;
}
