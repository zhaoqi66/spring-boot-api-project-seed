package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.SysActivity;
import com.company.project.model.SysActivityExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysActivityMapper {
    int countByExample(SysActivityExample example);

    int deleteByExample(SysActivityExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(SysActivity record);

    int insertSelective(SysActivity record);

    List<SysActivity> selectByExample(SysActivityExample example);

    SysActivity selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") SysActivity record, @Param("example") SysActivityExample example);

    int updateByExample(@Param("record") SysActivity record, @Param("example") SysActivityExample example);

    int updateByPrimaryKeySelective(SysActivity record);

    int updateByPrimaryKey(SysActivity record);
}