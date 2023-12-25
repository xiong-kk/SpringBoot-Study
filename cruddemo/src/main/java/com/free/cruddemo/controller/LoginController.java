package com.free.cruddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author free
 * @create 2023-12-25-20:09
 */
@Controller
public class LoginController {
    @PostMapping(value = "/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            //防止表单重复提交，重定向到主页
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }else {
            map.put("msg","用户名或密码错误");
            return "index";
        }

    }
}
