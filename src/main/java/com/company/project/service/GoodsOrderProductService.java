package com.company.project.service;


import com.company.project.model.GoodsOrderProduct;

import java.util.List;

/**
 * Created by CodeGenerator on 2018/11/27.
 */
public interface GoodsOrderProductService {

    List<GoodsOrderProduct> findByOrderId(String orderId);
}
