package com.swaggerui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author xiaolong
 * @create 2020-07-19 23:19
 * @description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/sayhello")
    public Object sayhello(){
        return "hello boy";
    }

    @PostMapping("/saygoodbye")
    public Object saygoodbye(String msg, HttpServletRequest request, HttpServletResponse response, HttpSession httpSession){
        return msg;
    }
}
