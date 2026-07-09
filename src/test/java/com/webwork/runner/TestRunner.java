package com.webwork.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.webwork.stepdefs",
       plugin = {"pretty", "html:target/cucumber-reports.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
       "rerun:target/failed_scenarios.txt"},
        monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

  @Override
  @DataProvider(parallel = true)
  public Object[][] scenarios(){
    return super.scenarios();
  }

}
