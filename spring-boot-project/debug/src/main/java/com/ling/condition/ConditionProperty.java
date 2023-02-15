package com.ling.condition;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "conditon.prefix")
public class ConditionProperty {

    private String username;
    private String password;
}
