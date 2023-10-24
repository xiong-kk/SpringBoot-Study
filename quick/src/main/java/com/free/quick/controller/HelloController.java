package com.free.quick.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author free
 * @create 2023-10-24-22:25
 */

//这个类的所以
@RestController

public class HelloController {
    @RequestMapping("/")
    public String hello(){
        return "hello world quick";
    }
}
