package com.company.project.service;
import com.company.project.model.User;
import com.company.project.core.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2018/09/06.
 */
public interface UserService extends Service<User> {

    List<User> login(String username);
}
