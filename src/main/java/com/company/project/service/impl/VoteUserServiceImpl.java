package com.company.project.service.impl;

import com.company.project.dao.VoteUserMapper;
import com.company.project.model.VoteUser;
import com.company.project.service.VoteUserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/09/13.
 */
@Service
@Transactional
public class VoteUserServiceImpl implements VoteUserService {
    @Resource
    private VoteUserMapper voteUserMapper;

}
