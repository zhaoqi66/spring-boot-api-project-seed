package com.company.project.service;

import com.company.project.core.PageResult;
import com.company.project.model.SysActivity;

import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2018/09/10.
 */
public interface SysActivityService {

    List<SysActivity> selectByActivityStatus();

    boolean addActivity(SysActivity sysActivity);

    SysActivity selectByActicityId(Integer activityId);

    boolean deleteActivity(SysActivity sysActivity);

    boolean updateActivity(SysActivity sysActivity);

    Map<String, Object> listActivity(Integer pageNum, Integer pageSize);

    PageResult<SysActivity> listAll();
}
