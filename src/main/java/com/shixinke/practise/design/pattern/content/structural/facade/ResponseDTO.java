package com.shixinke.practise.design.pattern.content.structural.facade;

/**
 * 接口响应类
 * @author shixinke
 */
public class ResponseDTO<T> {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * 数据体
     */
    private T data;

    public ResponseDTO(Integer code, String message, boolean success, T data) {
        this.code = code;
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static ResponseDTO error(int code, String message) {
        return new ResponseDTO(code, message, false, null);
    }

    public static <T> ResponseDTO success(T data) {
        return new ResponseDTO(200, "success", true, data);
    }
}
