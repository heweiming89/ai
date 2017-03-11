package com.heweiming.project.ai.model;

import java.io.Serializable;
import java.util.Date;

public class Permissions implements Serializable {
    private Integer id;

    private String name;

    private String url;

    private String method;

    private String state;

    private String type;

    private String genusGroup;

    private String description;

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

    public Permissions withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Permissions withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public Permissions withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public Permissions withMethod(String method) {
        this.setMethod(method);
        return this;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getState() {
        return state;
    }

    public Permissions withState(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public Permissions withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGenusGroup() {
        return genusGroup;
    }

    public Permissions withGenusGroup(String genusGroup) {
        this.setGenusGroup(genusGroup);
        return this;
    }

    public void setGenusGroup(String genusGroup) {
        this.genusGroup = genusGroup;
    }

    public String getDescription() {
        return description;
    }

    public Permissions withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getActivity() {
        return activity;
    }

    public Permissions withActivity(Boolean activity) {
        this.setActivity(activity);
        return this;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Permissions withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public Permissions withCreaterId(Integer createrId) {
        this.setCreaterId(createrId);
        return this;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public Permissions withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public Permissions withModifierId(Integer modifierId) {
        this.setModifierId(modifierId);
        return this;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getRemark() {
        return remark;
    }

    public Permissions withRemark(String remark) {
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
        sb.append(", name=").append(name);
        sb.append(", url=").append(url);
        sb.append(", method=").append(method);
        sb.append(", state=").append(state);
        sb.append(", type=").append(type);
        sb.append(", genusGroup=").append(genusGroup);
        sb.append(", description=").append(description);
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