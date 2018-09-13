package com.company.project.service;
import com.company.project.model.UserApply;
import com.company.project.core.Service;
import com.company.project.service.impl.DTO.UserApplyDTO;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/09/13.
 */
public interface UserApplyService{

    List<UserApplyDTO> selectByActivityId(Integer activityId);

    void passUserApply(int id);

    UserApply findOne(int id);

    void failUserApply(int id);

    List<UserApplyDTO> findAllOrRank(Integer activityId);
}
