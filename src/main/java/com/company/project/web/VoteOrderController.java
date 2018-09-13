package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.VoteOrder;
import com.company.project.service.VoteOrderService;
import com.company.project.service.impl.DTO.VoteOrderDTO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/09/13.
*/
@RestController
@RequestMapping("/vote/order")
public class VoteOrderController {

    @Autowired
    private VoteOrderService voteOrderService;

    private static final Logger logger = LoggerFactory.getLogger(UserApplyController.class);

    /**
     * 查询当前活动的充值信息
     *
     * @param activityId
     * @return
     */
    @RequestMapping(value = "/selectByActivityId", method = RequestMethod.POST)
    public Result selectByActivityId(@RequestParam(name = "activityId", required = true) Integer activityId) {
        logger.info("查询当前进行活动的充值信息接口 activityId={}", activityId);
        List<VoteOrderDTO> list = voteOrderService.selectByActivityId(activityId);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
