package com.jsp.springshospital.util;

public class ResponseStructure<T> {

	private String msg;
	private int status;
	private Object data;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "ResponseStructure [msg=" + msg + ", status=" + status + ", data=" + data + "]";
	}
	
}
