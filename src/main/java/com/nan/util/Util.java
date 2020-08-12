package com.nan.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class Util {
    public static String mapToJson(Map map){
        JSONObject json = new JSONObject(map);
        String string = json.toJSONString();
        return string;
    }

    public static String javaBeanToJson(Object obj){
        String s = JSON.toJSONString(obj);
        return s;
    }

}
