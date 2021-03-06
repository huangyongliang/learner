package com.hyl.learner.Chain;

/**
 * @author: jack
 * @date: 2019/2/13 00:38
 */
public class MyHandler extends AbstractHandler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println("name:" + name);
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
