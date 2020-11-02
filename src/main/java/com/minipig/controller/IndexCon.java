package com.minipig.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexCon {

    private static Logger logger = Logger.getLogger(IndexCon.class);

    @RequestMapping("/index")
    public String index() {
        logger.info("this is index");
        return "index";
    }

    public String weChat() {
        logger.info(" The request message from webChat ");
        return "The message from miniPig";
    }

}
