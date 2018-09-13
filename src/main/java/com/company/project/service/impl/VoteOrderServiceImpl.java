package com.company.project.service.impl;

import com.company.project.dao.VoteOrderMapper;
import com.company.project.model.VoteOrder;
import com.company.project.service.VoteOrderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/09/13.
 */
@Service
@Transactional
public class VoteOrderServiceImpl  implements VoteOrderService {
    @Resource
    private VoteOrderMapper voteOrderMapper;

}
