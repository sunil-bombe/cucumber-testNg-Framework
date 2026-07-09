package com.webwork.pages;

import com.webwork.utils.UtilsManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

  private WebDriver driver;
  private UtilsManager utilsManager;

  private static final By username = By.xpath("//input[@name='username']");
  private static final By password = By.xpath("//input[@name='password']");
  private static final By submitButton = By.xpath("//button[@type='submit']");

  LoginPage(WebDriver driver, UtilsManager utilsManager) {
    this.driver = driver;
    this.utilsManager = utilsManager;
  }

  public boolean verifyUserIsOnLoginPage() {
    boolean flag = false;
    if (driver.findElement(username).isDisplayed() && driver.findElement(password).isDisplayed()
        && driver.findElement(submitButton).isDisplayed()) {
      flag = true;
    }
    return flag;
  }

  public void enterUsernameAndPassword(String username, String password) {
    driver.findElement(this.username).sendKeys(username);
    driver.findElement(this.password).sendKeys(password);
  }

  public void clickOnSubmitButton() {
    driver.findElement(submitButton).click();
  }
}
