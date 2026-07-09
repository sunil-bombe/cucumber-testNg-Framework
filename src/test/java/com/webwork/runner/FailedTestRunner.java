package com.webwork.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
    features = "@target/failed_scenarios.txt",
    glue = "com.webwork.stepdefs",
    plugin = {"pretty", "html:target/cucumber-reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
    monochrome = true
)
public class FailedTestRunner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios(){
    return super.scenarios();
  }
}
