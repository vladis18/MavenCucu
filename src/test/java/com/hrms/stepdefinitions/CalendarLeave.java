package com.hrms.stepdefinitions;

import com.hrms.pages.ViewLeaveListPage;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class CalendarLeave extends CommonMethods {
    @Given("I navigate on HRMS Dashboard")
    public void i_navigate_on_HRMS_Dashboard() throws IOException {
        loginPage.login(returnPropertyValue("username", Constants.CONFIGURATION_FILEPATH),returnPropertyValue("password",Constants.CONFIGURATION_FILEPATH));
        loginPage.clickOnLoginBtn();
    }

    @When("click on Leave")
    public void click_on_Leave() {
    viewLeaveListPage.leaveBtn.click();

    }

    @When("click on Leave list")
    public void click_on_Leave_list() {
      viewLeaveListPage.leaveListBtn.click();
    }

    @Then("choose From date from the Calendar")
    public void choose_From_date_from_the_Calendar() throws InterruptedException {
        Select select;
        viewLeaveListPage.fromCalendar.click();
         viewLeaveListPage.monthDropDown.click();
        //List<WebElement> monthList=driver.findElements(By.xpath("//select[@class='ui-datepicker-month']"));
        String monthOpt = "Jun";
        select  = new Select(viewLeaveListPage.monthDropDown);
        System.out.println("I created select object ");
        List<WebElement> dropDownMonthOptions=select.getOptions();
        System.out.println("I created a list ");
        Thread.sleep(2000);
        for(WebElement month:dropDownMonthOptions){
            System.out.println("I created a loop");
            if(month.getText().equals("Jun")){
                System.out.println("I am inside if statement");
                select.selectByVisibleText(monthOpt);
                //System.out.println(month.getSize());
                break;
            }
            System.out.println("I just clicked on " + month.getText());
        }
        viewLeaveListPage.fromCalendar.click();
        viewLeaveListPage.yearDropDown.click();
         select = new Select(viewLeaveListPage.yearDropDown);
        List<WebElement> year = select.getOptions();
        for(WebElement yearOpt:year){
            if(yearOpt.getText().equals("2022")){
                select.selectByVisibleText("2022");
                System.out.println("I just selected 2022");
                break;
            }
        }
        List<WebElement> tableRows=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));
        
 
        System.out.println("Table row size is " + tableRows.size());
        //System.out.println("Table row size is " + calendarDaysRows);
        for(int i = 1; i<tableRows.size();i++){
            List<WebElement>  tableColumns=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td"));
            System.out.println("Table column size is "+ tableColumns.size());
             for (int j=1; j <tableColumns.size();j++){

                if (driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]")).getText().equals("18")) {
                    System.out.println("I am about to click on something ");
                    WebElement tableData=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr["+i+"]/td["+j+"]"));
                    jsClick(tableData);
                    System.out.println("I just clicked something ");
                }
            }
        }
        //table[@class='ui-datepicker-calendar']/tbody/tr/td[5]

    }

    @Then("choose To date from the Calendar")
    public void choose_To_date_from_the_Calendar() {



    }

    @Then("click only on Canceled and Rejected checkboxes")
    public void click_only_on_Canceled_and_Rejected_checkboxes() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("uncheck Pending Approval")
    public void uncheck_Pending_Approval() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("select It support form Drop Down")
    public void select_It_support_form_Drop_Down() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("click on the Search button")
    public void click_on_the_Search_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("Quit the browser")
    public void quit_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
