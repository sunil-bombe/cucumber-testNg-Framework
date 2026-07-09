package com.webwork.stepdefs;

import com.webwork.utils.TestContextSetup;
import io.cucumber.java.Before;

public class Hooks {

  private TestContextSetup testContextSetup;

  public Hooks(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
  }

  @Before()
  public void beforeScenario() {
    System.out.println("Before scenario");
  }

  @Before()
  public void afterScenario() {
    System.out.println("After scenario");
  }
}
