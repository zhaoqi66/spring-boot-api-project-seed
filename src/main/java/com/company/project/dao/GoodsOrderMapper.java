package com.company.project.dao;

import com.company.project.model.GoodsOrder;
import com.company.project.model.GoodsOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsOrderMapper {
    int countByExample(GoodsOrderExample example);

    int deleteByExample(GoodsOrderExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(GoodsOrder record);

    int insertSelective(GoodsOrder record);

    List<GoodsOrder> selectByExample(GoodsOrderExample example);

    GoodsOrder selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    int updateByExample(@Param("record") GoodsOrder record, @Param("example") GoodsOrderExample example);

    int updateByPrimaryKeySelective(GoodsOrder record);

    int updateByPrimaryKey(GoodsOrder record);
}