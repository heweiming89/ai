package com.heweiming.project.ai.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.GetMapping;

import com.heweiming.project.ai.web.util.VerifyCodeUtils;

@Controller
public class VerifyCodeController {

    @GetMapping(value = "/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType(MimeTypeUtils.IMAGE_JPEG_VALUE);
        //生成随机字串  
        String verifyCode = VerifyCodeUtils.generateVerifyCode(6);
        //存入会话session  
        HttpSession session = request.getSession(true);
        session.setAttribute("verifyCode", verifyCode.toLowerCase());
        //生成图片  
        int w = 110, h = 43;
        VerifyCodeUtils.outputImage(w, h, response.getOutputStream(), verifyCode);
    }

}
