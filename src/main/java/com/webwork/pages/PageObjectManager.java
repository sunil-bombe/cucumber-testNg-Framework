package com.webwork.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

  private WebDriver driver;
  private LoginPage loginPage;

  public PageObjectManager(WebDriver driver){
    this.driver = driver;
  }

  public LoginPage getLoginPage(){
    loginPage = new LoginPage(driver);
    return loginPage;
  }
}
