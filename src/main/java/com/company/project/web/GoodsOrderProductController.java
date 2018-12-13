package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsOrderProduct;
import com.company.project.service.GoodsOrderProductService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2018/11/27.
*/
@RestController
@RequestMapping("/goods/order/product")
@Slf4j
@CrossOrigin
public class GoodsOrderProductController {
    @Resource
    private GoodsOrderProductService goodsOrderProductService;

    @PostMapping("/add")
    public Result add(GoodsOrderProduct goodsOrderProduct) {
        //goodsOrderProductService.save(goodsOrderProduct);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        //goodsOrderProductService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(GoodsOrderProduct goodsOrderProduct) {
        //goodsOrderProductService.update(goodsOrderProduct);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam String orderId) {
        List<GoodsOrderProduct> goodsOrderProducts = goodsOrderProductService.findByOrderId(orderId);
        return ResultGenerator.genSuccessResult(goodsOrderProducts);
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        //List<GoodsOrderProduct> list = goodsOrderProductService.findAll();
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult();
    }
}
