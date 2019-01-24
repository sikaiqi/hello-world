package com.forezp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by skq on 2019/1/23.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Greetings from Spring Boot !";
    }
}
