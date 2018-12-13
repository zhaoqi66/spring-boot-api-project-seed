package com.company.project.service;


import com.company.project.model.GoodsOrderShipping;

/**
 * Created by CodeGenerator on 2018/11/27.
 */
public interface GoodsOrderShippingService{

    GoodsOrderShipping findByOrderId(String orderId);
}
