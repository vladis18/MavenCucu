Feature:

  Scenario: Log in log out
    Given Nagivage to HRMS
    When I log in
    And See the result
    Then I have to log out