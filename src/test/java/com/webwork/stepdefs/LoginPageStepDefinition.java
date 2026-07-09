package com.webwork.stepdefs;

import com.webwork.context.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDefinition {

  private TestContextSetup testContextSetup;

  public LoginPageStepDefinition(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
  }

  @Given("I am on the login page")
  public void i_am_on_the_login_page() {
    Assert.assertTrue(testContextSetup.pageObjectManager.getLoginPage().verifyUserIsOnLoginPage());
  }

  @When("I enter valid credentials")
  public void i_enter_valid_credentials() {
    testContextSetup.pageObjectManager.getLoginPage().enterUsernameAndPassword("Admin", "admin123");
  }

  @When("I click the login button")
  public void i_click_the_login_button() {
    testContextSetup.pageObjectManager.getLoginPage().clickOnSubmitButton();
    System.out.println("I click the login button");
  }

  @When("I enter invalid credentials")
  public void i_enter_invalid_credentials() {
    testContextSetup.pageObjectManager.getLoginPage()
        .enterUsernameAndPassword("Ganesh", "Ganesh123");
  }

  @Then("I should see an error message indicating invalid login")
  public void i_should_see_an_error_message_indicating_invalid_login() {
    System.out.println("I should see an error message indicating invalid login");
  }


}
