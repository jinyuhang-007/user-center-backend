package com.yuhang.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author Yuhang Jin
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -5221833051513912115L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;


}
