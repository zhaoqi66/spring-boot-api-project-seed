package com.company.project.web.vm;


/**
 * @author FHZD.xiaoxun
 * @date 2018/11/16
 */
public class GoodsTypeVm {
    /**
     * 分类ID
     */
    private String typeId;

    /**
     * 分类名称
     */
    private String typeName;

    /**
     * 分类描述
     */
    private String typeDesc;

    /**
     * 状态(0禁止 1使用)
     */
    private Byte typeStatus;

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public Byte getTypeStatus() {
        return typeStatus;
    }

    public void setTypeStatus(Byte typeStatus) {
        this.typeStatus = typeStatus;
    }
}
