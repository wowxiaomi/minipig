package com.minipig.mapper;

import com.minipig.pojo.SigninUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SiginUserMapper {

    /**
     * 保存注册用户
     *
     * @param signinUser
     */
    void siginUp(SigninUser signinUser);

    /**
     * 获得所有登录用户
     *
     * @return
     */
    List<SigninUser> findAllSigninUser();

}
