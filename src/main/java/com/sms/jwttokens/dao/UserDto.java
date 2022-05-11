package com.sms.jwttokens.dao;

import com.sms.jwttokens.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class UserDto {

    private String username;
    private String password;
    private String email;
    private String phone;
    private String name;
    private String businessTitle;


    public User getUserFromDto(){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setEmail(email);
        user.setPhone(phone);
        user.setName(name);
        user.setBusinessTitle(businessTitle);

        return user;
    }


}
