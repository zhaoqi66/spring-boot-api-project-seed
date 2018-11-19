package com.company.project.service;

import com.company.project.core.Result;
import com.company.project.web.vm.GoodsVm;

import java.util.Map;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
public interface GoodsService {
    Result addProduct(GoodsVm goodsVm);

    Result updateProduct(GoodsVm goodsVm);

    Result deleteProduct(String goodsId);

    Map<String,Object> findProductPage(String goodsName, int pageNumber, int pageSize);
}
