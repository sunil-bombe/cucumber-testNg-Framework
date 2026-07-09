package com.webwork.utils;

import com.webwork.constants.GlobalConstants;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtils {

  public PropertyFileUtils() {

  }

  public String getPropertyValue(String fileName, String propertyName)
      throws IOException {
    String filePath = GlobalConstants.GLOBAL_PROPERTY_FILE_PATH + fileName;
    FileInputStream fileInputStream = new FileInputStream(filePath);
    Properties properties = new Properties();
    properties.load(fileInputStream);
    return properties.getProperty(propertyName);
  }
}
