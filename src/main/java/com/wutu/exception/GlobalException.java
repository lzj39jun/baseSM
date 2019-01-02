package com.wutu.exception;

import com.wutu.enums.ResultEnums;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * 
 */
public class GlobalException extends RuntimeException {

    @Getter @Setter
    private Integer code;

    /** 构造函数*/
    public GlobalException(ResultEnums resultEnums){
        super(resultEnums.getMsg());
        this.code = resultEnums.getCode();
    }

}
