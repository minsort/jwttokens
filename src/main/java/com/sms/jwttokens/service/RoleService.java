package com.sms.jwttokens.service;

import com.sms.jwttokens.model.Role;

public interface RoleService {
    Role findByName(String name);
}
