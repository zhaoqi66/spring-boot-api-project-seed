package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsType;
import com.company.project.service.GoodsTypeService;
import com.company.project.service.impl.DTO.GoodsTypeListDTO;
import com.company.project.web.vm.GoodsTypeVm;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
@RestController
@RequestMapping("/goods/type")
@Slf4j
@CrossOrigin
public class GoodsTypeController {
    @Autowired
    private GoodsTypeService goodsTypeService;

    /**
     * 添加分类
     * @param goodsTypeVm
     * @return
     */
    @PostMapping("/add")
    public Result addType(@RequestBody GoodsTypeVm goodsTypeVm) {
        log.info("添加分类接口goodsTypeVm={}", goodsTypeVm.toString());
        return goodsTypeService.addType(goodsTypeVm);
    }

    /**
     * 分类修改
     * @param goodsTypeVm
     * @return
     */
    @PutMapping("/update")
    public Result updateType(@RequestBody GoodsTypeVm goodsTypeVm) {
        log.info("分类修改接口 goodsTypeVm={}", goodsTypeVm);
        return goodsTypeService.updateType(goodsTypeVm);
    }

    /**
     * 分类删除
     * @param typeId
     * @return
     */
    @DeleteMapping("/delete")
    public Result deleteType(@RequestParam(name = "typeId", required = true) String typeId) {
        log.info("分类删除接口 typeId={}", typeId);
        return goodsTypeService.deleteType(typeId);
    }

    /**
     * 分类分页查询
     * @param typeName
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public Result findTypePage(@RequestParam(name = "typeName", required = false) String typeName,
                                @RequestParam(name = "pageNumber", required = true) int pageNumber,
                                @RequestParam(name = "pageSize", required = true) int pageSize) {
        log.info("分类分页查询接口  typeName={} pageNumber={},pageSize={}", typeName, pageNumber, pageSize);
        PageInfo<GoodsType> typePage =goodsTypeService.findTypePage(typeName, pageNumber, pageSize);
        HashMap<String, Object> map = new HashMap<>();
        map.put("count", typePage.getTotal());
        map.put("data", typePage.getList());
        map.put("pageNumber", typePage.getPageNum());
        map.put("pageSize", typePage.getPageSize());
        return ResultGenerator.genSuccessResult(map);
    }

    /**
     * 分类列表展示
     * @return
     */
    @GetMapping("/list")
    public Result findTypeList() {
        log.info("分类列表展示");
        List<GoodsTypeListDTO> typeList = goodsTypeService.findTypeList();
        return ResultGenerator.genSuccessResult(typeList);
    }
}
