package com.hyl.learner.service.impl;

import com.hyl.learner.async.CommonTask;
import com.hyl.learner.service.TaskService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

/**
 * @author: jack
 * @date: 2018/11/28 01:21
 */
@Service
public class TaskServiceImpl implements TaskService {

    private Logger logger = LoggerFactory.getLogger(TaskServiceImpl.class);

    @Autowired
    private CommonTask commonTask;

    @Override
    public void addTask() {

        IntStream.range(0,10).forEach(index->{
            commonTask.execute(order->{
                logger.info("异步参数：{}",order);
                try {
                    Thread.sleep(500);
                }catch (Exception e){
                }
            },index);
        });
    }
}
