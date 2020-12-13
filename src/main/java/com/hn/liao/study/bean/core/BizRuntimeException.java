package com.hn.liao.study.bean.core;

/**
 * @author jinneng.liao
 */
public class BizRuntimeException extends RuntimeException {
    private static final String GENERAL_ERROR_CODE = "1";
    private String code;
    private String message;

    public BizRuntimeException() {
    }

    public BizRuntimeException(String code) {
        this(code, (String) null);
    }

    public BizRuntimeException(String code, String message) {
        this(code, message, (Throwable) null);
    }

    public BizRuntimeException(String code, Throwable cause) {
        this(code, (String) null, cause);
    }

    public BizRuntimeException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public static BizRuntimeException create(String errMsg) {
        return new BizRuntimeException(GENERAL_ERROR_CODE, errMsg);
    }

    public static BizRuntimeException create(String errMsg, Throwable cause) {
        return new BizRuntimeException(GENERAL_ERROR_CODE, errMsg, cause);
    }

    public String getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.message;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
