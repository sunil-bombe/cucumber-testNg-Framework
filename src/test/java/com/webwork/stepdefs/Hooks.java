package com.webwork.stepdefs;

import com.aventstack.extentreports.reporter.FileUtil;
import com.webwork.constants.GlobalConstants;
import com.webwork.context.TestContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

  private TestContextSetup testContextSetup;

  public Hooks(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
  }

  @Before
  public void beforeScenario() throws IOException {
    var url = testContextSetup.propertyFileUtils.getPropertyValue(GlobalConstants.GLOBAL_CONFIG_PROPERTIES_FILE_NAME, GlobalConstants.BROWSER_NAME_KEY);
    testContextSetup.webDriverManager.getWebDriver().get("https://opensource-demo.orangehrmlive.com");
  }

  @After
  public void afterScenario() {
    testContextSetup.webDriverManager.quitDriver();
  }

  @AfterStep
  public void afterStepMethod(Scenario scenario) throws IOException {
    WebDriver driver = testContextSetup.webDriverManager.getWebDriver();
    if(scenario.isFailed()){
      File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      byte[] fileContent = FileUtils.readFileToByteArray(sourcePath);
      scenario.attach(fileContent, "image/png", "image");
    }
  }
}
