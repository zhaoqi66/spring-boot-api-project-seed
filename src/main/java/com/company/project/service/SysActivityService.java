package com.company.project.service;

import com.company.project.core.PageResult;
import com.company.project.core.Result;
import com.company.project.model.SysActivity;
import com.company.project.service.impl.DTO.SysActivityDTO;
import com.company.project.web.vm.SysActivityVA;
import com.company.project.web.vm.SysActivityVm;

import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2018/09/10.
 */
public interface SysActivityService {

    List<SysActivity> selectByActivityStatus();

    boolean addActivity(SysActivityVm sysActivityVm);

    SysActivity selectByActicityId(Integer activityId);

    boolean deleteActivity(SysActivity sysActivity);

    Result updateActivity(SysActivityVA sysActivityVa);

    Map<String, Object> listActivity(Integer pageNum, Integer pageSize);

    PageResult<SysActivity> listAll();

    SysActivityDTO findOne(Integer activityId);

    void autoUpdate();

    Result findNew();
}
