package com.company.project.service;
import com.company.project.model.VoteOrder;
import com.company.project.core.Service;
import com.company.project.service.impl.DTO.VoteOrderDTO;

import java.util.List;


/**
 * Created by CodeGenerator on 2018/09/13.
 */
public interface VoteOrderService {

    List<VoteOrderDTO> selectByActivityId(Integer activityId);
}
