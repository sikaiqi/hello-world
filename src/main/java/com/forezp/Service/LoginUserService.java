package com.forezp.Service;

import com.forezp.Bean.LoginUser;
import com.forezp.Dao.LoginUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.log.LogInputStream;

import java.util.List;

/**
 * Created by skq on 2019/1/24.
 */
@Service
public class LoginUserService {
    @Autowired
    private LoginUserDao userRepository;

    public LoginUser findLoginUserByName(String username){
        return userRepository.findByUsername(username);
    }

    public List<LoginUser> findAll(){
        return userRepository.findAll();
    }

    public LoginUser saveLoginUser(LoginUser loginUser){
        return userRepository.save(loginUser);
    }

    public LoginUser findLoginUserById(long id){
        return userRepository.findById(id).get();
    }
    public LoginUser updateLoginUser(LoginUser loginUser){
        return userRepository.saveAndFlush(loginUser);
    }
    public void deleteLoginUser(long id){
        userRepository.deleteById(id);
    }


}
