package com.minipig.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 注册用户
 */
@AllArgsConstructor
@NoArgsConstructor
public class SigninUser implements Serializable {

    /**
     * 注册id
     */
    public String signinUserId;

    /**
     * 注册名
     */
    public String signinUserName;

    /**
     * 注册PWD
     */
    public String siginUserPwd;

    public void setSiginUserPwd(String siginUserPwd) {
        this.siginUserPwd = siginUserPwd;
    }

    public String getSiginUserPwd() {
        return siginUserPwd;
    }

    public void setSigninUserName(String signinUserName) {
        this.signinUserName = signinUserName;
    }

    public String getSigninUserName() {
        return signinUserName;
    }

    public void setSigninUserId(String signinUserId) {
        this.signinUserId = signinUserId;
    }

    public String getSigninUserId() {
        return signinUserId;
    }
}
