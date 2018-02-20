package edu.zisu.phoneMall.utils;

import com.alibaba.fastjson.JSON;

public class JsonUtils {
    
    private JsonUtils() {
    }

    /**
     * 将javaBean转换成JSON对象
     *
     * @param paramObject
     *            需要解析的对象
     */
    public static String toString(Object paramObject) {
        String json = JSON.toJSONString(paramObject);
        return json;
    }
}
