package com.hyl.learner.aop.annotation;

import org.springframework.core.annotation.Order;

import java.lang.annotation.*;

/**
 * 日志注解
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Order(1)
public @interface HylLog {
    /**
     * 之前日志
     * @return
     */
    String beforeMsg() default "";

    /**
     * 之后日志
     * @return
     */
    String afterMsg() default "";
}
