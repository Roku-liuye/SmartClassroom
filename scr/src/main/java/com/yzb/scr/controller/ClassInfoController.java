package com.yzb.scr.controller;

import com.github.pagehelper.PageInfo;
import com.yzb.scr.domain.ClassInfo;
import com.yzb.scr.service.ClassInfoService;
import com.yzb.scr.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/classInfo")
public class ClassInfoController {
    @Autowired
    ClassInfoService classInfoService;

    @PostMapping("/page")
    public ResultVo getClassInfoPage(
            @RequestBody ClassInfo classInfo,
            @RequestParam(defaultValue = "2")Integer pageNum,
            @RequestParam(defaultValue = "6")Integer pageSize
    ){
        PageInfo pageInfo = classInfoService.getPage(classInfo, pageNum, pageSize);
        return ResultVo.success("查询成功",pageInfo);
    }
}
