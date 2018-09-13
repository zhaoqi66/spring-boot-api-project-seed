package com.company.project.service.impl;

import com.company.project.core.PageResult;
import com.company.project.dao.SysActivityMapper;
import com.company.project.model.SysActivity;
import com.company.project.model.SysActivityExample;
import com.company.project.service.SysActivityService;
import com.company.project.web.vm.SysActivityVm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
     *
     * @param sysActivity
     * @return
     */
    @Override
    public boolean addActivity(SysActivity sysActivity) {
        //设置活动创建时间
        sysActivity.setCreateTime(new Date());
        //设置活动状态0活动报名中 1活动已结束
        sysActivity.setActivityStatus((byte) 0);
        //活动参与人数    默认为0
        sysActivity.setActivityTakeCount(0);
        //设置删除标记    默认为1正常
        sysActivity.setDeleteFlag((byte) 1);
        //改变存储路径
        String all = sysActivity.getPic().replaceAll("[\\[\\]]", "");
        sysActivity.setPic(all);
        int insert = sysActivityMapper.insert(sysActivity);
        if (insert > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 根据活动ID 查询活动
     *
     * @param activityId
     * @return
     */
    @Override
    public SysActivity selectByActicityId(Integer activityId) {
        SysActivity sysActivity = sysActivityMapper.selectByPrimaryKey(activityId);
        return sysActivity;
    }

    /**
     * 删除活动
     *
     * @param sysActivity
     * @return
     */
    @Override
    public boolean deleteActivity(SysActivity sysActivity) {
        //设置删除标记    0删除
        sysActivity.setDeleteFlag((byte) 0);
        //改变存储路径
        String all = sysActivity.getPic().replaceAll("[\\[\\]]", "");
        sysActivity.setPic(all);
        Integer i = sysActivityMapper.updateByPrimaryKeySelective(sysActivity);
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 更新活动
     *
     * @param sysActivity
     * @return
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
        ArrayList<SysActivityVm> sysActivityVms = new ArrayList<>();
        try {
            for (SysActivity sysActivity : sysActivities) {
                SysActivityVm sysActivityVm = new SysActivityVm();
                BeanUtils.copyProperties(sysActivityVm, sysActivity);
                sysActivityVms.add(sysActivityVm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        PageInfo pageInfo = new PageInfo(sysActivityVms);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        map.put("pageNum",pageInfo.getPageNum());
        map.put("pageSize",pageInfo.getPageSize());
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

}
