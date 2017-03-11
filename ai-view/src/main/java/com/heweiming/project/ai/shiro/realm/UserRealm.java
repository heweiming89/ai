package com.heweiming.project.ai.shiro.realm;

import java.util.Date;
import java.util.List;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.CollectionUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTime.Property;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.heweiming.project.ai.model.LoginLogExample;
import com.heweiming.project.ai.model.User;
import com.heweiming.project.ai.model.UserExample;
import com.heweiming.project.ai.model.UserExample.Criteria;
import com.heweiming.project.ai.service.LoginLogService;
import com.heweiming.project.ai.service.UserService;

public class UserRealm extends AuthorizingRealm {
    /**
     * Logger for this class
     */
    private static final Logger logger = LoggerFactory.getLogger(UserRealm.class);

    private static final int LOGIN_FAILURE_AMOUNT = 999_999;

    private static final String LOGIN_FAILURE_TIPS_1 = "用户名或密码不正确!";

    private static final String LOGIN_FAILURE_TIPS_2 = "用户今日登录失败次数过多!";

    @Autowired
    private UserService userService;

    @Autowired
    private LoginLogService loginLogService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        Object primaryPrincipal = principals.getPrimaryPrincipal();
        if ("admin".equals(primaryPrincipal)) {
            authorizationInfo.addRole("superAdmin");
        }
        return authorizationInfo;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token)
            throws AuthenticationException {
        UsernamePasswordToken upToken = (UsernamePasswordToken) token;
        String username = upToken.getUsername();
        String password = String.valueOf(upToken.getPassword());
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andPasswordEqualTo(password);
        List<User> users = userService.selectByExample(example);
        SimpleAuthenticationInfo simpleAutInfo = null;

        long failLoginAmount = getCurrentDayFailLoginAmount(username);

        if (CollectionUtils.isEmpty(users)) {
            logger.error("用户 {} 不存在", username);
            throw new UnknownAccountException(LOGIN_FAILURE_TIPS_1);
        } else {
            User user = users.get(0);
            boolean isSame = user.getPassword().equals(password);
            if (isSame) {
                if (failLoginAmount >= LOGIN_FAILURE_AMOUNT) {
                    logger.error("用户 {} 登录失败次数过多", username);
                    throw new ExcessiveAttemptsException(LOGIN_FAILURE_TIPS_2);
                } else {
                    simpleAutInfo = new SimpleAuthenticationInfo(username, password, getName());
                }
            } else {
                logger.error("用户 {} 登录密码不正确", username);
                throw new IncorrectCredentialsException(LOGIN_FAILURE_TIPS_1);
            }
        }

        // if (staff != null && staff.getPassword().equals(password)) {
        //
        // } else if (failLoginAmount == 1) {
        // throw new UnknownAccountException();
        // } else if (failLoginAmount == 2) {
        // throw new IncorrectCredentialsException();
        // } else if (failLoginAmount == 3) {
        // throw new LockedAccountException();
        // } else if (failLoginAmount == 4) {
        // throw new ExcessiveAttemptsException();
        // } else {
        //
        // }

        return simpleAutInfo;
    }

    private long getCurrentDayFailLoginAmount(String username) {
        Property secondOfDay = new DateTime().secondOfDay();
        Date beginTime = secondOfDay.withMinimumValue().toDate();
        Date endTime = secondOfDay.withMaximumValue().toDate();
        LoginLogExample example = new LoginLogExample();
        LoginLogExample.Criteria criteria = example.createCriteria();
        criteria.andLoginTimeBetween(beginTime, endTime);
        criteria.andUsernameEqualTo(username);
        return loginLogService.countByExample(example);
    }

}
