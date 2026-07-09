package com.webwork.utils;

import com.webwork.constants.GlobalConstants;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

  private WebDriver driver;

  private PropertyFileUtils propertyFileUtils;

  public WebDriverManager(PropertyFileUtils propertyFileUtils) throws IOException {
    this.propertyFileUtils = propertyFileUtils;
  }

  public WebDriver getWebDriver() throws IOException {
    if (driver == null) {
      var browser = propertyFileUtils.getPropertyValue(GlobalConstants.GLOBAL_CONFIG_PROPERTIES_FILE_NAME, GlobalConstants.BROWSER_NAME_KEY);
      switch (browser) {
        case "chrome":
          driver = new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
          break;
        default:
          throw new IllegalArgumentException("Browser not supported: " + browser);
      }
    }
    return driver;
  }

  public void quitDriver() {
    if (driver != null) {
      driver.quit();
      driver = null;
    }
  }

}
