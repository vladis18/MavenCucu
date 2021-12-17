package com.hrms.stepdefinitions;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.DashboardPage;
import com.hrms.pages.PersonalDetailsPage;
import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelReading;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class AddNewEmployee extends CommonMethods {
  static String fullName;

//    @Given("Go to HRMS")
//    public void go_to_HRMS() {
//       SetUp();
//    }

    @When("I login with valid credentials")
    public void i_login_with_valid_credentials() {
      loginPage.login(ConfigsReader.getPropertyValue("username"),ConfigsReader.getPropertyValue("password"));
      loginPage.clickOnLoginBtn();
    }

    @When("Click on PIM Menu")
    public void click_on_PIM_Menu() {
       dashboardPage.menuPIM.click();
    }

    @When("Click on Add Employee button")
    public void click_on_Add_Employee_button() {
        dashboardPage.addEmployeeBtn.click();
    }

    @Then("Fill out all the necessary fields")
    public void fill_out_all_the_necessary_fields() {
        String firstName,middleName,lastName;
        firstName ="Puffy1";
        lastName="Shmuffy1";
        middleName="Kaduffy1";
       addEmployeePage.firstNameTextBox.sendKeys(firstName);
       addEmployeePage.lastNameTextbox.sendKeys(lastName);
       addEmployeePage.midleNameTextBox.sendKeys(middleName);
       fullName= firstName +" " + middleName+  " " + lastName;
       takeScreenshot("Employee name");
    }

    @Then("Click on the save button")
    public void click_on_the_save_button() {
   addEmployeePage.saveEmployeeBtn.click();
    }

    @Then("Verify that Employee was saved")
    public void verify_that_Employee_was_saved() {
    String actualName =personalDetailsPage.empProfileNameLbl.getText();
    String displayedName = personalDetailsPage.getEmpProfileName();
    //getting an actual value through function
        Assert.assertEquals("Verifying profile name of the new Employee" ,fullName,actualName);
        System.out.println("expected name is " + fullName + " actual name is " + actualName);
    }

    @Then("enter first name {string}, last name {string}")
    public void enter_first_name_last_name(String firstName, String lastName) {
        addEmployeePage.addFirstAndLastName(firstName,lastName);
    }

    @Then("verify {string} is added successfully")
    public void verify_is_added_successfully(String fullName) {
        String actualProfileName= personalDetailsPage.getEmpProfileName();
        Assert.assertEquals("Verifying profile name",fullName,actualProfileName);
    }

    @When("enter {string} , {string} and {string}")
    public void enter_and(String firstName, String middleName, String lastName) {
        addEmployeePage.addFirstMiddleAndLastName(firstName,middleName,lastName);
    }

    @Then("verify {string}, {string} and {string} is added successfully;")
    public void verify_and_is_added_successfully(String firstName, String middleName, String lastName) {
        String fullName= firstName +" " +middleName + " " + lastName;
        String actualProfileName= personalDetailsPage.getEmpProfileName();
        Assert.assertEquals("Verifying profile name",fullName,actualProfileName);
    }
    @When("add multiple employees and verify they were added successfully")
    public void add_multiple_employees_and_verify_they_were_added_successfully(DataTable employees) {
        List<Map<String,String> > employeeNames =employees.asMaps();
        for(Map<String,String> employeeName: employeeNames){
            String firstName=employeeName.get("FirstName");
            String middleName= employeeName.get("MiddleName");
            String lastName= employeeName.get("LastName");
            System.out.println("first name is " + firstName +" mid name is " + middleName + " last name is " + lastName);
            addEmployeePage.addFirstMiddleAndLastName(firstName,middleName,lastName);
            addEmployeePage.clickOnSaveBtn();
            String actualName = personalDetailsPage.getEmpProfileName();
            String expectedName = firstName +" " +middleName + " " + lastName;
            Assert.assertEquals("Verifying added Emplyee",expectedName,actualName);
            dashboardPage.clickOnAddEmployeeBtn();
        }
    }
    @When("add multiple employees from excel {string} sheet and verify they were added successfully")
    public void add_multiple_employees_from_excel_sheet_and_verify_they_were_added_successfully(String sheetName) throws InterruptedException {
       List<Map<String,String>> excelData= ExcelReading.excelIntoListMap(Constants.TESTDATA_FILEPATH,sheetName);
        System.out.println("Sheet name is " + sheetName);
       for (Map<String,String> excelEmpName : excelData){
           String firstName=excelEmpName.get("FirstName");
           String middleName = excelEmpName.get("MiddleName");
           String lastName = excelEmpName.get("LastName");
           //String employeeID = excelEmpName.get("EmployeeID");
           addEmployeePage.addFirstMiddleAndLastName(firstName,middleName,lastName);
          // addEmployeePage.enterEmployeeID(employeeID);
           addEmployeePage.clickOnSaveBtn();
           String actualName = personalDetailsPage.getEmpProfileName();
           String expectedName = firstName +" " +middleName + " " + lastName;
           Assert.assertEquals("Verifying added Employee",expectedName,actualName);
           dashboardPage.clickOnAddEmployeeBtn();
           Thread.sleep(2000);
       }
    }


//    @Then("close the browser")
//    public void close_the_browser() {
//        tearDown();
//    }
}
