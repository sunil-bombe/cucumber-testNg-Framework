package com.webwork.stepdefs;

import com.webwork.context.TestContextSetup;
import com.webwork.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDefinition {

  private TestContextSetup testContextSetup;

  private LoginPage loginPage;

  public LoginPageStepDefinition(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
    this.loginPage = this.testContextSetup.pageObjectManager.getLoginPage();
  }

  @Given("I am on the login page")
  public void i_am_on_the_login_page() {
    Assert.assertTrue(this.loginPage.verifyUserIsOnLoginPage());
  }

  @When("I enter valid credentials")
  public void i_enter_valid_credentials() {
    this.loginPage.enterUsernameAndPassword("Admin", "admin123");
  }

  @When("I click the login button")
  public void i_click_the_login_button() {
    this.loginPage.clickOnSubmitButton();
    System.out.println("I click the login button");
  }

  @When("I enter invalid credentials")
  public void i_enter_invalid_credentials() {
    this.loginPage.enterUsernameAndPassword("Ganesh", "Ganesh123");
  }

  @Then("I should see an error message indicating invalid login")
  public void i_should_see_an_error_message_indicating_invalid_login() {
     Assert.assertTrue(false);
  }


}
