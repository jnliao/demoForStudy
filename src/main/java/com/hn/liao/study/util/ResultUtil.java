package com.hn.liao.study.util;

import com.hn.liao.study.bean.core.CommonResult;
import com.hn.liao.study.bean.core.ResultCodeConstant;

/**
 * @author jinneng.liao
 */
public class ResultUtil {
    public static boolean isSuccess(CommonResult result) {
        return result != null && ResultCodeConstant.SUCCESS.equals(result.getCode());
    }

    public static boolean isSuccessWithData(CommonResult result) {
        return isSuccess(result) && result.getData() != null;
    }

    public static boolean isFailure(CommonResult result) {
        return !isSuccess(result);
    }

    public static boolean isFailureOrNoData(CommonResult result) {
        return !isSuccess(result) || result.getData() == null;
    }
}
