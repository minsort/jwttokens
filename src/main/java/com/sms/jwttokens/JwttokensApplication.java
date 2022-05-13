package com.sms.jwttokens;

import com.sms.jwttokens.dao.RoleDao;
import com.sms.jwttokens.model.Role;
import com.sms.jwttokens.model.User;
import com.sms.jwttokens.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class JwttokensApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwttokensApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(RoleDao roleDao){
        return (args) -> {
            roleDao.save(new Role("ROLE_ADMIN","qqqqqq"));
            roleDao.save(new Role("ROLE_MODERATOR","qqqwww"));
            roleDao.save(new Role("ROLE_USER","yyyyy"));
        };
    }

}
