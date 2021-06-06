package com.amazon.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigurationReader {

    static Properties properties;

    static {

        try {
            String path = "configuration.properties";
            FileInputStream fileInputStream = null;
            fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String getProperty(String key){
        String value = properties.getProperty(key);
        return value;

    }
}
