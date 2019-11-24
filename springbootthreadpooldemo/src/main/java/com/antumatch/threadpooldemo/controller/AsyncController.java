package com.antumatch.threadpooldemo.controller;

import com.antumatch.threadpooldemo.service.IAsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {
    private static Logger logger = LoggerFactory.getLogger(AsyncController.class);

    @Autowired
    private IAsyncService asyncService;

    @RequestMapping("/controller")
    public String submit(){
        logger.info("start submit");
        //调用service层服务
        asyncService.executeAsync();
        logger.info("end submit");
        return "success";
    }
}
