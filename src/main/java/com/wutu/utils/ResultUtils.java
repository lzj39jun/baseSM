package com.wutu.utils;


import com.wutu.enums.ResultEnums;
import com.wutu.vo.Result;

/**
 * result工具类
 */
public class ResultUtils {

    /**
     * 成功方法
     * @param object
     * @return
     */
    public static Result success(Object object) {
        return new Result(0, "成功", object);
    }

    /**
     * 成功且没有response参数data传出
     * @return
     */
    public static Result success(){
        return success(null);
    }

    /**
     * 失败方法
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg){
        return new Result(code, msg, null);
    }

    /**
     * 失败方法，调用枚举对象
     * @param resultEnums
     * @return
     */
    public static Result error(ResultEnums resultEnums){
        return new Result(resultEnums.getCode(), resultEnums.getMsg(), null);
    }

    public static Result error(ResultEnums resultEnums, Object o){
        return new Result(resultEnums.getCode(), resultEnums.getMsg(), o);
    }


}
