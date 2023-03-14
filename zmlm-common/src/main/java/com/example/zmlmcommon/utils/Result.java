package com.example.zmlmcommon.utils;

import java.util.Map;
import java.util.Objects;

public class Result {
    //成功
    public static final String SUCCESS = "0";
    //失败
    public static final String ERROR = "-1";

    public static final String ERROR2 = "-2";
    //警告
    public static final String WARNING = "100";

    private String code;
    private String msg;
    private Object data;

    //只返回错误提示信息
    public static Result error(String msg) {
        return defineResult(ERROR, msg);
    }

    //只返回警告提示信息
    public static Result warning(String msg) {
        return defineResult(WARNING, msg);
    }

    //只返回成功提示信息
    public static Result success(String msg) {
        return defineResult(SUCCESS, msg);
    }

    //返回错误，并有数据返回
    public static Result error(String msg, Object data) {
        return defineResult(ERROR, msg, data);
    }

    //返回警告，并有数据返回
    public static Result warning(String msg, Object data) {
        return defineResult(WARNING, msg, data);
    }

    //返回成功，并有数据返回
    public static Result success(String msg, Object data) {
        return defineResult(SUCCESS, msg, data);
    }

    //返回成功，并有数据返回
    public static Result success(Object data) {
        return defineResult(SUCCESS, "成功", data);
    }

    public static Result error(Object data) {
        return defineResult(ERROR, "失败", data);
    }


    //自定义返回结果，且有数据返回
    public static Result defineResult(String code, String msg, Object data) {
        Result result = new Result();
        return result.setCode(code).setMsg(msg).setData(data);
    }

    //自定义返回结果，无数据返回
    public static Result defineResult(String code, String msg) {
        Result result = new Result();
        return result.setCode(code).setMsg(msg);
    }

    //将返回结果转换成通用返回Map，再转为String


    public String getCode() {
        return code;
    }

    public Result setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Result setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getData() {
        return data;
    }

    public Result setData(Object data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
}
