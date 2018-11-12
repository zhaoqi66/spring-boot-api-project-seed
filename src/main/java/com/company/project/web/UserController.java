package com.company.project.web;
import com.company.project.core.Commins;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.utils.CookieUtil;
import com.company.project.utils.TokenProccessor;
import com.company.project.utils.TokenTools;
import com.company.project.web.vm.UserVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

/**
* Created by CodeGenerator on 2018/09/06.
*/
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @PostMapping("/add")
    public Result add(User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/{id}")
    public Result detail(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }


    @GetMapping("logout")
    public Result logout( HttpServletRequest request, HttpServletResponse response) {
        String token = CookieUtil.getUid(request,"token");
        String username = CookieUtil.getUid(request,"username");

        String s = (String) redisTemplate.opsForHash().get(Commins.map,username);
        System.out.println(s);
        Boolean b = redisTemplate.opsForHash().hasKey(Commins.map,username);
        System.out.println(b);


        CookieUtil.removeCookie(response,"token");
        CookieUtil.removeCookie(response,"username");
        return ResultGenerator.genSuccessResult("退出成功！");
    }

    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

}
