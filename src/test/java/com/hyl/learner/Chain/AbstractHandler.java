package com.hyl.learner.Chain;

/**
 * @author: jack
 * @date: 2019/2/13 00:23
 */
public abstract class AbstractHandler implements Handler {

    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

}
