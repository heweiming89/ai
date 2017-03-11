package com.heweiming.project.ai.model;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Integer id;

    private String roleNo;

    private String name;

    private String description;

    private String state;

    private Boolean activity;

    private Date createTime;

    private Integer createrId;

    private Date modifyTime;

    private Integer modifierId;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public Role withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleNo() {
        return roleNo;
    }

    public Role withRoleNo(String roleNo) {
        this.setRoleNo(roleNo);
        return this;
    }

    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    public String getName() {
        return name;
    }

    public Role withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public Role withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public Role withState(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getActivity() {
        return activity;
    }

    public Role withActivity(Boolean activity) {
        this.setActivity(activity);
        return this;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Role withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public Role withCreaterId(Integer createrId) {
        this.setCreaterId(createrId);
        return this;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public Role withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public Role withModifierId(Integer modifierId) {
        this.setModifierId(modifierId);
        return this;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getRemark() {
        return remark;
    }

    public Role withRemark(String remark) {
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
        sb.append(", roleNo=").append(roleNo);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", state=").append(state);
        sb.append(", activity=").append(activity);
        sb.append(", createTime=").append(createTime);
        sb.append(", createrId=").append(createrId);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", modifierId=").append(modifierId);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}