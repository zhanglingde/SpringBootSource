package com.ling.condition;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnProperty(prefix = "condition.prefix",name = "type",havingValue = "person")
public class ConditionConfig {

    @Bean("person1")
    public Person person1(){
        Person person = new Person();
        person.setId("1");
        person.setName("ling");
        return person;
    }

    @Bean(name = "person2")
    @ConditionalOnBean(ConditionProperty.class)
    public Person person2(){
        Person person = new Person();
        person.setId("2");
        person.setName("zhangling");
        return person;
    }

    @Bean(name = "person3")
    @ConditionalOnClass(Person.class)
    public Person person3(){
        Person person = new Person();
        person.setId("3");
        person.setName("person3");
        return person;
    }
}
