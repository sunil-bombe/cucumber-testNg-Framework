package com.webwork.utils;

import org.openqa.selenium.WebDriver;

public class UtilsManager {

  private AutomationUtils automationUtils;
  private PropertyFileUtils propertyFileUtils;
  private GenericUtils genericUtils;
  private WebDriver driver;

  public UtilsManager(WebDriver driver) {
    this.driver = driver;
  }

  public AutomationUtils getAutomationUtils() {
    if (this.automationUtils == null) {
      this.automationUtils = new AutomationUtils(driver);
    }
    return this.automationUtils;
  }

  public PropertyFileUtils getPropertyFileUtils() {
    if (this.propertyFileUtils == null) {
      this.propertyFileUtils = new PropertyFileUtils();
    }
    return this.propertyFileUtils;
  }

  public GenericUtils getGenericUtils() {
    if (this.genericUtils == null) {
      this.genericUtils = new GenericUtils(driver);
    }
    return this.genericUtils;
  }
}
