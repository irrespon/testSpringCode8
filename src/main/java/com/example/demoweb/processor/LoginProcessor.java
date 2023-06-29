package com.example.demoweb.processor;

import com.example.demoweb.service.LoggedUserManagementService;
import com.example.demoweb.service.LoginCountService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    String username;
    String password;

    final LoggedUserManagementService loggedUserManagementService;
    final LoginCountService loginCountService;
    public LoginProcessor(LoggedUserManagementService loggedUserManagementService, LoginCountService loginCountService) {
        this.loggedUserManagementService = loggedUserManagementService;
        this.loginCountService = loginCountService;
    }

    public boolean result(){
        loginCountService.increment();
        boolean result = false;
        if ("a".equals(this.getUsername()) && "b".equals(this.getPassword())){
            result = true;
        loggedUserManagementService.setUsername(username);
        }
        return result;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginCountService getLoginCountService() {
        return loginCountService;
    }
}
