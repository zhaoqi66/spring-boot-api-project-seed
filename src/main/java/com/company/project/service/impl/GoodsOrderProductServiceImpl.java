package com.company.project.service.impl;

import com.company.project.dao.GoodsOrderProductMapper;
import com.company.project.model.GoodsOrderProduct;
import com.company.project.model.GoodsOrderProductExample;
import com.company.project.service.GoodsOrderProductService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/11/27.
 */
@Service
@Transactional
public class GoodsOrderProductServiceImpl implements GoodsOrderProductService {
    @Resource
    private GoodsOrderProductMapper goodsOrderProductMapper;

    @Override
    public List<GoodsOrderProduct> findByOrderId(String id) {
        GoodsOrderProductExample goodsOrderProductExample = new GoodsOrderProductExample();
        goodsOrderProductExample.createCriteria().andOrderIdEqualTo(id);
        List<GoodsOrderProduct> goodsOrderProducts = goodsOrderProductMapper.selectByExample(goodsOrderProductExample);
        return goodsOrderProducts;
    }
}
