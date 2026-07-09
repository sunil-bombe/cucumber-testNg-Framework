Feature: Login Feature
  Validate the login functionality of the application

  @smoke
  Scenario: Successful login with valid credentials
    Given I am on the login page
    When I enter valid credentials
    And I click the login button
    Then I should be redirected to the dashboard
    And I should see a welcome message

  @regression
  Scenario: Unsuccessful login with invalid credentials
    Given I am on the login page
    When I enter invalid credentials
    And I click the login button
    Then I should see an error message indicating invalid login