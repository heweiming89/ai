package com.heweiming.project.ai.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice(basePackages = { "com.heweiming.project.ai.controller" })
public class GlobalExceptionHandler {
    /**
    * Logger for this class
    */
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(value = { NoHandlerFoundException.class })
    public ModelAndView handleNoTFound(NoHandlerFoundException e) {
        String viewName = "error/404_full";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

    @ExceptionHandler(Exception.class)
    public ModelAndView handleException() {
        String viewName = "error/500_full";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

}
