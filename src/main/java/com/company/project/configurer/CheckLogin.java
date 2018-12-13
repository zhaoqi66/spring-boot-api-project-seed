package com.company.project.configurer;


import com.company.project.core.Commins;
import com.company.project.core.ServiceException;
import com.company.project.utils.CookieUtil;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Created By liuxiaoming
 * @CreateTime 2017/12/8 上午10:18
 **/
@Aspect
@Component
@Slf4j
public class CheckLogin {


    @Autowired
    private RedisTemplate redisTemplate;

    @Pointcut("execution(public * com.company.project.web..*.*(..))")
    public void verify(){}

    @Before("verify()")
    public void doVerify(){
        ServletRequestAttributes attributes = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //查询cookie
        String token = CookieUtil.getUid(request,"token");
        if(token == null){
            log.warn("【登陆校验】Cookie中查不到token");
            throw new ServiceException("没有cookie");
        }


        String username = CookieUtil.getUid(request,"username");
        //从Redis中查询
        String redisToken = (String) redisTemplate.opsForHash().get(Commins.map,username);

        if(!token.equals(redisToken)){
            log.warn("【登陆校验】Redis中查不到token");
            throw new ServiceException("token不符合标准,需要重新登陆!");
        }
    }
}