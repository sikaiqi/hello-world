package com.forezp.Service;

import com.forezp.Bean.LoginUser;
import com.forezp.Dao.LoginUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
