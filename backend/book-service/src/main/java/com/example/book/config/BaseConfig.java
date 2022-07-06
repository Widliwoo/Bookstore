package com.example.book.config;

import com.example.bookstoresecurity.CommonSecurityConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(CommonSecurityConfig.class)
public class BaseConfig {

}
