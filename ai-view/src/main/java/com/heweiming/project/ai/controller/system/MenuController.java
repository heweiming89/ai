package com.heweiming.project.ai.controller.system;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.heweiming.project.ai.service.MenuService;
import com.heweiming.project.ai.web.AjaxResponse;
import com.heweiming.project.ai.web.JsTreeResponse;

@Controller
@RequestMapping(value = "/system/menu")
public class MenuController {

	@Autowired
	private MenuService menuService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		String viewName = "/sys/menu/index";
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@GetMapping(value = "/api/{id}")
	@ResponseBody
	public AjaxResponse one(@PathVariable Integer id) {
		AjaxResponse ajaxResponse = new AjaxResponse();
//		SysMenuDto menu = menuService.getMenuByid(id);
//		ajaxResponse.setRespData(menu);
//		ajaxResponse.setSuccess(Boolean.TRUE);
		return ajaxResponse;
	}

	@GetMapping(value = "/api/jsTree")
	@ResponseBody
	public List<JsTreeResponse> jsTree(String id) {
		List<JsTreeResponse> jsTreeList = null;
//		        menuService.jsTree(id);
		return jsTreeList;
	}

}
