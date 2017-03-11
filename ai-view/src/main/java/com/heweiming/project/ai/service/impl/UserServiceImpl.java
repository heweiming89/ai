package com.heweiming.project.ai.service.impl;

import org.springframework.stereotype.Service;

import com.heweiming.project.ai.mapper.UserMapper;
import com.heweiming.project.ai.model.User;
import com.heweiming.project.ai.model.UserExample;
import com.heweiming.project.ai.service.UserService;

@Service("systemUserService")
public class UserServiceImpl extends BaseServiceImpl<User, UserExample, UserMapper>
        implements UserService {

}
