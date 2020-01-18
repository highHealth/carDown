package com.highcar.demo.serivce.impl;

import com.highcar.demo.mapper.UserMapper;
import com.highcar.demo.pojo.User;
import com.highcar.demo.serivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户 ServiceImpl
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * @Description: 注册
     * @param user 参数封装
     */
    @Override
    public int regist(User user) {
        User existUser = userMapper.findUserByName(user.getUsername());
        if(existUser != null){
            //如果用户名已存在，返回1
            return 1;
        }else{
            userMapper.regist(user);
            // 注册成功返回0
            return 0;
        }
    }

    /**
     * @Description: 登陆
     * @param user 用户名和密码
     */
    @Override
    public int login(User user) {
        User existUser = userMapper.findUserByName(user.getUsername());
        String userId= userMapper.login(user);
        if(existUser == null){
            // 用户不存在返回1
            return 1;
        } else if(userId == null){
            // 密码错误返回2
            return 2;
        } else {
            // 登陆成功返回0
            return 0;
        }
    }
}
