package com.company.project.service.impl;

import com.company.project.core.ResultGenerator;
import com.company.project.dao.UserApplyMapper;
import com.company.project.model.UserApply;
import com.company.project.model.UserApplyExample;
import com.company.project.service.UserApplyService;
import com.company.project.core.AbstractService;
import com.company.project.service.impl.DTO.UserApplyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/09/13.
 */
@Service
@Transactional
public class UserApplyServiceImpl implements UserApplyService {
    @Autowired
    private UserApplyMapper userApplyMapper;


    @Override
    public List<UserApplyDTO> selectByActivityId(Integer activityId) {
        UserApplyExample userApplyExample = new UserApplyExample();
        userApplyExample.createCriteria().andActivityIdEqualTo(activityId).andStatusEqualTo("0");
        userApplyExample.setOrderByClause("apply_time desc");
        List<UserApply> userApplies = userApplyMapper.selectByExample(userApplyExample);

        List<UserApplyDTO> list = new ArrayList<>();
        if (userApplies.size() > 0) {
            appliesList(userApplies, list);
        }
        return list;
    }

    @Override
    public void passUserApply(int id) {
        UserApply userApply = userApplyMapper.selectByPrimaryKey(id);
        userApply.setStatus("2");
        userApply.setReviewTime(new Date());

        userApplyMapper.updateByPrimaryKeySelective(userApply);
    }

    @Override
    public UserApply findOne(int id) {
        return userApplyMapper.selectByPrimaryKey(id);
    }

    @Override
    public void failUserApply(int id) {
        UserApply userApply = userApplyMapper.selectByPrimaryKey(id);
        userApply.setStatus("3");
        userApply.setReviewTime(new Date());

        userApplyMapper.updateByPrimaryKeySelective(userApply);
    }


    private List<UserApplyDTO> appliesList(List<UserApply> applies, List<UserApplyDTO> list) {
        for (UserApply apply : applies) {
            String[] pics = apply.getPic().split(",");
            UserApplyDTO userApplyDTO = new UserApplyDTO(apply, pics);
            list.add(userApplyDTO);
        }
        return list;
    }
}
