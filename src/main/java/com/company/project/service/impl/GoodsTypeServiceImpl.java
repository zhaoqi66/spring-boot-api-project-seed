package com.company.project.service.impl;

import com.company.project.core.ServiceException;
import com.company.project.dao.GoodsTypeMapper;
import com.company.project.model.GoodsType;
import com.company.project.model.GoodsTypeExample;
import com.company.project.service.GoodsTypeService;
import com.company.project.service.impl.DTO.GoodsTypeListDTO;
import com.company.project.utils.TimeUtil;
import com.company.project.web.vm.GoodsTypeVm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
@Service
@Transactional
public class GoodsTypeServiceImpl implements GoodsTypeService {

    @Autowired
    private GoodsTypeMapper goodsTypeMapper;

    @Override
    public void addType(GoodsTypeVm goodsTypeVm) {
        List<GoodsType> goodsTypes = getGoodsTypes(goodsTypeVm);
        if (goodsTypes.size() == 0){
            GoodsType goodsType = new GoodsType();
            goodsType.setTypeId(UUID.randomUUID().toString());
            goodsType.setTypeShowId(TimeUtil.getTimeString());
            goodsType.setTypeName(goodsTypeVm.getTypeName());
            goodsType.setTypeDesc(goodsTypeVm.getTypeDesc());
            goodsType.setTypeDelflag((byte) 1);
            goodsType.setTypeStatus((byte) 1);
            goodsType.setTypeCreateTime(new Date());
            goodsTypeMapper.insert(goodsType);
        }else {
            throw new ServiceException("分类名称重复,请修改后添加!!!");
        }
    }

    @Override
    public void updateType(GoodsTypeVm goodsTypeVm) {
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(goodsTypeVm.getTypeId());
        List<GoodsType> goodsTypes = getGoodsTypes(goodsTypeVm);
        if (goodsType != null ) {
            if (goodsTypes.size() == 0 || goodsTypes.get(0).getTypeId().equals(goodsTypeVm.getTypeId())) {
                goodsType.setTypeName(goodsTypeVm.getTypeName());
                goodsType.setTypeStatus(goodsTypeVm.getTypeStatus());
                goodsType.setTypeDesc(goodsTypeVm.getTypeDesc());
                goodsType.setTypeUpdateTime(new Date());

                goodsTypeMapper.updateByPrimaryKeySelective(goodsType);
            } else {
                throw new ServiceException("分类名称重复,请修改!!!");
            }
        } else {
            throw new ServiceException("无效的分类ID!!!");
        }
    }

    @Override
    public void deleteType(String typeId) {
        GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(typeId);

        if (goodsType != null && goodsType.getTypeDelflag() != 0){
            goodsType.setTypeDelflag((byte) 0);
            goodsType.setTypeDelTime(new Date());
            goodsTypeMapper.updateByPrimaryKeySelective(goodsType);
        }else {
            throw new ServiceException("无效的分类ID!!!");
        }
    }

    @Override
    public PageInfo<GoodsType> findTypePage(String typeName, int pageNumber, int pageSize) {
        //构造分页条件
        PageHelper.startPage(pageNumber, pageSize);

        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        if (typeName != null){
            goodsTypeExample.createCriteria().andTypeNameLike("%"+typeName+"%").andTypeDelflagEqualTo((byte) 1);
        }else {
            goodsTypeExample.createCriteria().andTypeDelflagEqualTo((byte) 1);
        }
        goodsTypeExample.setOrderByClause("type_create_time desc");
        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);

        PageInfo<GoodsType> goodsTypePageInfo = new PageInfo<>(goodsTypes);
        return goodsTypePageInfo;
    }

    @Override
    public List<GoodsTypeListDTO> findTypeList() {

        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andTypeDelflagEqualTo((byte) 1).andTypeStatusEqualTo((byte) 1);
        goodsTypeExample.setOrderByClause("type_create_time desc");

        List<GoodsType> goodsTypes = goodsTypeMapper.selectByExample(goodsTypeExample);
        List<GoodsTypeListDTO> list = new ArrayList<>();
        if (goodsTypes.size() != 0 ){
            for (GoodsType goodsType:goodsTypes) {
                GoodsTypeListDTO goodsTypeListDTO = new GoodsTypeListDTO(goodsType);
                list.add(goodsTypeListDTO);
            }
        }
        return list;
    }

    private List<GoodsType> getGoodsTypes(GoodsTypeVm goodsTypeVm) {
        GoodsTypeExample goodsTypeExample = new GoodsTypeExample();
        goodsTypeExample.createCriteria().andTypeNameEqualTo(goodsTypeVm.getTypeName()).andTypeDelflagEqualTo((byte) 1);
        return goodsTypeMapper.selectByExample(goodsTypeExample);
    }
}
