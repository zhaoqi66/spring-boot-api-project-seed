package com.company.project.service;

import com.company.project.web.vm.SysOrderVo;
import com.github.pagehelper.PageInfo;

/**
 * Created by CodeGenerator on 2018/11/27.
 */
public interface GoodsOrderService{

    PageInfo<SysOrderVo> findPage(String orderShowId, Integer pageNumber, Integer pageSize);
}
