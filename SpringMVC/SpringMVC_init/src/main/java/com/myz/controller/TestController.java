package com.myz.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

    private static final Log logger  = LogFactory.getLog(TestController.class);

    @RequestMapping(value = "/hello")
    public ModelAndView hello () {
        logger.info("hello() 方法被调用");
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello, Ma Yuzhe!");
        mv.setViewName("/WEB-INF/views/hello.jsp");
        return mv;
    }
}
