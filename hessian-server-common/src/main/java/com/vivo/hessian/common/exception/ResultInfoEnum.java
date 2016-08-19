package com.vivo.hessian.common.exception;

public enum ResultInfoEnum {

    /** --------------交易相关------------- */
    SUCCESS("000000", "交易成功"),
    UNKNOWN_ERROR("100001", "系统未知异常");


    private String errorCode;
    private String errorMsg;

    ResultInfoEnum(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public String getErrorMsg(String extMsg) {
        return errorMsg + "，" + extMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
