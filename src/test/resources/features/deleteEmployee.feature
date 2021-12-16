Feature: Delete Employee Functionality

  Scenario:
    Given Landed to the HRMS login page
    When Entered valid credentials
    And   Clicked on the Login button
    Then Landed on the Dashboard page
    And Verified the Dashboard is Displayed
    Then CLicked on PIM menu
    And Scrolled down  to find employee "Id"
    Then Click on the corresponding check box
    And Press Delete button
    Then Accept or Cancel the alert
    And Verify the Entry Deleted is Displayed

