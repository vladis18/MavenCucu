Feature:  Dashboard tab Functionality
  @dashboardTabs
  Scenario: Dashboard Tab verification
    When enter valid credentials
    And click on login button
    Then verify dashboard is displayed
    Then verify the following tabs are on the dashboard
    |Admin|PIM|Leave|Time|Recruitment|Performance|Dashboard|Directory|