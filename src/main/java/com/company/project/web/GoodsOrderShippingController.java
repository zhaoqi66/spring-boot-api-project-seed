package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsOrderShipping;
import com.company.project.service.GoodsOrderShippingService;
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
@RequestMapping("/goods/order/shipping")
@Slf4j
@CrossOrigin
public class GoodsOrderShippingController {
    @Resource
    private GoodsOrderShippingService goodsOrderShippingService;

    @PostMapping("/add")
    public Result add(GoodsOrderShipping goodsOrderShipping) {
        //goodsOrderShippingService.save(goodsOrderShipping);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        //goodsOrderShippingService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(GoodsOrderShipping goodsOrderShipping) {
        //goodsOrderShippingService.update(goodsOrderShipping);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam String id) {
       //GoodsOrderShipping goodsOrderShipping = goodsOrderShippingService.findById(id);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        //List<GoodsOrderShipping> list = goodsOrderShippingService.findAll();
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult();
    }
}
