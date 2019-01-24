package com.forezp.Dao;

import com.forezp.Bean.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by skq on 2019/1/24.
 */
public interface LoginUserDao extends JpaRepository<LoginUser,Long> {

    LoginUser findByUsername(String username);
}
