Feature:  Configure PIM - Optional Fields
  @pim
  Scenario:  Unchecking unnecessary check boxes
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    And click on PIM Menu
    When click on Configuration drop down menu
    And click on Optional fields
    And click on Edit button
    And uncheck unnecessary checkboxes
    |Show SSN field in Personal Details|
    |Show SIN field in Personal Details|
    And click on Save btn
