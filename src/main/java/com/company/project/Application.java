package com.company.project;

import com.company.project.core.Commins;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.utils.CookieUtil;
import com.company.project.utils.TokenProccessor;
import com.company.project.utils.TokenTools;
import com.company.project.web.vm.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@SpringBootApplication
@RestController
@EnableSwagger2
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    //首页的登录功能
    @PostMapping("/user/login")
    public Result login(HttpServletRequest request, HttpServletResponse response , @RequestBody UserVo vo) {

        List<User> list = userService.login(vo.getUsername());

        if (list.size() == 1){
            if ( list.get(0).getPassword().equals(vo.getPassword())){
                String token  = TokenProccessor.getInstance().makeToken();
                System.out.println("token : " + token);
                TokenTools.createToken(request,token);
                CookieUtil.addCookie(response,"token",token,60*60*24*3);
                CookieUtil.addCookie(response,"username",vo.getUsername(),60*60*24*3);
                redisTemplate.opsForHash().put(Commins.map,vo.getUsername(),token);
                return ResultGenerator.genSuccessResult("登陆成功！");
            }
        }else{
            return ResultGenerator.genFailResult("密码不正确!");
        }
        return ResultGenerator.genFailResult("用户不存在或用户不唯一请联系管理员!");
    }

}

