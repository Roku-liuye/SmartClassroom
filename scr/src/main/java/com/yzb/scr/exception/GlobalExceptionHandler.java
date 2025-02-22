package com.yzb.scr.exception;

import com.yzb.scr.vo.ResultVo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)//针对什么异常进行处理
    @ResponseBody
    public ResultVo error(Exception e){
        e.printStackTrace();
        return ResultVo.error(e.getMessage());
    }
}
