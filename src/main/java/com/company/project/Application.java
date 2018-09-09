package com.company.project;

import com.company.project.core.Commins;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.utils.CookieUtil;
import com.company.project.utils.TokenProccessor;
import com.company.project.utils.TokenTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
@RestController
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Resource
    private UserService userService;

    //Map<String,String> map=new HashMap<String,String>();

    @Autowired
    private RedisTemplate redisTemplate;
    //首页的登录功能
    @PostMapping("/user/login")
    public Result detail(HttpServletRequest request, HttpServletResponse response , @RequestParam String username , @RequestParam String password) {

        User user = userService.login(username,password);
        if (user != null){
            String token  = TokenProccessor.getInstance().makeToken();
            System.out.println("token : " + token);
            TokenTools.createToken(request,token);
            CookieUtil.addCookie(response,"token",token,60*60*24*3);
            CookieUtil.addCookie(response,"username",username,60*60*24*3);
            redisTemplate.opsForHash().put(Commins.map,user.getUsername(),token);

            return ResultGenerator.genSuccessResult("登陆成功！");
        }else{
            return ResultGenerator.genFailResult("用户名或密码错误！");
        }

    }

}

