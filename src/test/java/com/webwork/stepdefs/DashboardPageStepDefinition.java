package com.webwork.stepdefs;

import com.webwork.context.TestContextSetup;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DashboardPageStepDefinition {

  private TestContextSetup testContextSetup;

  public DashboardPageStepDefinition(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
  }

  @Then("I should be redirected to the dashboard")
  public void i_should_be_redirected_to_the_dashboard() {
    Assert.assertTrue(
        testContextSetup.pageObjectManager.getDashboardPage().verifyUserIsLandedOnDashboardPage());
  }

  @Then("I should see a welcome message")
  public void i_should_see_a_welcome_message() {
    Assert.assertTrue(
        testContextSetup.pageObjectManager.getDashboardPage().verifyTheWelcomeMessage());
  }
}
