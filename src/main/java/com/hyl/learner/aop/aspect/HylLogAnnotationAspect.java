package com.hyl.learner.aop.aspect;

import com.hyl.learner.util.GsonUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 切面打印日志
 *
 * @author: jack
 * @ate: 2018/11/8 00:49
 */
@Aspect
@Component
public class HylLogAnnotationAspect {

    Logger logger = LoggerFactory.getLogger(HylLogAnnotationAspect.class);


    @Before("@annotation(com.hyl.learner.aop.annotation.HylLog)")
    public void logAnnotation(JoinPoint joinPoint) {
        try {
            Object[] objects = joinPoint.getArgs();
            logger.info(" 开始前日志：", GsonUtils.gsonString(objects));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
