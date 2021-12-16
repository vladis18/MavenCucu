Feature: Search Emloyee

  Background:
    When I login with valid credentials
    And Verify Dashboard Page is Displayed
    Then Click on PIM Menu
@SearchParameter
Scenario: Search by ID

  And Enter Employee ID "18874"
  Then Click on Search Button
  And Verify the Employee with "18874" ID   is Displayed

  @SearchExamples
  Scenario Outline:
    When I enter my search criteria "<ID>"
    And Click on Search Button
    Then I Verify the Employee  with "<ID>" ID is Displayed;

    Examples:
    |ID   |
    |18859|
    |18874|
    |18906A|
