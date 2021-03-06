package com.company.project.service.impl;

import com.company.project.core.ServiceException;
import com.company.project.dao.GoodsBrandMapper;
import com.company.project.dao.GoodsMapper;
import com.company.project.dao.GoodsTypeMapper;
import com.company.project.model.Goods;
import com.company.project.model.GoodsBrand;
import com.company.project.model.GoodsExample;
import com.company.project.model.GoodsType;
import com.company.project.service.GoodsService;
import com.company.project.service.impl.DTO.GoodsDTO;
import com.company.project.utils.TimeUtil;
import com.company.project.web.vm.GoodsVm;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private GoodsBrandMapper goodsBrandMapper;

    @Override
    public void addProduct(GoodsVm goodsVm) {
        if (goodsVm.getGoodsName() == null) {
            throw new ServiceException("商品名称不能为空!!!");
        }
        if (goodsVm.getGoodsPrice() == null) {
            throw new ServiceException("商品价格不能为空!!!");
        }
        if (goodsVm.getGoodsBrief() == null) {
            throw new ServiceException("商品介绍不能为空!!!");
        }
        if (goodsVm.getGoodsImg() == null) {
            throw new ServiceException("商品图片不能为空!!!");
        }
        //图片转换
        String s = obtainString(goodsVm.getGoodsImg());

        Goods goods = new Goods();
        goods.setGoodsId(UUID.randomUUID().toString());
        goods.setGoodsName(goodsVm.getGoodsName());
        goods.setGoodsShowId(TimeUtil.getTimeString());
        goods.setGoodsPrice(goodsVm.getGoodsPrice());
        goods.setGoodsNum(goodsVm.getGoodsNum());
        goods.setGoodsImg(s);
        goods.setGoodsCreateTime(new Date());
        goods.setGoodsDelflag((byte) 1);
        goods.setGoodsSort(1);
        goods.setGoodsBrief(goodsVm.getGoodsBrief());
        goods.setBrandId(goodsVm.getBrandId());
        goods.setTypeId(goodsVm.getTypeId());
        goods.setGoodsStatus(goodsVm.getGoodsStatus());
        if (goodsVm.getGoodsStatus() == 1) {
            goods.setGoodsAddedTime(new Date());
        }
        goodsMapper.insert(goods);
    }

    @Override
    public void updateProduct(GoodsVm goodsVm) {
        if (goodsVm.getGoodsName() == null) {
            throw new ServiceException("商品名称不能为空!!!");
        }
        if (goodsVm.getGoodsPrice() == null) {
            throw new ServiceException("商品价格不能为空!!!");
        }
        if (goodsVm.getGoodsBrief() == null) {
            throw new ServiceException("商品介绍不能为空!!!");
        }
        if (goodsVm.getGoodsImg() == null) {
            throw new ServiceException("商品图片不能为空!!!");
        }

        Goods goods = goodsMapper.selectByPrimaryKey(goodsVm.getGoodsId());
        //图片转换
        String s = obtainString(goodsVm.getGoodsImg());
        if (goods != null) {
            goods.setGoodsName(goodsVm.getGoodsName());
            goods.setGoodsPrice(goodsVm.getGoodsPrice());
            goods.setGoodsNum(goodsVm.getGoodsNum());
            goods.setGoodsImg(s);
            goods.setGoodsBrief(goodsVm.getGoodsBrief());
            goods.setBrandId(goodsVm.getBrandId());
            goods.setTypeId(goodsVm.getTypeId());
            goods.setGoodsStatus(goodsVm.getGoodsStatus());
            goods.setGoodsUpdateTime(new Date());

            goodsMapper.updateByPrimaryKey(goods);
        } else {
            throw new ServiceException("无效ID!!!");
        }
    }

    @Override
    public void deleteProduct(String goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods != null && goods.getGoodsDelflag() != 0) {
            goods.setGoodsDelflag((byte) 0);
            goods.setGoodsDeltime(new Date());

            goodsMapper.updateByPrimaryKeySelective(goods);
        } else {
            throw new ServiceException("无效ID!!!");
        }
    }

    @Override
    public Map<String, Object> findProductPage(String goodsName, int pageNumber, int pageSize) {
        //构造分页条件
        PageHelper.startPage(pageNumber, pageSize);

        GoodsExample goodsExample = new GoodsExample();
        if (goodsName != null) {
            goodsExample.createCriteria().andGoodsNameLike("%" + goodsName + "%").andGoodsDelflagEqualTo((byte) 1);
        } else {
            goodsExample.createCriteria().andGoodsDelflagEqualTo((byte) 1);
        }
        goodsExample.setOrderByClause("goods_create_time desc");
        List<Goods> goods = goodsMapper.selectByExample(goodsExample);

        PageInfo<Goods> goodsPageInfo = new PageInfo<>(goods);
        ArrayList<GoodsDTO> list = new ArrayList<>();
        if (goods.size() != 0) {
            for (Goods g : goods) {
                GoodsBrand goodsBrand = goodsBrandMapper.selectByPrimaryKey(g.getBrandId());
                GoodsType goodsType = goodsTypeMapper.selectByPrimaryKey(g.getTypeId());
                String[] imgSplit = g.getGoodsImg().split(",");
                GoodsDTO goodsDTO = new GoodsDTO(g, imgSplit, goodsType.getTypeName(), goodsBrand.getBrandName());
                list.add(goodsDTO);
            }
        }

        Map<String, Object> map = new HashMap<>();
        map.put("list", list);
        map.put("total", goodsPageInfo.getTotal());
        map.put("pageNumber", pageNumber);
        map.put("pageSize", pageSize);
        return map;
    }

    @Override
    public void recommend(String goodsId) {
        GoodsExample goodsExample = new GoodsExample();
        goodsExample.createCriteria().andGoodsSortEqualTo(999);
        List<Goods> list = goodsMapper.selectByExample(goodsExample);
        if (list.size() > 4) {
            throw new ServiceException("当前加推商品已达上限,请取消其他商品推荐后再加推");
        }

        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null || goods.getGoodsDelflag() == 0) {
            throw new ServiceException("当前商品不存在");
        }
        goods.setGoodsSort(999);
        goods.setGoodsUpdateTime(new Date());
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void unRecommend(String goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null || goods.getGoodsDelflag() == 0) {
            throw new ServiceException("当前商品不存在");
        } else if (goods.getGoodsSort() != 999) {
            throw new ServiceException("当前商品未被推荐");
        }

        goods.setGoodsSort(1);
        goods.setGoodsUpdateTime(new Date());
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void putOnSale(String goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null ||goods.getGoodsDelflag() == 0) {
            throw new ServiceException("当前商品不存在");
        } else if (goods.getGoodsStatus() == 1) {
            throw new ServiceException("当前商品已被上架");
        }

        goods.setGoodsStatus((byte) 1);
        goods.setGoodsUpdateTime(new Date());
        goods.setGoodsAddedTime(new Date());
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    @Override
    public void pullOffShelves(String goodsId) {
        Goods goods = goodsMapper.selectByPrimaryKey(goodsId);
        if (goods == null || goods.getGoodsDelflag() == 0) {
            throw new ServiceException("当前商品不存在");
        } else if (goods.getGoodsStatus() == 0) {
            throw new ServiceException("当前商品已被下架");
        }

        goods.setGoodsStatus((byte) 0);
        goods.setGoodsUpdateTime(new Date());
        goods.setGoodsUnaddedTime(new Date());
        goodsMapper.updateByPrimaryKeySelective(goods);
    }

    /**
     * 数组转字符串
     *
     * @param picUrl
     * @return
     */
    private String obtainString(final String[] picUrl) {
        StringBuilder s = new StringBuilder();
        if (picUrl != null) {
            for (int i = 0; i < picUrl.length; i++) {
                if (i == picUrl.length - 1) {
                    s.append(picUrl[i]);
                } else {
                    s.append(picUrl[i]).append(",");
                }
            }
        }
        return s.toString();
    }
}
