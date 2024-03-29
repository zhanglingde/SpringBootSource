package com.ling.condition;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
public class Person {

    private String id;
    private String name;
    private Integer age;
}
