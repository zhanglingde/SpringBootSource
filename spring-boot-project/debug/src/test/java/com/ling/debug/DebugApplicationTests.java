package com.ling.debug;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import com.ling.condition.Person;
import com.ling.profileconfig.Student;
import org.junit.jupiter.api.Test;
import org.slf4j.ILoggerFactory;
import org.slf4j.Marker;
import org.slf4j.impl.StaticLoggerBinder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogFile;
import org.springframework.boot.logging.LoggingInitializationContext;
import org.springframework.boot.logging.LoggingSystem;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.ConversionService;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;

@SpringBootTest
class DebugApplicationTests {

    @Resource(name = "person1")
    Person person1;
    @Resource(name = "person2")
    Person person2;
    @Resource(name = "person3")
    Person person3;
    @Resource
    Student student;

	@Autowired
	ConversionService conversionService;


    @Test
    void contextLoads() {
        System.out.println("person1 = " + person1);
        System.out.println("person2 = " + person2);
        System.out.println("person3 = " + person3);
    }

    // 配置文件加载
    @Test
    void profileConfig(){
        System.out.println("student = " + student);
    }

	@Test
	public void test001(){
		ArrayList convert = conversionService.convert("a,1,2,3,b,c", ArrayList.class);
		System.out.println();
	}

}
