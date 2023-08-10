package com.yuhang.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserLoginRequest implements Serializable {
    private static final long serialVersionUID = -6890840157881219766L;

    private String userAccount;
    private String userPassword;
}
