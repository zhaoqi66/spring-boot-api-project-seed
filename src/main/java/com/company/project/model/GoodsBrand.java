package com.company.project.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "goods_brand")
public class GoodsBrand {
    /**
     * 品牌ID
     */
    @Id
    @Column(name = "brand_id")
    private String brandId;

    /**
     * 品牌名称
     */
    @Column(name = "brand_name")
    private String brandName;

    /**
     * 品牌排序
     */
    @Column(name = "brand_sort")
    private Integer brandSort;

    /**
     * 品牌介绍
     */
    @Column(name = "brand_desc")
    private String brandDesc;

    /**
     * 状态(0禁用 1使用)
     */
    @Column(name = "brand_status")
    private Byte brandStatus;

    /**
     * 创建时间
     */
    @Column(name = "brand_create_time")
    private Date brandCreateTime;

    /**
     * 修改时间
     */
    @Column(name = "brand_modified_time")
    private Date brandModifiedTime;

    /**
     * 删除标记(0删除 1正常)
     */
    @Column(name = "brand_delflag")
    private Byte brandDelflag;

    /**
     * 删除时间
     */
    @Column(name = "brand_del_time")
    private Date brandDelTime;
    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId == null ? null : brandId.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public Integer getBrandSort() {
        return brandSort;
    }

    public void setBrandSort(Integer brandSort) {
        this.brandSort = brandSort;
    }

    public String getBrandDesc() {
        return brandDesc;
    }

    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc == null ? null : brandDesc.trim();
    }

    public Byte getBrandStatus() {
        return brandStatus;
    }

    public void setBrandStatus(Byte brandStatus) {
        this.brandStatus = brandStatus;
    }

    public Date getBrandCreateTime() {
        return brandCreateTime;
    }

    public void setBrandCreateTime(Date brandCreateTime) {
        this.brandCreateTime = brandCreateTime;
    }

    public Date getBrandModifiedTime() {
        return brandModifiedTime;
    }

    public void setBrandModifiedTime(Date brandModifiedTime) {
        this.brandModifiedTime = brandModifiedTime;
    }

    public Byte getBrandDelflag() {
        return brandDelflag;
    }

    public void setBrandDelflag(Byte brandDelflag) {
        this.brandDelflag = brandDelflag;
    }

    public Date getBrandDelTime() {
        return brandDelTime;
    }

    public void setBrandDelTime(Date brandDelTime) {
        this.brandDelTime = brandDelTime;
    }
}