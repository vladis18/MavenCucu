package com.hrms.stepdefinitions;

import com.hrms.pages.AddEmployeePage;
import com.hrms.pages.EmployeeListPage;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SearchEmployee extends CommonMethods {

    @When("Verify Dashboard Page is Displayed")
    public void verify_Dashboard_Page_is_Displayed() {
        boolean welcomeMsg  = dashboardPage.welcomeMessage.getText().contains("Welcome");
        System.out.println("welcome boolean value is " + welcomeMsg);
        System.out.println("text message is " + dashboardPage.welcomeMessage.getText());
        System.out.println("is displayed " + dashboardPage.welcomeMessage.isDisplayed());
       Assert.assertTrue("Verify the welcome message" ,dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }

    @Then("Enter Employee ID {string}")
    public void enter_Employee_ID(String empID) {
        //AddEmployeePage.sendText(addEmployeePage.empIDTextbox, "18874");
        employeeListPage.sendText(employeeListPage.employeeIDtxt, empID);

    }

    @Then("Click on Search Button")
    public void click_on_Search_Button() {
        employeeListPage.searchBtn.click();
    }

    @Then("Verify the Employee with {string} ID   is Displayed")
    public void verify_the_Employee_with_ID_is_Displayed(String empID) {
       //String empIDexpected = employeeListPage.employeeIDtxt.getText();
       String empIDActual= employeeListPage.empIDrecordValue.getText();
       Assert.assertEquals("Verifying the Employee ID",empID,empIDActual);
    }

    @When("I enter my search criteria {string}")
    public void i_enter_my_search_criteria(String empID) {
       employeeListPage.employeeIDtxt.sendKeys(empID);

    }

    @Then("I Verify the Employee  with {string} ID is Displayed;")
    public void i_Verify_the_Employee_with_ID_is_Displayed(String empID) {
        String actualID =employeeListPage.empIDrecordValue.getText();
        Assert.assertEquals("Verifying ID" , empID,actualID);


    }


}
