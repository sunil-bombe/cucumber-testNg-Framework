package com.webwork.stepdefs;

import com.webwork.constants.GlobalConstants;
import com.webwork.context.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import java.io.IOException;

public class Hooks {

  private TestContextSetup testContextSetup;

  public Hooks(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
  }

  @Before()
  public void beforeScenario() throws IOException {
    var url = testContextSetup.propertyFileUtils.getPropertyValue(GlobalConstants.GLOBAL_CONFIG_PROPERTIES_FILE_NAME, GlobalConstants.BROWSER_NAME_KEY);
    testContextSetup.webDriverManager.getWebDriver().get("https://opensource-demo.orangehrmlive.com");
  }

  @After()
  public void afterScenario() {
    testContextSetup.webDriverManager.quitDriver();
  }
}
