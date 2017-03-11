package com.heweiming.project.ai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    @GetMapping(value = "/login")
    public ModelAndView login() {
        String viewName = "login";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

    @GetMapping(value = "/index")
    public ModelAndView index() {
        String viewName = "index";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

    @GetMapping(value = "/admin/index")
    public ModelAndView adminIndex() {
        String viewName = "admin_index";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

}
