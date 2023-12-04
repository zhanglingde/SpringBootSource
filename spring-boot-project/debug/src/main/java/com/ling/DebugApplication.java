package com.ling;

import cn.hutool.extra.spring.SpringUtil;
import com.ling.condition.Person;
import com.ling.test01.bean.Cat;
import com.ling.test01.config.AnimalImportSelector;
import com.ling.test01.config.EnableAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;

/**
 * @SpringBootApplication 注解中组合了 @SpringBootConfiguration 、 @EnableAutoConfiguration 和 @ComponentScan
 */
@SpringBootApplication
@EnableAnimal
// @Import(AnimalImportSelector.class)
public class DebugApplication {


    public static void main(String[] args) {
        SpringApplication.run(DebugApplication.class, args);
		// Cat bean = SpringUtil.getBean(Cat.class);
		// System.out.println("bean = " + bean);
	}

}
