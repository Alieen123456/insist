package com.alieen.wiki.controller;

import org.springframework.web.bind.annotation.*;

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
}
