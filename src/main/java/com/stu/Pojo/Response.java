package com.stu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Response<T> {
    private int code;
    private String message;
    private T data;

    // 构造成功响应
    public static <T> Response<T> success(T data) {
        return new Response<>(200, "Success", data);
    }

    // 构造失败响应
    public static <T> Response<T> error(int code, String message) {
        return new Response<>(code, message, null);
    }
}
