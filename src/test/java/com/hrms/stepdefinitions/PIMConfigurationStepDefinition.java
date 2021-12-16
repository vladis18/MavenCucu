package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class PIMConfigurationStepDefinition extends CommonMethods {


    @Then("click on PIM Menu")
    public void click_on_PIM_Menu() {
        //dashboardPage.PIMButton.click();
        dashboardPage.clickOnPim();
    }

    @When("click on Configuration drop down menu")
    public void click_on_Configuration_drop_down_menu() {
        pimConfigurationPage.clickOnConfigMenuDropDown();

    }

    @When("click on Optional fields")
    public void click_on_Optional_fields() {
        pimConfigurationPage.clickOnOptionalFields();
    }

    @When("click on Edit button")
    public void click_on_Edit_button() {
        pimConfigurationPage.clickOnEditButton();

    }

    @When("uncheck unnecessary checkboxes")
    public void uncheck_unnecessary_checkboxes( DataTable checkBoxOptions) {
        List<String> expectedCheckBoxOptions = checkBoxOptions.asList();
        for (int i =0;i<expectedCheckBoxOptions.size();i++){
            clickRadioBtnOrCheckBoxByText(pimConfigurationPage.checkBoxes, expectedCheckBoxOptions.get(i));
        }

    }
    @When("click on Save btn")
    public void click_on_Save_btn() {
      pimConfigurationPage.clickOnSaveBtn();
    }

}
