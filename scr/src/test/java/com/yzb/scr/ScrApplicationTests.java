package com.yzb.scr;

import com.yzb.scr.mapper.UserInfoMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ScrApplicationTests {

    @Autowired
    UserInfoMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper.selectByPrimaryKey(11L));
    }

}
