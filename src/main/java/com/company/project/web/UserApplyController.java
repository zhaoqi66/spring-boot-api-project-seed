package com.company.project.web;

import com.company.project.core.Result;

import com.company.project.core.ResultGenerator;
import com.company.project.model.UserApply;
import com.company.project.service.UserApplyService;
import com.company.project.service.impl.DTO.UserApplyDTO;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by CodeGenerator on 2018/09/13.
 */
@RestController
@RequestMapping("/user/apply")
public class UserApplyController {
    @Autowired
    private UserApplyService userApplyService;

    private static final Logger logger = LoggerFactory.getLogger(UserApplyController.class);
    /*@PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<UserApply> list = userApplyService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }*/

    /**
     * 查询当前活动的报名信息
     * @param activityId
     * @return
     */
    @RequestMapping(value = "/selectByActivityId", method = RequestMethod.POST)
    public Result selectByActivityId(@RequestParam(name = "activityId", required = true) Integer activityId) {
        logger.info("查询当前活动的报名信息接口 id={}", activityId);
        List<UserApplyDTO> list = userApplyService.selectByActivityId(activityId);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    /**
     *  审核通过接口
     * @param id
     * @return
     */
    @PostMapping(value = "/pass")
    public Result passUserApply(@RequestParam(name = "id", required = true) int id) {
        logger.info("审核通过验证接口 id=", id);
        if (id == 0) {
            return ResultGenerator.genFailResult("报名ID不能为空");
        }
        UserApply userApply= userApplyService.findOne(id);
        if (userApply ==null){
            return ResultGenerator.genFailResult("当前id无效");
        }
        userApplyService.passUserApply(id);
        return ResultGenerator.genSuccessResult();
    }

    /**
     * 审核不通过
     * @param id
     * @return
     */
    @PostMapping(value = "/fail")
    public Result failUserApply(@RequestParam(name = "id", required = true) int id) {
        logger.info("审核不通过接口 id=", id);
        if (id == 0) {
            return ResultGenerator.genFailResult("报名ID不能为空");
        }
        UserApply userApply= userApplyService.findOne(id);
        if (userApply ==null){
            return ResultGenerator.genFailResult("当前id无效");
        }
        userApplyService.failUserApply(id);
        return ResultGenerator.genSuccessResult();
    }
}
