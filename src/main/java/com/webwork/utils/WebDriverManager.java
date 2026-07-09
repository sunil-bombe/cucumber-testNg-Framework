package com.webwork.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

  private WebDriver driver;

  public WebDriverManager() {
    }

    WebDriver getWebDriver() throws FileNotFoundException {
    if(driver == null) {
      driver = new ChromeDriver();
      }
      return driver;
    }

  }
