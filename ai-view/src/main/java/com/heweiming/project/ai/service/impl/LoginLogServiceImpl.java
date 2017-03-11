package com.heweiming.project.ai.service.impl;

import org.springframework.stereotype.Service;

import com.heweiming.project.ai.mapper.LoginLogMapper;
import com.heweiming.project.ai.model.LoginLog;
import com.heweiming.project.ai.model.LoginLogExample;
import com.heweiming.project.ai.service.LoginLogService;

@Service("systemLoginLogService")
public class LoginLogServiceImpl extends BaseServiceImpl<LoginLog, LoginLogExample, LoginLogMapper> implements LoginLogService {


}
