package com.sms.jwttokens.jwt.tokens;

import lombok.Getter;

@Getter
public class LoginUser {
    private String username;
    private String password;
}