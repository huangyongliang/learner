package com.hyl.learner.util;

import com.hyl.learner.util.bean.ClassA;
import com.hyl.learner.util.bean.ClassB;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: jack
 * @date: 2018/11/12 02:57
 */
public class TestRun {

    public static void main(String []args){

        ClassA a  = new ClassA();
        a.setValue("hyl");

//        ClassB b = (ClassB) BeanCopyUtil.bo2Do(a,ClassB.class);
//        System.out.println(b.toString());

        List<ClassA> lista = new ArrayList<>();
        lista.add(a);

        List b = BeanCopyUtil.boList2DoList(lista, ClassB.class);
        System.out.print(b.toString());


    }

}
