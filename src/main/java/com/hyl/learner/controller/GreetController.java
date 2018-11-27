package com.hyl.learner.controller;

import com.hyl.learner.aop.annotation.HylLog;
import com.hyl.learner.bean.DoorWord;
import com.hyl.learner.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jack
 * @date: 2018/11/1 01:42
 */
@RestController
@RequestMapping(path = "/greet")
public class GreetController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/door")
    @HylLog
    public DoorWord door(){

        return DoorWord.builder().code("666").value("OPEN").msg("开门啦").build();
    }

    @GetMapping("/window")
    @HylLog
    public String window(){
        return "no window for you";
    }

    @GetMapping("/task")
    @HylLog
    public void task(){
        taskService.addTask();
    }


}
