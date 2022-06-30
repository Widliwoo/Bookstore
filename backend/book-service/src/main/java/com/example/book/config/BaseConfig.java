package com.example.book.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class BaseConfig {

    @Value("${spring.datasource.url}")
    public String url;

    @Value("${spring.datasource.username}")
    public String user;

    @Value("${spring.datasource.password}")
    public String password;

    @PostConstruct
    public void init() {
        System.out.printf("[username: '%s', password: '%s', url: '%s']\n", user, password, url);
    }

}
