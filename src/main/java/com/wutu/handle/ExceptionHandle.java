package com.wutu.handle;


import com.wutu.enums.ResultEnums;
import com.wutu.exception.GlobalException;
import com.wutu.utils.ResultUtils;
import com.wutu.vo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理
 */
@RestControllerAdvice
@Slf4j
public class ExceptionHandle {

    /**
     * 全局处理异常方法
     *
     * @param e 所有的异常
     * @return Result
     */
    @ExceptionHandler(value = Exception.class)
    public Result handle(Exception e) {
        //判断为GlobalException的子类
        if (e instanceof GlobalException) {
            GlobalException libraryException = (GlobalException) e;
            return ResultUtils.error(libraryException.getCode(), libraryException.getMessage());
        } else {//其他错误
            log.error("【系统异常】 {}", e);
            return ResultUtils.error(ResultEnums.UNKNOWN_ERROR);
        }
    }

}
