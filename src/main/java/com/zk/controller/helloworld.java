package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zk on 18/5/21.
 */
//@ResponseBody  //这就是传说中的RESTFUL风格.这个类的所有方法返回的数据直接写给浏览器.(如果是对象转为json数据)
//@Controller
@RestController  //这个注解的意思是@Controller+@responseBody
public class helloworld {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world!!!";
    }
}
