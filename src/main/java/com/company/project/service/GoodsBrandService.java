package com.company.project.service;

import com.company.project.core.Result;
import com.company.project.model.GoodsBrand;
import com.company.project.service.impl.DTO.GoodsBrandListDTO;
import com.company.project.web.vm.GoodsBrandVm;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
public interface GoodsBrandService {
    Result addBrand(GoodsBrandVm goodsBrandVm);

    Result updateBrand(GoodsBrandVm goodsBrandVm);

    Result deleteBrand(String brandId);

    PageInfo<GoodsBrand> findBrandPage(String brandName, int pageNumber, int pageSize);

    List<GoodsBrandListDTO> findBrandList();
}
