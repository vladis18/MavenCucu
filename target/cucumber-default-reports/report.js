$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/addNewEmployee.feature");
formatter.feature({
  "name": "Add Employee Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login with valid credentials",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddNewEmployee.i_login_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on PIM Menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddNewEmployee.click_on_PIM_Menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Add Employee button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddNewEmployee.click_on_Add_Employee_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Adding multiple employees at one execution",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@dtWithHeader"
    }
  ]
});
formatter.step({
  "name": "add multiple employees and verify they were added successfully",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.stepdefinitions.AddNewEmployee.add_multiple_employees_and_verify_they_were_added_successfully(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});