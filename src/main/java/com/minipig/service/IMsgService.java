package com.minipig.service;

import javax.servlet.http.HttpServletRequest;

public interface IMsgService {

    /**
     * 处理微信发送到服务的消息
     *
     * @param request
     * @return
     */
    public String processRequest(HttpServletRequest request);


}
