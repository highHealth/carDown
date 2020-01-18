package com.highcar.demo.mapper;

import com.highcar.demo.pojo.User;
import org.apache.ibatis.annotations.*;

/**
 * 用户 Mapper
 */
public interface UserMapper {
    /**
     * 查询用户名是否存在，若存在，不允许注册
     * @param username
     * @return User 用户
     */
    User findUserByName(@Param("username") String username);

    /**
     * 注册  插入一条user记录
     * @param user
     * @return
     */
    void regist(User user);

    /**
     * 登录
     * @param user
     * @return String 用户id
     */
    String login(User user);

}
