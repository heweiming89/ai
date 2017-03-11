package com.heweiming.project.ai.model;

import java.io.Serializable;
import java.util.Date;

public class Menu implements Serializable {
    private Integer id;

    private Integer permissionsId;

    private Integer parentId;

    private String name;

    private String code;

    private String icon;

    private Short sorting;

    private String className;

    private String subClassName;

    private String description;

    private String type;

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

    public Menu withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPermissionsId() {
        return permissionsId;
    }

    public Menu withPermissionsId(Integer permissionsId) {
        this.setPermissionsId(permissionsId);
        return this;
    }

    public void setPermissionsId(Integer permissionsId) {
        this.permissionsId = permissionsId;
    }

    public Integer getParentId() {
        return parentId;
    }

    public Menu withParentId(Integer parentId) {
        this.setParentId(parentId);
        return this;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public Menu withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public Menu withCode(String code) {
        this.setCode(code);
        return this;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIcon() {
        return icon;
    }

    public Menu withIcon(String icon) {
        this.setIcon(icon);
        return this;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Short getSorting() {
        return sorting;
    }

    public Menu withSorting(Short sorting) {
        this.setSorting(sorting);
        return this;
    }

    public void setSorting(Short sorting) {
        this.sorting = sorting;
    }

    public String getClassName() {
        return className;
    }

    public Menu withClassName(String className) {
        this.setClassName(className);
        return this;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getSubClassName() {
        return subClassName;
    }

    public Menu withSubClassName(String subClassName) {
        this.setSubClassName(subClassName);
        return this;
    }

    public void setSubClassName(String subClassName) {
        this.subClassName = subClassName;
    }

    public String getDescription() {
        return description;
    }

    public Menu withDescription(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public Menu withType(String type) {
        this.setType(type);
        return this;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getState() {
        return state;
    }

    public Menu withState(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getActivity() {
        return activity;
    }

    public Menu withActivity(Boolean activity) {
        this.setActivity(activity);
        return this;
    }

    public void setActivity(Boolean activity) {
        this.activity = activity;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Menu withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getCreaterId() {
        return createrId;
    }

    public Menu withCreaterId(Integer createrId) {
        this.setCreaterId(createrId);
        return this;
    }

    public void setCreaterId(Integer createrId) {
        this.createrId = createrId;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public Menu withModifyTime(Date modifyTime) {
        this.setModifyTime(modifyTime);
        return this;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Integer getModifierId() {
        return modifierId;
    }

    public Menu withModifierId(Integer modifierId) {
        this.setModifierId(modifierId);
        return this;
    }

    public void setModifierId(Integer modifierId) {
        this.modifierId = modifierId;
    }

    public String getRemark() {
        return remark;
    }

    public Menu withRemark(String remark) {
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
        sb.append(", permissionsId=").append(permissionsId);
        sb.append(", parentId=").append(parentId);
        sb.append(", name=").append(name);
        sb.append(", code=").append(code);
        sb.append(", icon=").append(icon);
        sb.append(", sorting=").append(sorting);
        sb.append(", className=").append(className);
        sb.append(", subClassName=").append(subClassName);
        sb.append(", description=").append(description);
        sb.append(", type=").append(type);
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