package com.webwork.stepdefs;

import com.webwork.context.TestContextSetup;
import com.webwork.pages.DashboardPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class DashboardPageStepDefinition {

  private TestContextSetup testContextSetup;
  private DashboardPage dashboardPage;

  public DashboardPageStepDefinition(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
    this.dashboardPage = this.testContextSetup.pageObjectManager.getDashboardPage();
  }

  @Then("I should be redirected to the dashboard")
  public void i_should_be_redirected_to_the_dashboard() {
    Assert.assertTrue(
        dashboardPage.verifyUserIsLandedOnDashboardPage());
  }

  @Then("I should see a welcome message")
  public void i_should_see_a_welcome_message() {
    Assert.assertTrue(
        dashboardPage.verifyTheWelcomeMessage());
  }
}
