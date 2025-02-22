package com.yzb.scr.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultVo{
    private Integer code;// 2000 5000
    private String msg;
    private Object data;// 数据

    public static ResultVo success(String msg, Object data) {
        return new ResultVo(2000, msg, data);
    }
    public static ResultVo error(String msg) {
        return new ResultVo(5000, "服务器异常" + msg, null);
    }
}
