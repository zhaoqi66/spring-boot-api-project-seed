package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.service.GoodsService;
import com.company.project.web.vm.GoodsVm;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */

@RestController
@RequestMapping("/goods/product")
@Slf4j
@CrossOrigin
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /**
     * 添加商品
     * @param goodsVm
     * @return
     */
    @PostMapping("/add")
    public Result addProduct(@RequestBody GoodsVm goodsVm) {
        log.info("添加商品接口goodsVm={}", goodsVm.toString());
        return goodsService.addProduct(goodsVm);
    }

    /**
     * 商品修改
     * @param goodsVm
     * @return
     */
    @PutMapping("/update")
    public Result updateProduct(@RequestBody GoodsVm goodsVm){
        log.info("商品修改接口 GoodsVm={}", goodsVm);
        return goodsService.updateProduct(goodsVm);
    }


    /**
     * 商品删除
     * @param goodsId
     * @return
     */
    @DeleteMapping("/delete")
    public Result deleteProduct(@RequestParam(name = "goodsId", required = true) String goodsId) {
        log.info("商品删除接口 goodsId={}", goodsId);
        return goodsService.deleteProduct(goodsId);
    }

    /**
     * 商品分页查询
     * @param goodsName
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public Result findProductPage(@RequestParam(name = "goodsName", required = false) String goodsName,
                                @RequestParam(name = "pageNumber", required = true) int pageNumber,
                                @RequestParam(name = "pageSize", required = true) int pageSize) {
        log.info("商品分页查询接口  goodsName={} pageNumber={},pageSize={}", goodsName, pageNumber, pageSize);

        Map<String, Object> map = goodsService.findProductPage(goodsName, pageNumber, pageSize);
        return ResultGenerator.genSuccessResult(map);
    }

}
