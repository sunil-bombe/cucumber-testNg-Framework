package com.webwork.utils;

import java.time.Duration;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationUtils {
  private WebDriver driver;
  public WebDriverWait wait;
  public Wait<WebDriver> fluent;

  public AutomationUtils(WebDriver driver){
    this.driver = driver;
    wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    fluent = new FluentWait<>(driver)
        .withTimeout(Duration.ofSeconds(30))
        .pollingEvery(Duration.ofMillis(500))
        .ignoring(NoSuchElementException.class);
  }

  public void waitUntilELementIsVisible(WebElement element, Integer timeInSeconds){
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
    wait.until(ExpectedConditions.visibilityOf(element));
  }
  public void waitUntilELementIsVisible(WebElement element){
    wait.until(ExpectedConditions.visibilityOf(element));
  }

  public WebElement fluentWaitUntilVisible(WebElement element) {
    return fluent.until(ExpectedConditions.visibilityOf(element));
  }

}
