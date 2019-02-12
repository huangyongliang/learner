package com.hyl.learner.Chain;

import org.junit.Test;

/**
 * @author: jack
 * @date: 2019/2/13 00:41
 */
public class HandlerTest {

    @Test
    public void test() {
        MyHandler handler1 = new MyHandler("A");
        MyHandler handler2 = new MyHandler("B");
        MyHandler handler3 = new MyHandler("C");

        handler1.setHandler(handler2);
        handler2.setHandler(handler3);

        handler1.operator();
        System.out.println("--------------------A---------------");
        handler2.operator();
        System.out.println("---------------------B--------------");
        handler3.operator();
        System.out.println("----------------------C-------------");
    }
}
