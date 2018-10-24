package com.xy.ups.utils.facade;

import static com.xy.ups.utils.constants.CodeManager.*;
/**
 * Created by tengfei on 2018/10/21.
 */
public class ResponseResult<T> {
    private Integer code;
    private String msg;

    private T data;

    public static <T> ResponseResult success(T data) {
        ResponseResult<T> result = new ResponseResult<>();
        result.setCode(SUCCESS);
        result.setMsg(SUCCESS_MSG);
        result.setData(data);
        return result;
    }

    public static <T> ResponseResult success(String msg,T data) {
        ResponseResult<T> result = new ResponseResult<>();
        result.setCode(SUCCESS);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> ResponseResult<T> failed(Integer errorCode,String errorMsg,T data) {
        ResponseResult<T> result = new ResponseResult<>();
        result.setCode(errorCode);
        result.setMsg(errorMsg);
        result.setData(data);
        return result;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return SUCCESS == this.code;
    }
}
