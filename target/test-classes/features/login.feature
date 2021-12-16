Feature: Login Functionality

  @validLogin
  Scenario: Login with valid credentials
    Given navigate to HRMS login page
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    And quit the browser

@invalidLogin
    Scenario: Login with invalid credentials
      Given navigate to HRMS login page
      When enter invalid credentials
      And click on login button
      Then verify error message
      And quit the browser


