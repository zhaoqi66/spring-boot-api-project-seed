package com.company.project.service;
import com.company.project.model.User;
import com.company.project.core.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/09/06.
 */
public interface UserService extends Service<User> {

    Map<String,Object> login(HttpServletRequest request, String username , String password);
}
