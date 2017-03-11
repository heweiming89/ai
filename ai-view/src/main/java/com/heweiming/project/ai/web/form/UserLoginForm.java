package com.heweiming.project.ai.web.form;

import org.hibernate.validator.constraints.NotEmpty;

import com.heweiming.project.ai.model.User;

public class UserLoginForm extends User {

    private Boolean remember;

    @Override
    @NotEmpty
    public String getUsername() {
        // TODO Auto-generated method stub
        return super.getUsername();
    }

    @Override
    @NotEmpty
    public String getPassword() {
        // TODO Auto-generated method stub
        return super.getPassword();
    }

    public Boolean getRemember() {
        return remember;
    }

    public void setRemember(Boolean remember) {
        this.remember = remember;
    }

}
