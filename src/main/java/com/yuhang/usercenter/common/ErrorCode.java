package com.yuhang.usercenter.common;

/**
 * 错误码
 */
public enum ErrorCode {
    SUCCESS(0, "ok", ""),
    PARAMS_ERROR(40000, "Invalid parameters in the request", ""),
    NULL_ERROR(40001, "The requested data is empty", ""),
    NOT_LOGIN(40100, "Not logged in", ""),
    NO_AUTH(40101, "No permission", ""),
    SYSTEM_ERROR(50000, "Internal system error", ""),
    SAVE_ERROR(60000, "Save error", "");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 状态码信息
     */
    private final String message;

    /**
     * 状态码描述（详情）
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
