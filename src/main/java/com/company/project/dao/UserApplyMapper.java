package com.company.project.dao;

import com.company.project.model.UserApply;
import com.company.project.model.UserApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserApplyMapper {
    int countByExample(UserApplyExample example);

    int deleteByExample(UserApplyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserApply record);

    int insertSelective(UserApply record);

    List<UserApply> selectByExample(UserApplyExample example);

    UserApply selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserApply record, @Param("example") UserApplyExample example);

    int updateByExample(@Param("record") UserApply record, @Param("example") UserApplyExample example);

    int updateByPrimaryKeySelective(UserApply record);

    int updateByPrimaryKey(UserApply record);
}