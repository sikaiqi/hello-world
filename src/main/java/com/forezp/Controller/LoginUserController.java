package com.forezp.Controller;

import com.forezp.Bean.LoginUser;
import com.forezp.Service.LoginUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skq on 2019/1/24.
 */
@RestController
public class LoginUserController {
    @Autowired
    private LoginUserService loginUserService;

    @GetMapping("/{username}")
    public LoginUser getLoginUser(@PathVariable("username") String username){
        return loginUserService.findLoginUserByName(username);
    }
}
