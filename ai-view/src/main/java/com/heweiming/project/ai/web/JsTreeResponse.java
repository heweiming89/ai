package com.heweiming.project.ai.web;

public class JsTreeResponse {

    private String id;
    private boolean children;
    private String text;
    private String icon;
    private String li_attr;
    private String a_attr;
    private State state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isChildren() {
        return children;
    }

    public void setChildren(boolean children) {
        this.children = children;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getLi_attr() {
        return li_attr;
    }

    public void setLi_attr(String li_attr) {
        this.li_attr = li_attr;
    }

    public String getA_attr() {
        return a_attr;
    }

    public void setA_attr(String a_attr) {
        this.a_attr = a_attr;
    }

    public static class State {

        private boolean opened;
        private boolean disabled;
        private boolean selected;

        public boolean isOpened() {
            return opened;
        }

        public void setOpened(boolean opened) {
            this.opened = opened;
        }

        public boolean isDisabled() {
            return disabled;
        }

        public void setDisabled(boolean disabled) {
            this.disabled = disabled;
        }

        public boolean isSelected() {
            return selected;
        }

        public void setSelected(boolean selected) {
            this.selected = selected;
        }

    }

}
