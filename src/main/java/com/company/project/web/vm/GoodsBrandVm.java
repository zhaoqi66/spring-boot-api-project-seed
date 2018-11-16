package com.company.project.web.vm;

import lombok.Data;

import javax.persistence.Column;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
@Data
public class GoodsBrandVm {
    /**
     * 品牌ID
     */
    private String brandId;

    /**
     * 品牌名称
     */
    private String brandName;

    /**
     * 品牌介绍
     */
    private String brandDesc;

    /**
     * 状态(0禁用 1使用)
     */
    private Byte brandStatus;

}
