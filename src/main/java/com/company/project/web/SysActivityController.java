package com.company.project.web;

import com.company.project.core.PageResult;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.SysActivity;
import com.company.project.service.SysActivityService;
import com.company.project.service.impl.DTO.SysActivityDTO;
import com.company.project.web.vm.SysActivityVA;
import com.company.project.web.vm.SysActivityVm;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2018/09/10.
 */
@RestController
@RequestMapping("/sys/activity")
@EnableScheduling
public class SysActivityController {
    @Autowired
    private SysActivityService sysActivityService;
    private static final Logger logger = LoggerFactory.getLogger(SysActivityController.class);

    /**
     * 添加活动
     */
    @RequestMapping(value = "/addActivity", method = RequestMethod.POST)
    public Result addActivity(@RequestBody SysActivityVm sysActivityVm) {
        logger.info("添加活动接口SysActivity={}", sysActivityVm.toString());

        if (StringUtils.isEmpty(sysActivityVm)) {
            return ResultGenerator.genFailResult("活动信息添加错误，请仔细核对！！！");
        }
        if (StringUtils.isEmpty(sysActivityVm.getActivityName())) {
            return ResultGenerator.genFailResult("活动名称不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivityVm.getPic())) {
            return ResultGenerator.genFailResult("活动内容不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivityVm.getStartTime())) {
            return ResultGenerator.genFailResult("活动开始时间不能为空！！");
        }
        if (StringUtils.isEmpty(sysActivityVm.getEndTime())) {
            return ResultGenerator.genFailResult("活动结束时间不能为空！！！");
        }

        //查询当前是否有活动在线
        List<SysActivity> list = sysActivityService.selectByActivityStatus();

        if (!list.isEmpty()) {
            return ResultGenerator.genFailResult("当前有活动正在进行中,无法添加新活动！！！");
        }
        if (sysActivityService.addActivity(sysActivityVm)) {
            return ResultGenerator.genSuccessResult("添加成功");
        } else {
            return ResultGenerator.genFailResult("添加失败");
        }
    }

    /**
     * 删除活动
     */
    @RequestMapping(value = "/deleteActivity", method = RequestMethod.POST)
    public Result deleteActivity(Integer activityId) {
        logger.info("删除活动activityId=", activityId);
        if (StringUtils.isEmpty(activityId)) {
            return ResultGenerator.genFailResult("活动编号不能为空!!!");
        }
        //根据活动ID 查询活动
        SysActivity sysActivity = sysActivityService.selectByActicityId(activityId);

        if (StringUtils.isEmpty(sysActivity)) {
            return ResultGenerator.genFailResult("没有查询到指定活动");
        }

        if (sysActivityService.deleteActivity(sysActivity)) {
            return ResultGenerator.genSuccessResult("删除成功");
        } else {
            return ResultGenerator.genFailResult("删除失败");
        }
    }

    /**
     * 修改活动
     */
    @RequestMapping(value = "/updateActivity", method = RequestMethod.POST)
    public Result updateActivity(@RequestBody SysActivityVA sysActivityVa) {
        logger.info("修改活动接口SysActivity=", sysActivityVa.toString());
        return sysActivityService.updateActivity(sysActivityVa);
    }

    /**
     * 查询所有活动
     */
    @RequestMapping(value = "/listActivity", method = RequestMethod.POST)
    public Map<String, Object> listActivity(Integer pageNum, Integer pageSize) {
        logger.info("查询活动接口");
        if (pageNum == null) {
            pageNum = 1;
            pageSize = 10;
        }
        return sysActivityService.listActivity(pageNum, pageSize);
    }

    @RequestMapping(value = "/listAll", method = RequestMethod.POST)
    public PageResult<SysActivity> listAll() {
        return sysActivityService.listAll();
    }

    /**
     * 根据活动ID 返回活动对象
     *
     * @param activityId
     * @return
     */
    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    public Result selectById(Integer activityId) {
        SysActivityDTO one = sysActivityService.findOne(activityId);
        return ResultGenerator.genSuccessResult(one);
    }

    /**
     * 返回当前活动对象
     *
     * @return
     */
    @RequestMapping(value = "/findNew", method = RequestMethod.POST)
    public Result findNew() {
        logger.info("返回当前活动对象");
        return sysActivityService.findNew();
    }

    /**
     * 活动过期
     */
    @Scheduled(cron = "0 0/5 * * * ?")
    protected void autoUpdate() {
        sysActivityService.autoUpdate();
    }
}
