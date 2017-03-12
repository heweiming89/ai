package com.heweiming.project.ai.service.impl;

import org.springframework.stereotype.Service;

import com.heweiming.project.ai.mapper.RoleMapper;
import com.heweiming.project.ai.model.Role;
import com.heweiming.project.ai.model.RoleExample;
import com.heweiming.project.ai.service.RoleService;

@Service("systemRoleService")
public class RoleServiceImpl extends BaseServiceImpl<Role, RoleExample, RoleMapper>
        implements RoleService {

}
