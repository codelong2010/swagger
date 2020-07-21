package com.swaggerui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiaolong
 * @create 2020-07-20 23:13
 * @description
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public Object login(){
        return "login";
    }
}
