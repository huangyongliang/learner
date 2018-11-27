package com.hyl.learner.async;

/**
 * 异步操作
 *
 * @author: jack
 * @date: 2018/11/28 02:00
 */
@FunctionalInterface
public interface Task {
    void execute(int order);
}
