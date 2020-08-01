package com.minipig.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.*;
import com.minipig.weixin.SignUtil;

/**
 * @author gede
 * @version date：2019年5月22日 下午2:53:46
 * @description ：
 */
@Controller
@RequestMapping("/wechat")
public class WechatSecurity {
    private static Logger logger = Logger.getLogger(WechatSecurity.class);

    @RequestMapping(value = "security", method = RequestMethod.GET)
    public void doGet(
            HttpServletRequest request,
            HttpServletResponse response,
            @RequestParam(value = "signature", required = true) String signature,
            @RequestParam(value = "timestamp", required = true) String timestamp,
            @RequestParam(value = "nonce", required = true) String nonce,
            @RequestParam(value = "echostr", required = true) String echostr) {
        try {
            if (SignUtil.checkSignature(signature, timestamp, nonce)) {
                PrintWriter out = response.getWriter();
                out.print(echostr);
                out.close();
            } else {
                logger.info("这里存在非法请求！");
            }
        } catch (Exception e) {
            logger.error(e, e);
        }
    }

    @RequestMapping(value = "security", method = RequestMethod.POST)
    // post方法用于接收微信服务端消息
    public void DoPost() {
        System.out.println("这是post方法！");
    }
}
