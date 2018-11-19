package com.company.project.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

@Table(name = "goods")
public class Goods {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "goods_id")
    private String goodsId;

    /**
     * 商品展示ID
     */
    @Column(name = "goods_show_id")
    private String goodsShowId;

    /**
     * 商品名称
     */
    @Column(name = "goods_name")
    private String goodsName;

    /**
     * 商品图片
     */
    @Column(name = "goods_img")
    private String goodsImg;

    /**
     * 商品价格
     */
    @Column(name = "goods_price")
    private BigDecimal goodsPrice;

    /**
     * 商品数量
     */
    @Column(name = "goods_num")
    private Integer goodsNum;

    /**
     * 商品排序
     */
    @Column(name = "goods_sort")
    private Integer goodsSort;

    /**
     * 创建时间
     */
    @Column(name = "goods_create_time")
    private Date goodsCreateTime;

    /**
     * 更新时间
     */
    @Column(name = "goods_update_time")
    private Date goodsUpdateTime;

    /**
     * 商品删除标记(0删除 1正常)
     */
    @Column(name = "goods_delflag")
    private Byte goodsDelflag;

    /**
     * 商品删除时间
     */
    @Column(name = "goods_delflag")
    private Date goodsDeltime;

    /**
     * 商品描述
     */
    @Column(name = "goods_brief")
    private String goodsBrief;

    /**
     * 分类ID
     */
    @Column(name = "type_id")
    private String typeId;

    /**
     * 品牌ID
     */
    @Column(name = "brand_id")
    private String brandId;

    /**
     * 上下架状态(0下架 1上架)
     */
    @Column(name = "goods_status")
    private Byte goodsStatus;

    /**
     * 上架时间
     */
    @Column(name = "goods_added_time")
    private Date goodsAddedTime;

    /**
     * 下架时间
     */
    @Column(name = "goods_unadded_time")
    private Date goodsUnaddedTime;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId == null ? null : goodsId.trim();
    }

    public String getGoodsShowId() {
        return goodsShowId;
    }

    public void setGoodsShowId(String goodsShowId) {
        this.goodsShowId = goodsShowId == null ? null : goodsShowId.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    public BigDecimal getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(BigDecimal goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getGoodsSort() {
        return goodsSort;
    }

    public void setGoodsSort(Integer goodsSort) {
        this.goodsSort = goodsSort;
    }

    public Date getGoodsCreateTime() {
        return goodsCreateTime;
    }

    public void setGoodsCreateTime(Date goodsCreateTime) {
        this.goodsCreateTime = goodsCreateTime;
    }

    public Date getGoodsUpdateTime() {
        return goodsUpdateTime;
    }

    public void setGoodsUpdateTime(Date goodsUpdateTime) {
        this.goodsUpdateTime = goodsUpdateTime;
    }

    public Byte getGoodsDelflag() {
        return goodsDelflag;
    }

    public void setGoodsDelflag(Byte goodsDelflag) {
        this.goodsDelflag = goodsDelflag;
    }

    public Date getGoodsDeltime() {
        return goodsDeltime;
    }

    public void setGoodsDeltime(Date goodsDeltime) {
        this.goodsDeltime = goodsDeltime;
    }

    public String getGoodsBrief() {
        return goodsBrief;
    }

    public void setGoodsBrief(String goodsBrief) {
        this.goodsBrief = goodsBrief == null ? null : goodsBrief.trim();
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public Byte getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Byte goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Date getGoodsAddedTime() {
        return goodsAddedTime;
    }

    public void setGoodsAddedTime(Date goodsAddedTime) {
        this.goodsAddedTime = goodsAddedTime;
    }

    public Date getGoodsUnaddedTime() {
        return goodsUnaddedTime;
    }

    public void setGoodsUnaddedTime(Date goodsUnaddedTime) {
        this.goodsUnaddedTime = goodsUnaddedTime;
    }
}