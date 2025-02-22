package com.yzb.scr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yzb.scr.mapper")
public class ScrApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScrApplication.class, args);
    }

}
