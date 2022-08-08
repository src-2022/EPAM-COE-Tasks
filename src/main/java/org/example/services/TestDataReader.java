package org.example.services;

import java.util.ResourceBundle;

public class TestDataReader {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(System.getProperty("env"));

    public static String getTestData(String key){
        return resourceBundle.getString(key);
    }
}
