package com.heweiming.project.ai.model;

import java.io.Serializable;
import java.util.Date;

public class OperationLog implements Serializable {
    private Integer id;

    private String operationType;

    private String operationModule;

    private String operationContent;

    private Integer userId;

    private Date operationTime;

    private String operationIp;

    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public OperationLog withId(Integer id) {
        this.setId(id);
        return this;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOperationType() {
        return operationType;
    }

    public OperationLog withOperationType(String operationType) {
        this.setOperationType(operationType);
        return this;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getOperationModule() {
        return operationModule;
    }

    public OperationLog withOperationModule(String operationModule) {
        this.setOperationModule(operationModule);
        return this;
    }

    public void setOperationModule(String operationModule) {
        this.operationModule = operationModule;
    }

    public String getOperationContent() {
        return operationContent;
    }

    public OperationLog withOperationContent(String operationContent) {
        this.setOperationContent(operationContent);
        return this;
    }

    public void setOperationContent(String operationContent) {
        this.operationContent = operationContent;
    }

    public Integer getUserId() {
        return userId;
    }

    public OperationLog withUserId(Integer userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getOperationTime() {
        return operationTime;
    }

    public OperationLog withOperationTime(Date operationTime) {
        this.setOperationTime(operationTime);
        return this;
    }

    public void setOperationTime(Date operationTime) {
        this.operationTime = operationTime;
    }

    public String getOperationIp() {
        return operationIp;
    }

    public OperationLog withOperationIp(String operationIp) {
        this.setOperationIp(operationIp);
        return this;
    }

    public void setOperationIp(String operationIp) {
        this.operationIp = operationIp;
    }

    public String getRemark() {
        return remark;
    }

    public OperationLog withRemark(String remark) {
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
        sb.append(", operationType=").append(operationType);
        sb.append(", operationModule=").append(operationModule);
        sb.append(", operationContent=").append(operationContent);
        sb.append(", userId=").append(userId);
        sb.append(", operationTime=").append(operationTime);
        sb.append(", operationIp=").append(operationIp);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}