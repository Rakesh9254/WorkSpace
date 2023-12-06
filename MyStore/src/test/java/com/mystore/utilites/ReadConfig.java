package com.mystore.utilites;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
    Properties properties;
    String path = "/Users/rakesh9254/Desktop/WorkSpaceSelenium/MyStore/configuration/Config.properties";

    public ReadConfig() {
        try {
            properties = new Properties();
            FileInputStream file = new FileInputStream(path);
            properties.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getBaseUrl() {
        String value = properties.getProperty("baseUrl");
        if (value != null) {
            return value;
        } else {
            throw new RuntimeException("URL is not configured in the properties file");
        }
    }

    public String getBrowser() {
        String value = properties.getProperty("browser");
        if (value != null) {
            return value;
        } else {
            throw new RuntimeException("Browser is not configured in the properties file");
        }
    }

	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
}
