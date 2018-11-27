package com.hyl.learner.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * 异步功能类
 *
 * @author: jack
 * @date: 2018/11/28 01:22
 */
@Component
public class CommonTask {

    private Logger logger = LoggerFactory.getLogger(CommonTask.class);
    @Async
    public void execute( Task task ,int order){

        logger.info("-------------异步执行开始----------{}",order);
        long start = System.currentTimeMillis();
        task.execute(order);
        logger.info("-------异步执行结束----------{}，{}ms",order,System.currentTimeMillis()-start);
    }
}
