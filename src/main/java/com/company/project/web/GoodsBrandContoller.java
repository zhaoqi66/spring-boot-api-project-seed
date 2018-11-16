package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsBrand;
import com.company.project.service.GoodsBrandService;
import com.company.project.service.impl.DTO.GoodsBrandListDTO;
import com.company.project.web.vm.GoodsBrandVm;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 商品品牌Controller
 *
 * @author FHZD.xiaoxun
 * @date 2018/11/15
 */
@RestController
@RequestMapping("/goods/brand")
@EnableScheduling
public class GoodsBrandContoller {
    @Autowired
    private GoodsBrandService goodsBrandService;

    private static final Logger logger = LoggerFactory.getLogger(SysActivityController.class);

    /**
     * 添加品牌
     *
     * @param goodsBrandVm
     * @return
     */
    @PostMapping("/add")
    public Result addBrand(@RequestBody GoodsBrandVm goodsBrandVm) {
        logger.info("添加品牌接口goodsBrandVm={}", goodsBrandVm.toString());
        return goodsBrandService.addBrand(goodsBrandVm);
    }

    /**
     * 品牌修改
     *
     * @param goodsBrandVm
     * @return
     */
    @PutMapping("/update")
    public Result updateBrand(@RequestBody GoodsBrandVm goodsBrandVm) {
        logger.info("品牌修改接口 GoodsBrandVm={}", goodsBrandVm);
        return goodsBrandService.updateBrand(goodsBrandVm);
    }

    /**
     * 品牌删除
     *
     * @param brandId
     * @return
     */
    @DeleteMapping("/delete")
    public Result deleteBrand(@RequestParam(name = "brandId", required = true) String brandId) {
        logger.info("品牌删除接口 brandId={}", brandId);
        return goodsBrandService.deleteBrand(brandId);
    }

    /**
     * 品牌分页查询
     *
     * @param brandName
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public Result findBrandPage(@RequestParam(name = "brandName", required = false) String brandName,
                                @RequestParam(name = "pageNumber", required = true) int pageNumber,
                                @RequestParam(name = "pageSize", required = true) int pageSize) {
        logger.info("品牌分页查询接口  brandName={} pageNumber={},pageSize={}", brandName, pageNumber, pageSize);

        PageInfo<GoodsBrand> brandPage = goodsBrandService.findBrandPage(brandName, pageNumber, pageSize);
        return ResultGenerator.genSuccessResult(brandPage.getList());
    }

    /**
     * 品牌列表展示
     *
     * @return
     */
    @GetMapping("/list")
    public Result findBrandList() {
        logger.info("品牌列表展示");
        List<GoodsBrandListDTO> brandList = goodsBrandService.findBrandList();
        return ResultGenerator.genSuccessResult(brandList);
    }
}
