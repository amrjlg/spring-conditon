package com.jiang.condition;

import com.jiang.beans.Cat;
import com.jiang.property.DefaultProperties;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jiang
 * @date 2019/5/30
 * @time 10:05
 */

public class SpringConditionTest {

    @Test
    public void test() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.jiang");

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("-----------------");
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
        Cat cat = applicationContext.getBean(Cat.class);
        System.out.println(cat);
        DefaultProperties properties = applicationContext.getBean(DefaultProperties.class);
        System.out.println(properties);
    }
}