Feature:Add the Employee


  Scenario : Add new Employee

    Given navigate to the HRMS login page
    When enter all valid credentials
    And click on the login button
    Then I land on the dashboard page and verify dashboard is displayed
    And click on the PIM menu and land on viewEmployeeList page
    Then I click on the add button And land on addEmployee page
    Then I fill out all necessary fields
    And click save the button
    Then I land on the viewPersonalDetails page and verify that employee's name
    And quit my browser
