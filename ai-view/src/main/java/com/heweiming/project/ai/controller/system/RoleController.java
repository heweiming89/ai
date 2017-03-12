package com.heweiming.project.ai.controller.system;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.heweiming.project.ai.model.Role;
import com.heweiming.project.ai.service.RoleService;
import com.heweiming.project.ai.web.DataTablesRequest;
import com.heweiming.project.ai.web.DataTablesResponse;

@Controller
@RequestMapping(value = "/system/role")
public class RoleController {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(RoleController.class);

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index() {
        String viewName = "/sys/role/index";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @RequestMapping(value = "/api", method = RequestMethod.GET)
    @ResponseBody
    public DataTablesResponse load(DataTablesRequest dtRequest, Role role) {
        DataTablesResponse dtResponse = new DataTablesResponse(dtRequest.getDraw());
        Integer startIndex = dtRequest.getStart();
        Integer pageSize = dtRequest.getLength();
        if (StringUtils.isNotBlank(role.getName())) {
            try {
                String name = role.getName();
                role.setName(URLDecoder.decode(URLDecoder.decode(name, "UTF-8"), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                logger.error(e.getMessage(), e);
            }
        }
        //		Page<SysRole> page = roleService.findRoleByPaging(role, startIndex, pageSize);
        //
        //		dtResponse.setData(page.getData());
        //		dtResponse.setRecordsTotal(page.getTotal());
        //		dtResponse.setRecordsFiltered(page.getTotal());

        return dtResponse;
    }

}
