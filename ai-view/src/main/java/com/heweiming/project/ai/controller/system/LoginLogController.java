package com.heweiming.project.ai.controller.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/system/loginLog")
public class LoginLogController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		String viewName = "/sys/login_log/index";
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

}
