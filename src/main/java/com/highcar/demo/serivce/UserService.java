package com.highcar.demo.serivce;

import com.highcar.demo.pojo.User;

/**
 * 用户 Service
 **/
public interface UserService {

    /**
     * @Description: 注册
     * @param user 参数封装
     */
    int regist(User user);

    /**
     * @Description: 登陆
     * @param user 用户名和密码
     */
    int login(User user);
}
