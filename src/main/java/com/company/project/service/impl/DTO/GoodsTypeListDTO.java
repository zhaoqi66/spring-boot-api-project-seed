package com.company.project.service.impl.DTO;

import com.company.project.model.GoodsType;
import lombok.Data;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/16
 */
@Data
public class GoodsTypeListDTO {
    /**
     * 分类ID
     */
    private String typeId;

    /**
     * 分类名称
     */
    private String typeName;

    public GoodsTypeListDTO(GoodsType goodsType) {
        this.typeId = goodsType.getTypeId();
        this.typeName = goodsType.getTypeName();
    }
}
