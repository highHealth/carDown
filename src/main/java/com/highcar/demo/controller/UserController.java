package com.highcar.demo.controller;

import com.highcar.demo.pojo.User;
import com.highcar.demo.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 Controller
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user 用户参数封装
     * @return int 返回码
     */
    @PostMapping(value = "/regist")
    public int regist(@RequestBody User user){
        return userService.regist(user);
    }

    /**
     * 登录
     * @param user 用户参数封装
     * @return int 返回码
     */
    @PostMapping(value = "/login")
    public int login(@RequestBody User user){
       return userService.login(user);
    }

}
