package com.webwork.stepdefs;

import com.webwork.utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefinition {

  private TestContextSetup testContextSetup;

  public LoginPageStepDefinition(TestContextSetup testContextSetup) {
    this.testContextSetup = testContextSetup;
  }

  @Given("I am on the login page")
  public void i_am_on_the_login_page() {
    System.out.println("I am on the login page");
  }

  @When("I enter valid credentials")
  public void i_enter_valid_credentials() {
    System.out.println("I enter valid credentials");
  }

  @When("I click the login button")
  public void i_click_the_login_button() {
    System.out.println("I click the login button");
  }

  @Then("I should be redirected to the dashboard")
  public void i_should_be_redirected_to_the_dashboard() {
    System.out.println("I should be redirected to the dashboard");
  }

  @Then("I should see a welcome message")
  public void i_should_see_a_welcome_message() {
    System.out.println("I should see a welcome message");
  }

  @When("I enter invalid credentials")
  public void i_enter_invalid_credentials() {
    System.out.println("I enter invalid credentials");
  }

  @Then("I should see an error message indicating invalid login")
  public void i_should_see_an_error_message_indicating_invalid_login() {
    System.out.println("I should see an error message indicating invalid login");
  }


}
