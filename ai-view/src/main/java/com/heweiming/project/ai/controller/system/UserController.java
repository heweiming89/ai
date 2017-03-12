package com.heweiming.project.ai.controller.system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.heweiming.project.ai.model.User;
import com.heweiming.project.ai.service.UserService;
import com.heweiming.project.ai.web.DataTablesRequest;
import com.heweiming.project.ai.web.DataTablesResponse;

@Controller
@RequestMapping(value = "/system/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ModelAndView index() {
        String viewName = "/sys/user/index";
        ModelAndView mav = new ModelAndView(viewName);
        return mav;
    }

    @GetMapping(value = "/api")
    @ResponseBody
    public DataTablesResponse load(DataTablesRequest dtRequest, User user) {
        DataTablesResponse dtResponse = new DataTablesResponse();
        Integer startIndex = dtRequest.getStart();
        Integer pageSize = dtRequest.getLength();
        //		Page<User> page = userService.findUserByPaging(user, startIndex, pageSize);
        //		dtResponse.setData(page.getData());
        //		dtResponse.setRecordsFiltered(page.getTotal());
        //		dtResponse.setRecordsTotal(page.getTotal());
        return dtResponse;
    }

}
