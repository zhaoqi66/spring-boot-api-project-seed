package com.company.project.service;

import com.company.project.web.vm.GoodsVm;

import java.util.Map;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
public interface GoodsService {
    void addProduct(GoodsVm goodsVm);

    void updateProduct(GoodsVm goodsVm);

    void deleteProduct(String goodsId);

    Map<String,Object> findProductPage(String goodsName, int pageNumber, int pageSize);

    void recommend(String goodsId);

    void unRecommend(String goodsId);
}
