package com.himly.controller;

import com.himly.service.UserService;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 内容模块
 */
@Controller
public class ContentController {
    private static final Logger log = Logger.getLogger(ContentController.class);

    private UserService userService;
    @Autowired
    ApplicationContext context;

    @RequestMapping(value = "/a/test",method = RequestMethod.GET)
    public String test(String content,Model model) {

        userService = context.getBean(UserService.class);

        try {
            userService.getUserById(45L);
        }catch (Exception e) {
            log.error("has an error,see=="+e.getMessage(),e);
        }


        log.info("content is=="+content);
        model.addAttribute("content",content);

        return "test";
    }
}
