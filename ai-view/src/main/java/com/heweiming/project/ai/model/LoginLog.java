package com.heweiming.project.ai.model;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private Integer id;

    private String username;

    private Date loginTime;

    private String loginIp;

    private Boolean loginState;

    private String loginBrowser;

    private String screenResolution;

    private String operatingSystem;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public LoginLog withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public LoginLog withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public LoginLog withLoginTime(Date loginTime) {
        this.setLoginTime(loginTime);
        return this;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginIp() {
        return loginIp;
    }

    public LoginLog withLoginIp(String loginIp) {
        this.setLoginIp(loginIp);
        return this;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    public Boolean getLoginState() {
        return loginState;
    }

    public LoginLog withLoginState(Boolean loginState) {
        this.setLoginState(loginState);
        return this;
    }

    public void setLoginState(Boolean loginState) {
        this.loginState = loginState;
    }

    public String getLoginBrowser() {
        return loginBrowser;
    }

    public LoginLog withLoginBrowser(String loginBrowser) {
        this.setLoginBrowser(loginBrowser);
        return this;
    }

    public void setLoginBrowser(String loginBrowser) {
        this.loginBrowser = loginBrowser;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public LoginLog withScreenResolution(String screenResolution) {
        this.setScreenResolution(screenResolution);
        return this;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public LoginLog withOperatingSystem(String operatingSystem) {
        this.setOperatingSystem(operatingSystem);
        return this;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getRemark() {
        return remark;
    }

    public LoginLog withRemark(String remark) {
        this.setRemark(remark);
        return this;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", loginIp=").append(loginIp);
        sb.append(", loginState=").append(loginState);
        sb.append(", loginBrowser=").append(loginBrowser);
        sb.append(", screenResolution=").append(screenResolution);
        sb.append(", operatingSystem=").append(operatingSystem);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}