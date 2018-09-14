package com.company.project.service.impl;

import com.company.project.core.PageResult;
import com.company.project.dao.SysActivityMapper;
import com.company.project.model.SysActivity;
import com.company.project.model.SysActivityExample;
import com.company.project.service.SysActivityService;
import com.company.project.service.impl.DTO.SysActivityDTO;
import com.company.project.web.vm.SysActivityVm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * Created by CodeGenerator on 2018/09/10.
 */
@Service
@Transactional
public class SysActivityServiceImpl implements SysActivityService {

    @Autowired
    private SysActivityMapper sysActivityMapper;

    /**
     * 所有进行报名中的活动
     *
     * @return
     */
    @Override
    public List<SysActivity> selectByActivityStatus() {
        //构建查询条件
        SysActivityExample sysActivityExample = new SysActivityExample();
        SysActivityExample.Criteria criteria = sysActivityExample.createCriteria();
        //活动未删除 且活动正在报名
        criteria.andDeleteFlagEqualTo((byte) 1).andActivityStatusEqualTo((byte) 0);

        List<SysActivity> list = sysActivityMapper.selectByExample(sysActivityExample);
        return list;
    }

    /**
     * 添加活动
     */
    @Override
    public boolean addActivity(SysActivityVm sysActivityVm) {
        String[] p = sysActivityVm.getPic();
        String s = new String();
        for (int i = 0; i < p.length; i++) {
            if (i == p.length - 1) {
                s = s + p[i];
            } else {
                s = s + p[i] + ",";
            }
        }
        SysActivity sysActivity = new SysActivity();
        //设置活动创建时间
        sysActivity.setCreateTime(new Date());
        //设置活动状态0活动报名中 1活动已结束
        sysActivity.setActivityStatus((byte) 0);
        //活动参与人数    默认为0
        sysActivity.setActivityTakeCount(0);
        //设置删除标记    默认为1正常
        sysActivity.setDeleteFlag((byte) 1);
        try {
            BeanUtils.copyProperties(sysActivity, sysActivityVm);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        //设置图片路径
        sysActivity.setPic(s);

        int insert = sysActivityMapper.insert(sysActivity);
        if (insert > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据活动ID 查询活动
     */
    @Override
    public SysActivity selectByActicityId(Integer activityId) {
        SysActivity sysActivity = sysActivityMapper.selectByPrimaryKey(activityId);
        return sysActivity;
    }

    /**
     * 删除活动
     */
    @Override
    public boolean deleteActivity(SysActivity sysActivity) {
        //设置删除标记    0删除
        sysActivity.setDeleteFlag((byte) 0);
        Integer i = sysActivityMapper.updateByPrimaryKeySelective(sysActivity);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 更新活动
     */
    @Override
    public boolean updateActivity(SysActivity sysActivity) {
        sysActivity.setModifiedTime(new Date());
        Integer i = sysActivityMapper.updateByPrimaryKeySelective(sysActivity);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 查询所有活动 分页
     *
     * @param pageNum
     * @param pageSize
     * @return
     */
    @Override
    public Map<String, Object> listActivity(Integer pageNum, Integer pageSize) {
        //构造分页条件
        PageHelper.startPage(pageNum, pageSize);
        //构造查询条件
        SysActivityExample sysActivityExample = new SysActivityExample();
        sysActivityExample.createCriteria().andDeleteFlagEqualTo((byte) 1);
        sysActivityExample.setOrderByClause("activity_status asc,create_time desc");

        List<SysActivity> sysActivities = sysActivityMapper.selectByExample(sysActivityExample);
        ArrayList<SysActivityDTO> sysActivityDTOS = new ArrayList<>();
        if (sysActivities.size() > 0) {
            copyList(sysActivities, sysActivityDTOS);
        }
        PageInfo pageInfo = new PageInfo(sysActivities);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("count", pageInfo.getTotal());
        map.put("data", sysActivityDTOS);
        map.put("pageNum", pageInfo.getPageNum());
        map.put("pageSize", pageInfo.getPageSize());
        return map;

    }

    @Override
    public PageResult<SysActivity> listAll() {
        SysActivityExample sysActivityExample = new SysActivityExample();
        sysActivityExample.createCriteria().andDeleteFlagEqualTo((byte) 1);
        sysActivityExample.setOrderByClause("activity_status asc,create_time desc");

        List<SysActivity> sysActivities = sysActivityMapper.selectByExample(sysActivityExample);
        return new PageResult<>(sysActivities);
    }

    @Override
    public SysActivityDTO findOne(Integer activityId) {
        SysActivity sysActivity = sysActivityMapper.selectByPrimaryKey(activityId);
        String[] pics = sysActivity.getPic().split(",");
        SysActivityDTO sysActivityDTO = new SysActivityDTO(sysActivity,pics);
        return sysActivityDTO;
    }

    private ArrayList<SysActivityDTO> copyList(List<SysActivity> sysActivities, ArrayList<SysActivityDTO> sysActivityDTOS) {
        for (SysActivity sysActivity : sysActivities) {
            String[] pics = sysActivity.getPic().split(",");
            SysActivityDTO sysActivityDTO = new SysActivityDTO(sysActivity,pics);
            sysActivityDTOS.add(sysActivityDTO);
        }
        return sysActivityDTOS;
    }

}
