package com.heweiming.project.ai.model;

import java.io.Serializable;

public class Session implements Serializable {
    private String id;

    private String context;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public Session withId(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public Session withContext(String context) {
        this.setContext(context);
        return this;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", context=").append(context);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}