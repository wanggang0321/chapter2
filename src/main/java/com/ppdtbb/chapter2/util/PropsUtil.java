package com.ppdtbb.chapter2.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具类
 */
public final class PropsUtil {

    private static final Logger logger = LoggerFactory.getLogger(PropsUtil.class);

    /**
     * 加载属性文件
     */
    public static Properties loadProps(String fileName) {
        Properties props = null;
        InputStream is = null;
        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
            if(null==is) {
                throw new FileNotFoundException(fileName + " is not Exist!");
            }

            props = new Properties();
            props.load(is);
        } catch (Exception e) {
            logger.error("Load properties file failure.", e);
        } finally {
            if(is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    logger.error("Close input stream failure.", e);
                }
            }
        }
        return props;
    }

    /**
     * 获取字符型属性（默认值为空字符串）
     */
    public static String getStringValue(Properties props, String key) {

        return getStringValue(props, key, "");
    }

    /**
     * 获取字符型属性（可指定默认值）
     */
    public static String getStringValue(Properties props, String key, String defaultValue) {

        String value = defaultValue;
        if(props.containsKey(key)) {
            value = props.getProperty(key);
        }
        return value;
    }

}
