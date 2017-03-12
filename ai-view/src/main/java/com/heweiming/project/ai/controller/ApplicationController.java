package com.heweiming.project.ai.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.heweiming.project.ai.constant.WebConstants;
import com.heweiming.project.ai.model.LoginLog;
import com.heweiming.project.ai.service.LoginLogService;
import com.heweiming.project.ai.web.AjaxResponse;
import com.heweiming.project.ai.web.form.UserLoginForm;
import com.heweiming.project.ai.web.util.VerifyCodeUtils;

@Controller
public class ApplicationController {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(ApplicationController.class);

    private final static String LOGIN_VIEW_NAME = "login";

    private final static String SUCCESS_VIEW_NAME = "/admin/index";

    @Autowired
    private LoginLogService loginLogService;

    @GetMapping(value = "/login")
    public ModelAndView login() {
        if (logger.isDebugEnabled()) {
            logger.debug("login() - start"); //$NON-NLS-1$
        }

        String viewName = LOGIN_VIEW_NAME;
        Subject currentUser = SecurityUtils.getSubject();
        if (currentUser != null && currentUser.isAuthenticated()) {
            viewName = "redirect:" + SUCCESS_VIEW_NAME;
        }
        ModelAndView mav = new ModelAndView(viewName);

        if (logger.isDebugEnabled()) {
            logger.debug("login() - end"); //$NON-NLS-1$
        }
        return mav;
    }

    @GetMapping(value = "/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType(MimeTypeUtils.IMAGE_JPEG_VALUE);
        //生成随机字串  
        String verifyCode = VerifyCodeUtils.generateVerifyCode(RandomUtils.nextInt(4, 6));
        if (logger.isInfoEnabled()) {
            logger.info(
                    "verifyCode(HttpServletRequest, HttpServletResponse) - String verifyCode={}", //$NON-NLS-1$
                    verifyCode);
        }

        //存入会话session  
        HttpSession session = request.getSession(true);
        session.setAttribute(WebConstants.VERIFIY_CODE, verifyCode.toLowerCase());
        //生成图片  
        int w = 103, h = 41;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

    @PostMapping(value = "/verifyCode")
    @ResponseBody
    public Object verifyCode(HttpSession session, @NotEmpty String verifyCode) throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("verifyCode(HttpServletRequest, HttpServletResponse, String) - start"); //$NON-NLS-1$
        }

        Object result = null;
        String confirm = (String) session.getAttribute(WebConstants.VERIFIY_CODE);
        if (StringUtils.isNotBlank(verifyCode) && verifyCode.equalsIgnoreCase(confirm)) {
            result = true;
        } else {
            result = "验证码不正确";
        }

        if (logger.isDebugEnabled()) {
            logger.debug("verifyCode(HttpServletRequest, HttpServletResponse, String) - end"); //$NON-NLS-1$
        }
        return result;
    }

    @PostMapping(value = { "/login" })
    @ResponseBody
    public AjaxResponse login(@Valid UserLoginForm user, BindingResult result) {
        AjaxResponse ajaxResponse = new AjaxResponse();
        if (result.hasErrors()) {
            List<FieldError> errors = result.getFieldErrors();
            StringBuffer sb = new StringBuffer();
            for (FieldError error : errors) {
                sb.append(error.getField())//
                        .append("&nbsp;&nbsp;")//
                        .append(error.getDefaultMessage())//
                        .append("<br />");
            }
            ajaxResponse.setMsg(sb.toString());
            return ajaxResponse;
        }
        Subject currentUser = SecurityUtils.getSubject();
        String username = user.getUsername();
        String password = user.getPassword();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        boolean loginSuccess = false;
        LoginLog loginLog = new LoginLog();

        try {
            currentUser.login(token);
            loginSuccess = true;
            ajaxResponse.setSuccess(true);
        } catch (AuthenticationException e) {
            ajaxResponse.setMsg(e.getMessage());
            e.printStackTrace();
        } finally {
            loginLog.setLoginTime(new Date());
            loginLog.setUsername(user.getUsername());
            loginLog.setLoginState(loginSuccess);
            loginLogService.insert(loginLog);
        }

        return ajaxResponse;
    }

    @GetMapping(value = { "/logout" })
    public ModelAndView logout() {
        String viewName = "redirect:/login";
        ModelAndView mav = new ModelAndView(viewName);
        Subject currentUser = SecurityUtils.getSubject();
        currentUser.logout();
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

    @GetMapping(value = "/error/404")
    public ModelAndView noTFound() {
        String viewName = "pages/error/404_full";
        ModelAndView mav = new ModelAndView();
        mav.setViewName(viewName);
        return mav;
    }

}
