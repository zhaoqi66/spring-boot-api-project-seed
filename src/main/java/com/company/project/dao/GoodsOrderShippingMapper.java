package com.company.project.dao;

import com.company.project.model.GoodsOrderShipping;
import com.company.project.model.GoodsOrderShippingExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsOrderShippingMapper {
    int countByExample(GoodsOrderShippingExample example);

    int deleteByExample(GoodsOrderShippingExample example);

    int deleteByPrimaryKey(String shippingId);

    int insert(GoodsOrderShipping record);

    int insertSelective(GoodsOrderShipping record);

    List<GoodsOrderShipping> selectByExample(GoodsOrderShippingExample example);

    GoodsOrderShipping selectByPrimaryKey(String shippingId);

    int updateByExampleSelective(@Param("record") GoodsOrderShipping record, @Param("example") GoodsOrderShippingExample example);

    int updateByExample(@Param("record") GoodsOrderShipping record, @Param("example") GoodsOrderShippingExample example);

    int updateByPrimaryKeySelective(GoodsOrderShipping record);

    int updateByPrimaryKey(GoodsOrderShipping record);
}