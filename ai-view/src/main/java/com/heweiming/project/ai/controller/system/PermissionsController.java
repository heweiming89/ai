package com.heweiming.project.ai.controller.system;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.condition.PatternsRequestCondition;
import org.springframework.web.servlet.mvc.condition.RequestMethodsRequestCondition;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import com.heweiming.project.ai.model.Permissions;
import com.heweiming.project.ai.model.PermissionsExample;
import com.heweiming.project.ai.service.PermissionsService;
import com.heweiming.project.ai.web.AjaxResponse;
import com.heweiming.project.ai.web.DataTablesRequest;
import com.heweiming.project.ai.web.DataTablesResponse;

@Controller
@RequestMapping(value = "/system/permissions")
public class PermissionsController {

	/**
	* Logger for this class
	*/
	private static final Logger logger = LoggerFactory.getLogger(PermissionsController.class);

	@Autowired
	private RequestMappingHandlerMapping requestMappingHandlerMapping;

	@Autowired
	private PermissionsService permissionsService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		String viewName = "/sys/permissions/index";
		logger.info("requestMappingHandlerMapping", requestMappingHandlerMapping);
		ModelAndView mav = new ModelAndView(viewName);
		return mav;
	}

	@GetMapping(value = "/api")
	@ResponseBody
	public DataTablesResponse load(DataTablesRequest dtRequest, Permissions permission) {
		DataTablesResponse dtResponse = new DataTablesResponse(dtRequest.getDraw());
//		RowBounds rowBounds = new RowBounds(dtRequest.getStart(), dtRequest.getLength());
//		Page<Permissions> page = permissionsService.;
//		dtResponse.setData(page.getData());
//		dtResponse.setRecordsFiltered(page.getTotal());
//		dtResponse.setRecordsTotal(page.getTotal());
		return dtResponse;
	}

	@PostMapping(value = "/api/init")
	@ResponseBody
	public AjaxResponse init() {
		AjaxResponse ajaxResponse = new AjaxResponse();
		Set<Permissions> permissionsSet = getUninitializedPermissionSet();
		for (Permissions permissions : permissionsSet) {
		    permissionsService.insert(permissions);
        }
		ajaxResponse.setSuccess(Boolean.TRUE);
		return ajaxResponse;
	}

	private Set<Permissions> getUninitializedPermissionSet() {
		ArrayList<Permissions> permissionsList = new ArrayList<>();
		Map<RequestMappingInfo, HandlerMethod> methodMap = requestMappingHandlerMapping.getHandlerMethods();
		Set<RequestMappingInfo> mappingInfoSet = methodMap.keySet();
		for (RequestMappingInfo info : mappingInfoSet) {
			HandlerMethod handlerMethod = methodMap.get(info);
			Class<?> controller = handlerMethod.getBeanType();
			Class<?> returnType = handlerMethod.getMethod().getReturnType();
			RestController restController = controller.getAnnotation(RestController.class);
			ResponseBody responseBody = handlerMethod.getMethodAnnotation(ResponseBody.class);
			if (restController != null || responseBody != null || returnType == ResponseEntity.class) {
				PatternsRequestCondition patternsCondition = info.getPatternsCondition();
				RequestMethodsRequestCondition methodsCondition = info.getMethodsCondition();
				Set<String> patterns = patternsCondition.getPatterns();
				Set<RequestMethod> methods = methodsCondition.getMethods();
				if (CollectionUtils.isNotEmpty(patterns) && CollectionUtils.isNotEmpty(methods)) {
					for (String url : patterns) {
						for (RequestMethod requestMethod : methods) {
							Permissions permission = new Permissions();
							permission.setUrl(url);
							permission.setMethod(requestMethod.name());
							permission.setCreateTime(new Date());
//							permission.setType(SysPermissionsCriteria.TYPE_AJAX);
							permission.setType("1");
							permission.setActivity(Boolean.TRUE);
							permissionsList.add(permission);
						}
					}
				}
			}
		}
		permissionsList.trimToSize();
		List<Permissions> initializedPermissionList = permissionsService.selectByExample(new PermissionsExample());
		permissionsList.removeAll(initializedPermissionList);
		Set<Permissions> permissionsSet = new LinkedHashSet<>(permissionsList);
		return permissionsSet;

	}

}
