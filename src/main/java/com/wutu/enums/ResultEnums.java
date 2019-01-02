package com.wutu.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 
 * 错误类型枚举
 */
@Getter
@AllArgsConstructor
public enum ResultEnums {

    //添加枚举对象
    UNKNOWN_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),
    ID_IS_BLANK(10, "id为空"),
    NOVEL_NOT_EXIST(404, "不存在"),
    UPDATE_ERROR(11, "更新错误"),
    FORM_VALIDATION_ERROR(12, "表单验证错误"),
    ;

    private Integer code;

    private String msg;


}
