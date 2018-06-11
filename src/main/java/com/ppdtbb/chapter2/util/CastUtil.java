package com.ppdtbb.chapter2.util;

import org.apache.commons.lang3.StringUtils;

/**
 * 转型操作工具类
 */
public class CastUtil {

    /**
     * 转为String类型
     */
    public static String castString(Object obj) {
        return castString(obj, "");
    }

    /**
     * 转为String类型，提供默认值
     */
    public static String castString(Object obj, String defaultValue) {
        return null!=obj ? String.valueOf(obj) : defaultValue;
    }

    /**
     * 转为Double类型
     */
    public static double castDouble(Object obj) {

    }

    /**
     * 转为Double类型，提供默认值
     */
    public static double castDouble(Object obj, double defaultValue) {
        double result = defaultValue;

        return result;
    }

}
