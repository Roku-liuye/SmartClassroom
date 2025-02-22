package com.yzb.scr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzb.scr.domain.UserInfo;
import com.yzb.scr.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserInfoService {


    @Autowired
    UserInfoMapper userInfoMapper;
    public PageInfo getPage(UserInfo userinfo, Integer pageNum) {
        PageHelper.startPage(pageNum, 5, "id desc");
        List<UserInfo> list = userInfoMapper.selectBy(userinfo);
        return new PageInfo(list);
    }
}
