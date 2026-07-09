package com.webwork.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {

  private static final String GLOBAL_PROPERTY_FILE_PATH =
      System.getProperty("user.dir") + "/src/test/resources/config/";
  private String filePath;
  Properties properties;

  public PropertyFileUtils(String fileName) throws IOException {
    this.filePath = GLOBAL_PROPERTY_FILE_PATH + fileName;
    FileInputStream fileInputStream = new FileInputStream(filePath);
    properties = new Properties();
    properties.load(fileInputStream);
  }

  public String getPropertyFilePath() {
    return this.filePath;
  }

  public String getPropertyValueByName(String propertyName) {
    return properties.getProperty(propertyName);
  }

}
