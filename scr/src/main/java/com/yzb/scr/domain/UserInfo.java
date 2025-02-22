package com.yzb.scr.domain;

import lombok.Data;

/**
 * &#064;TableName  users
 */
@Data
public class UserInfo {
    private Integer id;

    private String username;

    private String passwordHash;

    private String nickname;

    private Object role;
}