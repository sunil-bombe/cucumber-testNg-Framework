package com.webwork.pages;

import com.webwork.utils.UtilsManager;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {

  private WebDriver driver;
  private LoginPage loginPage;
  private DashboardPage dashboardPage;
  private UtilsManager utilsManager;

  public PageObjectManager(WebDriver driver, UtilsManager utilsManager) {
    this.driver = driver;
    this.utilsManager = utilsManager;
  }

  public LoginPage getLoginPage() {
    loginPage = new LoginPage(driver,utilsManager);
    return loginPage;
  }

  public DashboardPage getDashboardPage() {
    dashboardPage = new DashboardPage(driver,utilsManager);
    return dashboardPage;
  }
}
