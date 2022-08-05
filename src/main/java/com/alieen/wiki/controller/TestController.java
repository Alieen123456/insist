package com.alieen.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @GetMapping("/hello")
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

        return "Hello Word!"+testHello;
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){

        return "Hello Word! Post."+ name;
    }
}
