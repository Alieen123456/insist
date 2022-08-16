package com.alieen.wiki.controller;

import com.alieen.wiki.domain.Test;
import com.alieen.wiki.service.TestService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Value("${test.hello:TEST}")
    private String testHello;

    @Resource
    private TestService testService;


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


    @GetMapping("/test/list")
    public List<Test> list(){

        return testService.list();
    }

}
