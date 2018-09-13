package com.company.project.web;

import com.company.project.core.JsonResult;
import com.company.project.core.PageResult;
import com.company.project.model.SysActivity;
import com.company.project.service.SysActivityService;
import com.company.project.vm.SysActivityVm;
import org.apache.commons.beanutils.BeanUtils;
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
    public JsonResult addActivity(@RequestBody SysActivity sysActivity) {
        logger.info("添加活动接口SysActivity={}", sysActivity.toString());

        if (StringUtils.isEmpty(sysActivity)) {
            return JsonResult.error("活动信息添加错误，请仔细核对！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getActivityName())) {
            return JsonResult.error("活动名称不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getPic())) {
            return JsonResult.error("活动内容不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getStartTime())) {
            return JsonResult.error("活动开始时间不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getEndTime())) {
            return JsonResult.error("活动结束时间不能为空！！！");
        }

        //查询当前是否有活动在线
        List<SysActivity> list = sysActivityService.selectByActivityStatus();

        if (!list.isEmpty()) {
            return JsonResult.error("当前有活动正在进行中,无法添加新活动!!!");
        }
        if (sysActivityService.addActivity(sysActivity)) {
            return JsonResult.ok("添加成功");
        } else {
            return JsonResult.error("添加失败");
        }
    }

    /**
     * 删除活动
     */
    @RequestMapping(value = "/deleteActivity", method = RequestMethod.POST)
    public JsonResult deleteActivity(Integer activityId) {
        logger.info("删除活动activityId=", activityId);
        if (StringUtils.isEmpty(activityId)) {
            return JsonResult.error("活动编号不能为空!!!");
        }
        //根据活动ID 查询活动
        SysActivity sysActivity = sysActivityService.selectByActicityId(activityId);

        if (StringUtils.isEmpty(sysActivity)) {
            return JsonResult.error("没有查询到指定活动");
        }

        if (sysActivityService.deleteActivity(sysActivity)) {
            return JsonResult.ok("删除成功");
        } else {
            return JsonResult.error("删除失败");
        }
    }

    /**
     * 修改活动
     */
    @RequestMapping(value = "/updateActivity", method = RequestMethod.POST)
    public JsonResult updateActivity(@RequestBody SysActivity sysActivity) {
        logger.info("修改活动接口SysActivity=", sysActivity.toString());
        if (StringUtils.isEmpty(sysActivity)) {
            return JsonResult.error("活动信息添加错误，请仔细核对！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getActivityName())) {
            return JsonResult.error("活动名称不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getPic())) {
            return JsonResult.error("活动内容不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getStartTime())) {
            return JsonResult.error("活动开始时间不能为空！！！");
        }
        if (StringUtils.isEmpty(sysActivity.getEndTime())) {
            return JsonResult.error("活动结束时间不能为空！！！");
        }


        if (sysActivityService.updateActivity(sysActivity)) {
            return JsonResult.ok("修改成功");
        } else {
            return JsonResult.error("修改失败");
        }
    }

    /**
     * 查询所有活动
     */
    @RequestMapping(value = "/listActivity", method = RequestMethod.POST)
    public Map<String, Object> listActivity(Integer pageNum, Integer pageSize) {
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
     * @param activityId
     * @return
     */
    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    public SysActivityVm selectById(Integer activityId) {
        SysActivity sysActivity = sysActivityService.selectByActicityId(activityId);
        SysActivityVm sysActivityVm = new SysActivityVm();
        try {
            BeanUtils.copyProperties(sysActivityVm, sysActivity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sysActivityVm;
    }

    /**
     * 活动过期
     */
    @Scheduled(cron = "0 0/5 * * * ?")
    protected void autoUpdate() {
        //获取当前时间
        Date date = new Date();
        //查询所有未过期的活动
        List<SysActivity> list = sysActivityService.selectByActivityStatus();
        for (SysActivity sysActivity : list) {
            if (date.after(sysActivity.getEndTime())) {
                //如果结束时间 已经过了 设置活动过期
                sysActivity.setActivityStatus((byte) 1);
                sysActivityService.updateActivity(sysActivity);
            }
        }
    }
}
