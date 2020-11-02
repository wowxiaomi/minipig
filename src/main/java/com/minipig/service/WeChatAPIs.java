package com.minipig.service;


import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/wechatapis")
public class WeChatAPIs {

    private static Logger logger = Logger.getLogger(WeChatAPIs.class);

    @RequestMapping(value = "minipig", method = RequestMethod.GET)
    public String checkStat(HttpServletRequest request,
                            HttpServletResponse response,
                            @RequestParam(value = "signature", required = true) String signature,
                            @RequestParam(value = "timestamp", required = true) String timestamp,
                            @RequestParam(value = "nonce", required = true) String nonce,
                            @RequestParam(value = "echostr", required = true) String echostr) {
        logger.info("the message from wechat" + signature + timestamp);

        return "success";
    }


}
