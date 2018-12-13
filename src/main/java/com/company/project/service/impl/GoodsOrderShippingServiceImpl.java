package com.company.project.service.impl;

import com.company.project.core.ServiceException;
import com.company.project.dao.GoodsOrderShippingMapper;
import com.company.project.model.GoodsOrderShipping;
import com.company.project.model.GoodsOrderShippingExample;
import com.company.project.service.GoodsOrderShippingService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/11/27.
 */
@Service
@Transactional
public class GoodsOrderShippingServiceImpl implements GoodsOrderShippingService {
    @Resource
    private GoodsOrderShippingMapper goodsOrderShippingMapper;

    @Override
    public GoodsOrderShipping findByOrderId(String orderId) {
        GoodsOrderShippingExample goodsOrderShippingExample = new GoodsOrderShippingExample();
        goodsOrderShippingExample.createCriteria().andOrderIdEqualTo(orderId);
        List<GoodsOrderShipping> goodsOrderShippings = goodsOrderShippingMapper.selectByExample(goodsOrderShippingExample);
        if (goodsOrderShippings.size() != 1){
            throw new ServiceException("异常!!!");
        }
        return goodsOrderShippings.get(0);
    }
}
