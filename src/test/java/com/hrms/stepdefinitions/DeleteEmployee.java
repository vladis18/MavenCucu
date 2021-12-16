package com.hrms.stepdefinitions;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DeleteEmployee extends CommonMethods {
    WebElement chkBox;
    String newRowValue;
    String rowText;
    @Given("Landed to the HRMS login page")
    public void landed_to_the_HRMS_login_page() {
        BaseClass.SetUp();

       // throw new io.cucumber.java.PendingException();
    }

    @When("Entered valid credentials")
    public void entered_valid_credentials() {
       loginPage.login(ConfigsReader.getPropertyValue("username"),ConfigsReader.getPropertyValue("password" ));

    }

    @When("Clicked on the Login button")
    public void clicked_on_the_Login_button() {
        loginPage.clickOnLoginBtn();
    }

    @Then("Landed on the Dashboard page")
    public void landed_on_the_Dashboard_page() {
        System.out.println("I landed on " + driver.getTitle());
    }

    @Then("Verified the Dashboard is Displayed")
    public void verified_the_Dashboard_is_Displayed() {
        boolean welcomeMsg  = dashboardPage.welcomeMessage.getText().contains("Welcome");
        System.out.println("welcome boolean value is " + welcomeMsg);
        System.out.println("text message is " + dashboardPage.welcomeMessage.getText());
        System.out.println("is displayed " + dashboardPage.welcomeMessage.isDisplayed());
        Assert.assertTrue("Verify the welcome message" ,dashboardPage.welcomeMessage.getText().contains("Welcome"));
    }

    @Then("CLicked on PIM menu")
    public void clicked_on_PIM_menu() {
       dashboardPage.clickOnPim();
    }

    @Then("Scrolled down  to find employee {string}")
    public void scrolled_down_to_find_employee(String empID) {
        List<WebElement> tableRows;
        boolean flag = true;
        while (flag) {
            tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (WebElement row : tableRows) {
                  rowText = row.getText();
                System.out.println("RowText is " + rowText);
                if (rowText.contains("25127")) {
                    System.out.println(rowText);
                      newRowValue = rowText.substring(0, 5);
                    String ckBoxById = driver.findElement(By.xpath("//input[@value='" + newRowValue + "']")).getAttribute("value");
                    System.out.println("new String is " + newRowValue);
                    System.out.println(" value of the row " + ckBoxById);
                    flag = false;
                    break;
                    //input[@value='20401']
                }
            }
            System.out.println("I am about to click on the next button");
            if (flag) {
                click(employeeListPage.nextButton);
            }
        }
    }
    @Then("Click on the corresponding check box")
    public void click_on_the_corresponding_check_box() {
        chkBox =driver.findElement(By.xpath("//input[@value='" + newRowValue + "']")) ;
        System.out.println("check box value is " + chkBox.getAttribute("value"));
        //getJSExecutor().executeScript()

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript ("arguments[0].click();",chkBox);
        //js.executeScript("document.getElementByXpath(//input[@value= '+\"+newRowValue]).click();");

       // chkBox.click();
      //  throw new io.cucumber.java.PendingException();
    }

    @Then("Press Delete button")
    public void press_Delete_button() {
       employeeListPage.btnDelete.click();
    }

    @Then("Accept or Cancel the alert")
    public void accept_or_Cancel_the_alert() {
        employeeListPage.btnConfirmDelete.click();
    }

    @Then("Verify the Entry Deleted is Displayed")
    public void verify_the_Entry_Deleted_is_Displayed() {
        takeScreenshot("DeleteEmployee.png");
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
//input[@value='25081']
}
