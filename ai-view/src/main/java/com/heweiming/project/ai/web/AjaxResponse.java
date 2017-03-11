package com.heweiming.project.ai.web;

public class AjaxResponse {

	private boolean success;
	private String msg;
	private Object data;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getRespData() {
		return data;
	}

	public void setRespData(Object data) {
		this.data = data;
	}

}
