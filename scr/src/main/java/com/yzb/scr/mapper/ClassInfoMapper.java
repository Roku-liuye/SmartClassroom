package com.yzb.scr.mapper;

import com.yzb.scr.domain.ClassInfo;

import java.util.List;

/**
* @author Roku
* @description 针对表【classinfo(教室信息数据表，用于记录教室的环境状态和设备状态)】的数据库操作Mapper
* @createDate 2025-02-19 17:04:18
* @Entity generator.domain.Classinfo
*/
public interface ClassInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    ClassInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);

    List<ClassInfo> selectClass(ClassInfo classinfo);
}
