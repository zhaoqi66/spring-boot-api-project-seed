package com.company.project.dao;

import com.company.project.model.GoodsOrderProduct;
import com.company.project.model.GoodsOrderProductExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsOrderProductMapper {
    int countByExample(GoodsOrderProductExample example);

    int deleteByExample(GoodsOrderProductExample example);

    int deleteByPrimaryKey(String orderProductId);

    int insert(GoodsOrderProduct record);

    int insertSelective(GoodsOrderProduct record);

    List<GoodsOrderProduct> selectByExample(GoodsOrderProductExample example);

    GoodsOrderProduct selectByPrimaryKey(String orderProductId);

    int updateByExampleSelective(@Param("record") GoodsOrderProduct record, @Param("example") GoodsOrderProductExample example);

    int updateByExample(@Param("record") GoodsOrderProduct record, @Param("example") GoodsOrderProductExample example);

    int updateByPrimaryKeySelective(GoodsOrderProduct record);

    int updateByPrimaryKey(GoodsOrderProduct record);
}