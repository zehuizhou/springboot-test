package com.example.demo.controller;

import com.example.demo.entity.Girl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    public String say(){
//        return "hello spring boot";
//    }

//    @Value("${cupSize}")
//    private String cupSize;
//
//    @Value("${name}")
//    private String name;
//
//    @Value("${age}")
//    private Integer age;

    @Autowired
    private Girl girl;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String say(){
        // return name + age + cupSize;
        return girl.getName();
    }
}
