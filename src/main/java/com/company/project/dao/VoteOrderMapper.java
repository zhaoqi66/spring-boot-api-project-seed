package com.company.project.dao;

import com.company.project.model.VoteOrder;
import com.company.project.model.VoteOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoteOrderMapper {
    int countByExample(VoteOrderExample example);

    int deleteByExample(VoteOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoteOrder record);

    int insertSelective(VoteOrder record);

    List<VoteOrder> selectByExample(VoteOrderExample example);

    VoteOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoteOrder record, @Param("example") VoteOrderExample example);

    int updateByExample(@Param("record") VoteOrder record, @Param("example") VoteOrderExample example);

    int updateByPrimaryKeySelective(VoteOrder record);

    int updateByPrimaryKey(VoteOrder record);
}