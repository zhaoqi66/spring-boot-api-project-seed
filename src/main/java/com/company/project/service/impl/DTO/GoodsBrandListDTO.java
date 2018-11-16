package com.company.project.service.impl.DTO;

import com.company.project.model.GoodsBrand;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/16
 */
public class GoodsBrandListDTO {
    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public GoodsBrandListDTO(GoodsBrand goodsBrand) {
        this.brandId = goodsBrand.getBrandId();
        this.brandName = goodsBrand.getBrandName();
    }
}
