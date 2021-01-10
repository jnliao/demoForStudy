package com.hn.liao.study.bean.core;

import java.io.Serializable;

/**
 * @author jinneng.liao
 */
public class CommonResult<T> implements Serializable {
    private static final long serialVersionUID = -5909552957704013758L;

    private String code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(String code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static <T> CommonResult<T> create(String code, String message) {
        return new CommonResult(code, message, null);
    }

    public static <T> CommonResult<T> create(String code, String message, T data) {
        return new CommonResult(code, message, data);
    }

    public static <T> CommonResult<T> success() {
        return successMessage(null);
    }

    public static <T> CommonResult<T> successData(T data) {
        return successData(null, data);
    }

    public static <T> CommonResult<T> successMessage(String message) {
        return successData(message, null);
    }

    public static <T> CommonResult<T> successData(String message, T data) {
        return create(ResultCodeConstant.SUCCESS, message, data);
    }

    public static <T> CommonResult<T> error() {
        return errorMessage(null);
    }

    public static <T> CommonResult<T> errorData(T data) {
        return errorData(null, data);
    }

    public static <T> CommonResult<T> errorMessage(String message) {
        return errorData(message, null);
    }

    public static <T> CommonResult<T> errorData(String message, T data) {
        return create(ResultCodeConstant.ERROR, message, data);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
