package com.minipig.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 注册用户
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SigninUser implements Serializable {

    /**
     * 注册名
     */
    public String signinUserName;

    /**
     * 注册PWD
     */
    public String siginUserPwd;

}
