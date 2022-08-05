package com.alieen.wiki.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
//    @PostMapping
//    @PutMapping
//    @DeleteMapping
//    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){

        return "Hello Word!";
    }


    @PostMapping("/hello/post")
    public String helloPost(String name){

        return "Hello Word! Post."+ name;
    }
}
