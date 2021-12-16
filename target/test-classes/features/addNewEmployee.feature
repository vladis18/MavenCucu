Feature: Add Employee Functionality

  Background:
    When I login with valid credentials
    And Click on PIM Menu
    And Click on Add Employee button
#    Then Fill out all the necessary fields

  @AddEmployee
  Scenario:Add employee
#    Given Go to HRMS
    And Click on the save button
    Then Verify that Employee was saved
#    And close the browser

  @AddEmployeeWithLoginDetails
  Scenario: Add employee with login details
    Then click on login details checkbox
    Then enter login details
    And Click on the save button
    Then Verify that Employee was saved

    @parameter
    Scenario: Add Employee without login detail and without middle name
      Then enter first name "Agatha", last name "Christie"
      And Click on the save button
      Then verify "Agatha Christie" is added successfully

      @examples
      Scenario Outline:
        When enter "<FirstName>" , "<MiddleName>" and "<LastName>"
        And Click on the save button
        Then verify "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully;

        Examples:
        |FirstName|MiddleName|LastName |
        |Agnia    |Barto     |Bartunyan|
        |Mark     |Twain     |Pisatelev|

        @dtWithHeader
        Scenario: Adding multiple employees at one execution
        When add multiple employees and verify they were added successfully
          |FirstName |MiddleName             |LastName  |
          |Axl       |Alexeyevich            |Rose      |
          |Marik     |Aleksandrovich         |Durimarik |
          |Osama     |Huseinovich            |Obama     |

          @excelTask
      Scenario: Adding multiple employees from excel
        When add multiple employees from excel "EmpNames" sheet and verify they were added successfully