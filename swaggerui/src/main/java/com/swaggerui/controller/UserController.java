package com.swaggerui.controller;

import com.swaggerui.model.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;

/**
 * @author xiaolong
 * @create 2020-07-19 23:11
 * @description
 */
@Api(tags = "用户相关的请求")
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/findone")
    public Object findone(){
        return "张三";
    }

    @PostMapping("/addname")
    public Object addname(String name){
        return name;
    }

    @ApiOperation("获取用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", defaultValue = "zhangsan"),
            @ApiImplicitParam(name = "pwd", value = "密码", defaultValue = "123456")
    })
    @PostMapping("finduser")
    public Object finduser(String name, String pwd){
        User user=new User(name,pwd);
        return user;
    }

    @PostMapping("/deluser")
    public Object deluser(@RequestBody User user){
        return user;
    }
}
