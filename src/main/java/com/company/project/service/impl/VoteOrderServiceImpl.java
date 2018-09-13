package com.company.project.service.impl;

import com.company.project.dao.VoteOrderMapper;
import com.company.project.model.VoteOrder;
import com.company.project.model.VoteOrderExample;
import com.company.project.service.VoteOrderService;
import com.company.project.core.AbstractService;
import com.company.project.service.impl.DTO.VoteOrderDTO;
import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by CodeGenerator on 2018/09/13.
 */
@Service
@Transactional
public class VoteOrderServiceImpl implements VoteOrderService {
    @Autowired
    private VoteOrderMapper voteOrderMapper;

    @Override
    public List<VoteOrderDTO> selectByActivityId(Integer activityId) {
        VoteOrderExample voteOrderExample = new VoteOrderExample();
        voteOrderExample.createCriteria().andActivityIdEqualTo(activityId).andStatusEqualTo("1");
        voteOrderExample.setOrderByClause("create_time desc");

        List<VoteOrder> voteOrders = voteOrderMapper.selectByExample(voteOrderExample);

        ArrayList<VoteOrderDTO> list = new ArrayList<>();
        try {
            for (VoteOrder voteOrder : voteOrders) {
                VoteOrderDTO voteOrderDTO = new VoteOrderDTO();
                BeanUtils.copyProperties(voteOrderDTO, voteOrder);
                list.add(voteOrderDTO);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
