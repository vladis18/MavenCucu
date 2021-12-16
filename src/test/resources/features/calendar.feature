Feature: Calendar Leave feature

Scenario:Select calendar leave dates for  IT Support
Given I navigate on HRMS Dashboard
When click on Leave
And click on Leave list
Then choose From date from the Calendar
And choose To date from the Calendar
Then click only on Canceled and Rejected checkboxes
And uncheck Pending Approval
Then select It support form Drop Down
And click on the Search button
Then Quit the browser