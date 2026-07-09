package com.webwork.utils;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class GenericUtils {

  private WebDriver driver;

  public GenericUtils(WebDriver driver){
    this.driver = driver;
  }

  public void switchWindowToChild(){
  Set<String> windowSet = driver.getWindowHandles();
    Iterator<String> iterator = windowSet.iterator();
    String parentWindow = iterator.next();
    String childWindow = iterator.next();
    driver.switchTo().window(childWindow);
  }
}
