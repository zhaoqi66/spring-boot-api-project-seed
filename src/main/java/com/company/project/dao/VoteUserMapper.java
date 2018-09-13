package com.company.project.dao;

import com.company.project.model.VoteUser;
import com.company.project.model.VoteUserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VoteUserMapper {
    int countByExample(VoteUserExample example);

    int deleteByExample(VoteUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(VoteUser record);

    int insertSelective(VoteUser record);

    List<VoteUser> selectByExample(VoteUserExample example);

    VoteUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") VoteUser record, @Param("example") VoteUserExample example);

    int updateByExample(@Param("record") VoteUser record, @Param("example") VoteUserExample example);

    int updateByPrimaryKeySelective(VoteUser record);

    int updateByPrimaryKey(VoteUser record);
}