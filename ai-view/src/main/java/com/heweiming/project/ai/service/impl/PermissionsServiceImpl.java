package com.heweiming.project.ai.service.impl;

import org.springframework.stereotype.Service;

import com.heweiming.project.ai.mapper.PermissionsMapper;
import com.heweiming.project.ai.model.Permissions;
import com.heweiming.project.ai.model.PermissionsExample;
import com.heweiming.project.ai.service.PermissionsService;

@Service("systemPermissionsService")
public class PermissionsServiceImpl
        extends BaseServiceImpl<Permissions, PermissionsExample, PermissionsMapper>
        implements PermissionsService {

}
