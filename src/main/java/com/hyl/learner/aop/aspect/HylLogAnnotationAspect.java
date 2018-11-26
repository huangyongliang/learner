package com.hyl.learner.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author: jack
 * @ate: 2018/11/8 00:49
 */
@Aspect
@Component
public class HylLogAnnotationAspect {

    @Before("@annotation(com.hyl.learner.aop.annotation.HylLog)")
    public void logAnnotation(JoinPoint joinPoint){
        try {
            Object[] objects = joinPoint.getArgs();
            System.out.print(new Date().toString()+" 开始前日志："+ objects.toString() );
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
