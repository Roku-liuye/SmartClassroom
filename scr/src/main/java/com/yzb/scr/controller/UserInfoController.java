package com.yzb.scr.controller;

import com.github.pagehelper.PageInfo;
import com.yzb.scr.domain.UserInfo;
import com.yzb.scr.service.UserInfoService;
import com.yzb.scr.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @PostMapping("/page")
    public ResultVo page(@RequestBody UserInfo userinfo, @RequestParam (defaultValue = "1")Integer pageNums) {
         PageInfo pageInfo = userInfoService.getPage(userinfo,pageNums);
         return ResultVo.success("查询成功",pageInfo);

    }
}
