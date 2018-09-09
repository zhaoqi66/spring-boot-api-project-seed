package com.company.project.service.impl;

import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.company.project.core.AbstractService;
import com.company.project.utils.TokenProccessor;
import com.company.project.utils.TokenTools;
import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/09/06.
 */
@Service
@Transactional
public class UserServiceImpl extends AbstractService<User> implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public Map<String,Object> login(HttpServletRequest request, String username , String password) {
        Map<String,Object> map = new HashMap<String,Object>();
        if(StringUtils.isEmpty(username)){
            map.put("msg","用户名不能为空");
            return map;
        }

        if(StringUtils.isEmpty(password)){
            map.put("msg","密码不能为空");
            return map;
        }
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User user1 = userMapper.selectOne(user);
        if (user1 == null){
            map.put("msg","用户名不存在");
            return map;

        }
        //  校验密码

        if (password.equals(user1.getPassword())) {
            map.put("msg", "密码错误");
            return map;
        }
        // 返回token
        String token  = TokenProccessor.getInstance().makeToken();
        TokenTools.createToken(request,token);
        map.put("token",token);
        return map;
    }
}
