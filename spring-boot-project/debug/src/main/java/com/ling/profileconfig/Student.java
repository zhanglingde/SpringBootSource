package com.ling.profileconfig;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "student")
public class Student {
    private String id;
    private String name;
    private Integer age;
}
