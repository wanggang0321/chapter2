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

        return castDouble(obj, 0);
    }

    /**
     * 转为Double类型，提供默认值
     */
    public static double castDouble(Object obj, double defaultValue) {
        double doubleValue = defaultValue;
        if(null!=obj) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                try {
                    doubleValue = Double.parseDouble(strValue);
                } catch (NumberFormatException e) {
                    doubleValue = defaultValue;
                }
            }
        }
        return doubleValue;
    }

    /**
     * 转为long型
     */
    public static long castLong(Object obj) {
        return castLong(obj, 0);
    }

    /**
     * 转为long型（提供默认值）
     */
    public static long castLong(Object obj, long defaultValue) {
        long longValue = defaultValue;
        if(null!=obj) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                try {
                    longValue = Long.parseLong(strValue);
                } catch (NumberFormatException e) {
                    longValue = defaultValue;
                }
            }
        }
        return longValue;
    }

    /**
     * 转为int型
     */
    public static int castInt(Object obj) {
        return castInt(obj, 0);
    }

    /**
     * 转为int型（提供默认值）
     */
    public static int castInt(Object obj, int defaultValue) {
        int intValue = defaultValue;
        if(null!=obj) {
            String strValue = castString(obj);
            if(StringUtil.isNotEmpty(strValue)) {
                try {
                    intValue = Integer.parseInt(strValue);
                } catch (NumberFormatException e) {
                    intValue = defaultValue;
                }
            }
        }
        return intValue;
    }

    /**
     * 转为boolean型
     */
    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    /**
     * 转为boolean型（提供默认值）
     */
    public static boolean castBoolean(Object obj, boolean defaultValue) {
        boolean booleanValue = defaultValue;
        if(null!=obj) {
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)) {
                booleanValue = Boolean.parseBoolean(strValue);
            }
        }
        return booleanValue;
    }

}
