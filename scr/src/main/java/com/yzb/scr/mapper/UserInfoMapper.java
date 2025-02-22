package com.yzb.scr.mapper;

import com.yzb.scr.domain.UserInfo;

import java.util.List;

/**
* @author Roku
* @description 针对表【users(用户表)】的数据库操作Mapper
* @createDate 2025-02-16 18:07:17
* @Entity generator.domain.Users
*/

public interface UserInfoMapper {

    int deleteByPrimaryKey(Long id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectBy(UserInfo userInfo);
}
