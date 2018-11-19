package com.company.project.service.impl.DTO;

import com.company.project.model.Goods;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/19
 */
@Data
public class GoodsDTO {

    /**
     * 商品ID
     */
    private String goodsId;

    /**
     * 商品展示ID
     */
    private String goodsShowId;

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
     * 商品排序
     */
    private Integer goodsSort;

    /**
     * 创建时间
     */
    private Date goodsCreateTime;

    /**
     * 更新时间
     */
    private Date goodsUpdateTime;

    /**
     * 商品删除标记(0删除 1正常)
     */
    private Byte goodsDelflag;

    /**
     * 商品删除时间
     */
    private Date goodsDeltime;

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

    /**
     * 上架时间
     */
    private Date goodsAddedTime;

    /**
     * 下架时间
     */
    private Date goodsUnaddedTime;

    public GoodsDTO(Goods goods,String[] imgUrl){
        this.goodsId = goods.getGoodsId();
        this.goodsShowId = goods.getGoodsShowId();
        this.goodsName = goods.getGoodsName();
        this.goodsImg = imgUrl;
        this.goodsPrice = goods.getGoodsPrice();
        this.goodsNum = goods.getGoodsNum();
        this.goodsSort = goods.getGoodsSort();
        this.goodsCreateTime = goods.getGoodsCreateTime();
        this.goodsUpdateTime = goods.getGoodsUpdateTime();
        this.goodsDelflag = goods.getGoodsDelflag();
        this.goodsDeltime = goods.getGoodsDeltime();
        this.goodsBrief = goods.getGoodsBrief();
        this.typeId = goods.getTypeId();
        this.brandId = goods.getBrandId();
        this.goodsStatus = goods.getGoodsStatus();
        this.goodsAddedTime = goods.getGoodsAddedTime();
        this.goodsUnaddedTime = goods.getGoodsUnaddedTime();
    }
}
