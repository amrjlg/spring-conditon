package io.github.amrjlg.spring.condition.annotation;

import io.github.amrjlg.spring.condition.processor.ConditionOnBeanMissProcessor;
import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author amrjlg
 * 2019/5/30
 * 10:06
 */

@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(ConditionOnBeanMissProcessor.class)
public @interface ConditionOnBeanMiss {

}
