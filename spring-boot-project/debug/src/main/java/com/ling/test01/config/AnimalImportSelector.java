package com.ling.test01.config;

import com.ling.test01.bean.Cat;
import com.ling.test01.bean.Dog;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class AnimalImportSelector implements ImportSelector {

    /**
     * 返回需要注入容器的 Bean 数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{
                Cat.class.getName(), Dog.class.getName()
        };
    }
}
