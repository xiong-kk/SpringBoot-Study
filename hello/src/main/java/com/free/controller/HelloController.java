package com.free.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author free
 * @create 2023-10-19-22:42
 */
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/")
    public String hello(){
        return "hello";
    }
}
