package com.ling.test01.config;


import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(AnimalImportSelector.class)
public @interface EnableAnimal {
}
