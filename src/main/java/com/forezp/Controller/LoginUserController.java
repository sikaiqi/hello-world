package com.forezp.Controller;

import com.forezp.Bean.LoginUser;
import com.forezp.Service.LoginUserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * Created by skq on 2019/1/24.
 */
@RequestMapping("/user")
@RestController
public class LoginUserController {
    @Autowired
    private LoginUserService loginUserService;

    @ApiOperation(value="用户列表",notes="用户列表")
    @GetMapping(value={""})
    public List<LoginUser> getUsers(){
        List<LoginUser> users = loginUserService.findAll();
        return users;
    }

    @ApiOperation(value="创建用户",notes="创建用户")
    @PostMapping(value="")
    public LoginUser postUser(@RequestBody LoginUser loginUser){
        return loginUserService.saveLoginUser(loginUser);
    }

    @ApiOperation(value="获取用户信息",notes="根据url的id来获取详细信息")
    @GetMapping(value="/{id}")
    public LoginUser getLoginUser(@PathVariable Long id){
        return loginUserService.findLoginUserById(id);
    }

    @ApiOperation(value="更新信息",notes="根据url的id来指定更新用户信息")
    @PutMapping(value="/{id}")
    public LoginUser putLoginUser(@PathVariable Long id,@RequestBody LoginUser user){
        LoginUser loginUser = new LoginUser();
        loginUser.setUsername(user.getUsername());
        loginUser.setPassword(user.getPassword());
        loginUser.setId(id);
        return loginUserService.updateLoginUser(loginUser);
    }

    @ApiOperation(value="删除用户",notes="根据url的id来指定删除用户信息")
    @DeleteMapping(value="/{id}")
    public String deleteUser(@PathVariable Long id){
       loginUserService.deleteLoginUser(id);
       return "success";
    }

}
