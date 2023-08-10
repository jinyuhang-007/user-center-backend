package com.yuhang.usercenter.service;

import com.yuhang.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 * @author Yuhang Jin
*/
public interface UserService extends IService<User> {



    /**
     * 用户注册
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 教研密码
     *
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     * 用户登陆
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return 返回脱敏用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     *  用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
