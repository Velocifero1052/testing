package com.example.testing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "some")
public class SomeConfig {
    public String someName = "someName";
    public Integer someValue = 123;
}
