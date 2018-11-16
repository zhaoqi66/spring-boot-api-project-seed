package com.company.project.service;

import com.company.project.core.Result;
import com.company.project.model.GoodsType;
import com.company.project.service.impl.DTO.GoodsTypeListDTO;
import com.company.project.web.vm.GoodsTypeVm;
import com.github.pagehelper.PageInfo;

import java.util.List;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
public interface GoodsTypeService {
    Result addType(GoodsTypeVm goodsTypeVm);

    Result updateType(GoodsTypeVm goodsTypeVm);

    Result deleteType(String typeId);

    PageInfo<GoodsType> findTypePage(String typeName, int pageNumber, int pageSize);

    List<GoodsTypeListDTO> findTypeList();
}
