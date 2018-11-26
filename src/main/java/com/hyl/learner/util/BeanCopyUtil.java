package com.hyl.learner.util;

import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: jack
 * @date: 2018/11/12 02:49
 */
public class BeanCopyUtil {

    public static Object bo2Do( Object source ,Class<?> cls){
        Object result = null;
        try {
            result = source.getClass().getClassLoader().loadClass(cls.getName()).newInstance();
            BeanUtils.copyProperties(source,result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public static List boList2DoList(List source,Class<?>cls){
        return (List) source.stream().map(input->BeanCopyUtil.bo2Do(input,cls)).collect(Collectors.toList());
    }

}
