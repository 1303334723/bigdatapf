package com.behavioranalysis.util;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * 参数工具类
 */
public class ParamUtils {
    /**
     * 从JSON对象中提取参数
     *
     * @param jsonObject JSON对象
     * @param field      参数
     * @return
     */
    public static String getParam(JSONObject jsonObject, String field) {
        JSONArray jsonArray = jsonObject.getJSONArray(field);
        if (jsonArray != null && jsonArray.size() > 0) {
            return jsonArray.getString(0);
        }
        return null;
    }
}
