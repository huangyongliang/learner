package com.hyl.learner.util;

import com.google.gson.Gson;

/**
 * @author: jack
 * @date: 2018/11/28 01:48
 */
public class GsonUtils {

    private static Gson gson ;

    static {
            gson = new Gson();

    }

    private GsonUtils(){ }

    public static String gsonString(Object object){
        return gson.toJson(object);
    }
}
