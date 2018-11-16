package com.company.project.service.impl;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.dao.GoodsBrandMapper;
import com.company.project.model.GoodsBrand;
import com.company.project.model.GoodsBrandExample;
import com.company.project.service.GoodsBrandService;
import com.company.project.service.impl.DTO.GoodsBrandListDTO;
import com.company.project.web.vm.GoodsBrandVm;
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
public class GoodsBrandServiceImpl implements GoodsBrandService {

    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

    @Override
    public Result addBrand(GoodsBrandVm goodsBrandVm) {
        List<GoodsBrand> goodsBrands = getGoodsBrands(goodsBrandVm);
        if (goodsBrands.size() == 0) {
            //没有同名品牌
            GoodsBrand goodsBrand = new GoodsBrand();
            goodsBrand.setBrandId(UUID.randomUUID().toString());
            goodsBrand.setBrandName(goodsBrandVm.getBrandName());
            goodsBrand.setBrandDesc(goodsBrandVm.getBrandDesc());
            goodsBrand.setBrandStatus(goodsBrandVm.getBrandStatus());
            goodsBrand.setBrandCreateTime(new Date());
            goodsBrand.setBrandDelflag((byte) 1);

            goodsBrandMapper.insert(goodsBrand);
            return ResultGenerator.genSuccessResult();
        } else {
            return ResultGenerator.genFailResult("品牌名称重复，请修改后再添加");
        }

    }

    //查询是否有同名品牌
    private List<GoodsBrand> getGoodsBrands(GoodsBrandVm goodsBrandVm) {
        GoodsBrandExample goodsBrandExample = new GoodsBrandExample();
        goodsBrandExample.createCriteria().andBrandNameEqualTo(goodsBrandVm.getBrandName()).andBrandDelflagEqualTo((byte) 1);
        return goodsBrandMapper.selectByExample(goodsBrandExample);
    }

    @Override
    public Result updateBrand(GoodsBrandVm goodsBrandVm) {
        GoodsBrand goodsBrand = goodsBrandMapper.selectByPrimaryKey(goodsBrandVm.getBrandId());
        List<GoodsBrand> goodsBrands = getGoodsBrands(goodsBrandVm);
        if (goodsBrand != null ) {
            if (goodsBrands.size() == 0 || goodsBrands.get(0).getBrandId().equals(goodsBrandVm.getBrandId())) {
                goodsBrand.setBrandName(goodsBrandVm.getBrandName());
                goodsBrand.setBrandStatus(goodsBrandVm.getBrandStatus());
                goodsBrand.setBrandDesc(goodsBrandVm.getBrandDesc());
                goodsBrand.setBrandModifiedTime(new Date());

                goodsBrandMapper.updateByPrimaryKeySelective(goodsBrand);

                return ResultGenerator.genSuccessResult();
            } else {
                return ResultGenerator.genFailResult("品牌名称重复,请修改!!!");
            }
        } else {
            return ResultGenerator.genFailResult("无效的品牌id");
        }
    }

    @Override
    public Result deleteBrand(String brandId) {
        GoodsBrand goodsBrand = goodsBrandMapper.selectByPrimaryKey(brandId);

        if (goodsBrand != null && goodsBrand.getBrandDelflag()!=0){
            goodsBrand.setBrandDelflag((byte) 0);
            goodsBrand.setBrandDelTime(new Date());
            goodsBrandMapper.updateByPrimaryKeySelective(goodsBrand);
            return ResultGenerator.genSuccessResult();
        }else {
            return ResultGenerator.genFailResult("无效ID");
        }
    }

    @Override
    public PageInfo<GoodsBrand> findBrandPage(String brandName, int pageNumber, int pageSize) {
        //构造分页条件
        PageHelper.startPage(pageNumber, pageSize);

        GoodsBrandExample goodsBrandExample = new GoodsBrandExample();
        if (brandName != null){
            goodsBrandExample.createCriteria().andBrandNameLike("%"+brandName+"%").andBrandDelflagEqualTo((byte) 1);
        }else {
            goodsBrandExample.createCriteria().andBrandDelflagEqualTo((byte) 1);
        }
        goodsBrandExample.setOrderByClause("brand_create_time desc");
        List<GoodsBrand> goodsBrands = goodsBrandMapper.selectByExample(goodsBrandExample);

        PageInfo<GoodsBrand> goodsBrandPageInfo = new PageInfo<GoodsBrand>(goodsBrands);
        return goodsBrandPageInfo;
    }

    @Override
    public List<GoodsBrandListDTO> findBrandList() {
        GoodsBrandExample goodsBrandExample = new GoodsBrandExample();
        goodsBrandExample.createCriteria().andBrandDelflagEqualTo((byte) 1).andBrandStatusEqualTo((byte) 1);
        goodsBrandExample.setOrderByClause("brand_create_time desc");
        List<GoodsBrand> goodsBrands = goodsBrandMapper.selectByExample(goodsBrandExample);
        List<GoodsBrandListDTO> list = new ArrayList<>();
        if (goodsBrands.size() != 0 ){
            for (GoodsBrand goodsBrand:goodsBrands) {
                GoodsBrandListDTO goodsBrandListDTO = new GoodsBrandListDTO(goodsBrand);
                list.add(goodsBrandListDTO);
            }
        }
        return list;
    }
}
