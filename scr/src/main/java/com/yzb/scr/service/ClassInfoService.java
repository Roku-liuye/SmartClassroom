package com.yzb.scr.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yzb.scr.domain.ClassInfo;
import com.yzb.scr.mapper.ClassInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassInfoService {

    @Autowired
    ClassInfoMapper classInfoMapper;

    public PageInfo getPage(ClassInfo classinfo,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize, "classroom_id desc");
        List<ClassInfo> list = classInfoMapper.selectClass(classinfo);
        return new PageInfo(list);
    }
}
