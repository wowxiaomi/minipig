package com.minipig;

import com.minipig.mapper.SiginUserMapper;
import com.minipig.pojo.SigninUser;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

public class MinipigMapperTests {

    private static Logger logger = Logger.getLogger(MinipigMapperTests.class);

    @Autowired
    SiginUserMapper siginUserMapper;

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void siginupUser() {
        String id = "s_0010002000";
        String username = "nick";
        String pwd = "222222";
        SigninUser user = new SigninUser();
        user.setSiginUserPwd(pwd);
        user.setSigninUserId(id);
        user.setSigninUserName(username);
        try {
            siginUserMapper.siginUp(user);
            logger.info("--------------------------------------------");
            logger.info(siginUserMapper.findAllSigninUser().get(0).getSigninUserName());
            logger.info(siginUserMapper.findAllSigninUser().get(1).getSigninUserName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getAllUser() {
        try {
            List<SigninUser> users = siginUserMapper.findAllSigninUser();
            if (users != null)
                logger.info(users.get(0).signinUserName);
            else
                logger.info("user is null");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
