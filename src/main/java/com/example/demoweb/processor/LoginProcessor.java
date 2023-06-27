package com.example.demoweb.processor;

import com.example.demoweb.model.LoginUser;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    String username;
    String password;

    public boolean result(){
        return "a".equals(this.getUsername()) & "b".equals(this.getPassword());
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
}
