package com.heweiming.project.ai.service.impl;

import org.springframework.stereotype.Service;

import com.heweiming.project.ai.mapper.MenuMapper;
import com.heweiming.project.ai.model.Menu;
import com.heweiming.project.ai.model.MenuExample;
import com.heweiming.project.ai.service.MenuService;

@Service("systemMenuService")
public class MenuServiceImpl extends BaseServiceImpl<Menu, MenuExample, MenuMapper>
        implements MenuService {

}
