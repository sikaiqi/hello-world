package com.forezp.Controller;

import com.forezp.Bean.ConfigBean;
import com.forezp.Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skq on 2019/1/24.
 */
@RestController
@EnableConfigurationProperties({ConfigBean.class, User.class})
public class LucyController {
    @Autowired
    ConfigBean configBean;
    @RequestMapping("/lucy")
    public String miya(){
        return configBean.getGreeting()+"-"+configBean.getName()+"-"+configBean.getUuid()+"-"+configBean.getMax();
    }
    @Autowired
    User user;
    @RequestMapping("/user")
    public String user(){
        return user.getName()+"："+user.getAge();
    }

}
