package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.GoodsOrder;
import com.company.project.service.GoodsOrderService;
import com.company.project.web.vm.SysOrderVo;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2018/11/27.
 */
@RestController
@RequestMapping("/goods/order")
@Slf4j
@CrossOrigin
public class GoodsOrderController {
    @Resource
    private GoodsOrderService goodsOrderService;

    @PostMapping("/add")
    public Result add(GoodsOrder goodsOrder) {
        //goodsOrderService.save(goodsOrder);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        //goodsOrderService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }


    @PutMapping("/update")
    public Result update(GoodsOrder goodsOrder) {
        //goodsOrderService.update(goodsOrder);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        //GoodsOrder goodsOrder = goodsOrderService.findById(id);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        //PageHelper.startPage(page, size);
        //List<GoodsOrder> list = goodsOrderService.findAll();
        //PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/page")
    public Result findPage(@RequestParam(name = "orderShowId", required = false) String orderShowId,
                           @RequestParam(name = "pageNumber", required = true, defaultValue = "0") Integer pageNumber,
                           @RequestParam(name = "pageSize", required = true, defaultValue = "0") Integer pageSize) {
        log.info("订单分页查询接口  orderShowId={} pageNumber={},pageSize={}", orderShowId, pageNumber, pageSize);
        PageInfo<SysOrderVo> page = goodsOrderService.findPage(orderShowId, pageNumber, pageSize);
        return ResultGenerator.genSuccessResult(page);
    }
}
