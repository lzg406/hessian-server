package com.vivo.hessian.export;

public class Result implements java.io.Serializable{
	
	/**服务端响应结果*/
	private Boolean success;
	
	/**服务端响应代码*/
	private String code;
	
	/**服务端响应消息*/
	private String info;

	public Result() {
	}

	public Result(boolean isSuccess) {
		this.success = isSuccess;
	}
	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
	public String toString() {
		
		return "{\"success\":"+success+",\"info\":\""+info+"\",\"code\":\""+code+"\"}";
	}

}
