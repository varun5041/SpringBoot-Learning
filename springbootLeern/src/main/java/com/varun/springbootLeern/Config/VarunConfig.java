package com.varun.springbootLeern.Config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "varun.config")
@Component
public class VarunConfig {
    private String name;
    private String password;
    private String email;
    private String emailExpTime;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmailExpTime() {
        return emailExpTime;
    }

    public void setEmailExpTime(String emailExpTime) {
        this.emailExpTime = emailExpTime;
    }
}
