package com.webwork.pages;

import com.webwork.constants.GlobalConstants;
import com.webwork.utils.UtilsManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

  private WebDriver driver;
  private UtilsManager utilsManager;
  private static final By pageTitle = By.xpath("//div[@class='oxd-topbar-header-title']//h6");

  public DashboardPage(WebDriver driver, UtilsManager utilsManager) {
  this.driver = driver;
  this.utilsManager = utilsManager;
  }

  public boolean verifyUserIsLandedOnDashboardPage() {
    return driver.getCurrentUrl().equals(GlobalConstants.DASHBOARDPAGE_URL);
  }

  public boolean verifyTheWelcomeMessage() {
    return driver.findElement(pageTitle).getText().equalsIgnoreCase("dashboard");
  }
}
