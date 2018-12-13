package com.company.project.service.impl;

import com.company.project.dao.GoodsOrderMapper;
import com.company.project.model.GoodsOrder;
import com.company.project.model.GoodsOrderExample;
import com.company.project.service.GoodsOrderProductService;
import com.company.project.service.GoodsOrderService;
import com.company.project.service.GoodsOrderShippingService;
import com.company.project.web.vm.SysOrderVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/11/27.
 */
@Service
@Transactional
public class GoodsOrderServiceImpl implements GoodsOrderService {
    @Resource
    private GoodsOrderMapper goodsOrderMapper;

    @Resource
    private GoodsOrderProductService goodsOrderProductService;
    @Resource
    private GoodsOrderShippingService goodsOrderShippingService;

    @Override
    public PageInfo<SysOrderVo> findPage(String orderShowId, Integer pageNumber, Integer pageSize) {
        //构造分页条件
        PageHelper.startPage(pageNumber, pageSize);

        GoodsOrderExample goodsOrderExample = new GoodsOrderExample();
        if (null!=orderShowId){
            goodsOrderExample.createCriteria().andOrderShowIdLike("%" + orderShowId + "%");
        }
        goodsOrderExample.setOrderByClause("order_create_time desc");
        List<GoodsOrder> goodsOrders = goodsOrderMapper.selectByExample(goodsOrderExample);

        ArrayList<SysOrderVo> sysOrderVos = new ArrayList<>();
        for (GoodsOrder goodsOrder : goodsOrders) {
            SysOrderVo sysOrderVo = new SysOrderVo();
            sysOrderVo.setOrderShowId(goodsOrder.getOrderShowId());
            sysOrderVo.setOrderPrice(goodsOrder.getOrderPrice());
            sysOrderVo.setOrderCreateTime(goodsOrder.getOrderCreateTime());
            sysOrderVo.setOrderStatus(goodsOrder.getOrderStatus());
            sysOrderVo.setGoodsOrderShipping(goodsOrderShippingService.findByOrderId(goodsOrder.getOrderId()));
            sysOrderVo.setGoodsOrderProductList(goodsOrderProductService.findByOrderId(goodsOrder.getOrderId()));
            sysOrderVos.add(sysOrderVo);
        }

        PageInfo<SysOrderVo> sysOrderVoPageInfo = new PageInfo<>(sysOrderVos);
        return sysOrderVoPageInfo;
    }
}
