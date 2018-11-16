package com.company.project.model;

import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "goods_type")
public class GoodsType {
    /**
     * 分类ID
     */
    @Id
    @Column(name = "type_id")
    private String typeId;

    /**
     * 分类名称
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 分类描述
     */
    @Column(name = "type_desc")
    private String typeDesc;

    /**
     * 状态(0禁止 1使用)
     */
    @Column(name = "type_status")
    private Byte typeStatus;

    /**
     * 排序
     */
    @Column(name = "type_sort")
    private Integer typeSort;

    /**
     * 创建时间
     */
    @Column(name = "type_create_time")
    private Date typeCreateTime;

    /**
     * 更新时间
     */
    @Column(name = "type_update_time")
    private Date typeUpdateTime;

    /**
     * 删除标记(0删除 1正常)
     */
    @Column(name = "type_delflag")
    private Byte typeDelflag;

    /**
     * 删除时间
     */
    @Column(name = "type_del_time")
    private Date typeDelTime;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId == null ? null : typeId.trim();
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc == null ? null : typeDesc.trim();
    }

    public Byte getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(Byte typeStatus) {
        this.typeStatus = typeStatus;
    }

    public Integer getTypeSort() {
        return typeSort;
    }

    public void setTypeSort(Integer typeSort) {
        this.typeSort = typeSort;
    }

    public Date getTypeCreateTime() {
        return typeCreateTime;
    }

    public void setTypeCreateTime(Date typeCreateTime) {
        this.typeCreateTime = typeCreateTime;
    }

    public Date getTypeUpdateTime() {
        return typeUpdateTime;
    }

    public void setTypeUpdateTime(Date typeUpdateTime) {
        this.typeUpdateTime = typeUpdateTime;
    }

    public Byte getTypeDelflag() {
        return typeDelflag;
    }

    public void setTypeDelflag(Byte typeDelflag) {
        this.typeDelflag = typeDelflag;
    }

    public Date getTypeDelTime() {
        return typeDelTime;
    }

    public void setTypeDelTime(Date typeDelTime) {
        this.typeDelTime = typeDelTime;
    }
}