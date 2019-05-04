package com.noyer.controller;


import com.noyer.pojo.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @RequestMapping("/")
    @ResponseBody
    public String first(){
        return "world";
    }

    @RequestMapping("/person")
    @ResponseBody
    public Person returnFastJson(){
        Person p=new Person();
        p.setId(1);
        p.setName("啊哈");
        return p;
    }

}
