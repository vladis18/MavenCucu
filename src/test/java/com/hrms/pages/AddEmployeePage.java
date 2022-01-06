package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePage extends CommonMethods {
    @FindBy(
            id = "firstName"
    )
    public WebElement firstNameTextBox;
    @FindBy(
            id = "middleName"
    )
    public WebElement midleNameTextBox;
    @FindBy(
            id = "lastName"
    )
    public WebElement lastNameTextbox;
    @FindBy(
            id = "employeeId"
    )
    public WebElement empIDTextbox;
    @FindBy(
            id = "btnSave"
    )
    public WebElement saveButton;
    @FindBy(
            id = "chkLogin"
    )
    public WebElement createLoginCheckbox;
    @FindBy(
            xpath = "//b[text()='PIM']"
    )
    public WebElement menuPIM;
    @FindBy(
            xpath = "//input[@id='photofile']"
    )
    public WebElement chooseFileBtn;
    @FindBy(
            xpath = "//input[@id='user_name']"
    )
    public WebElement userName;
    @FindBy(
            xpath = "//input[@id='user_password']"
    )
    public WebElement password;
    @FindBy(
            xpath = "//input[@id='re_password']"
    )
    public WebElement confirmPassword;
    @FindBy(
            xpath = "//select[@id='status']"
    )
    public WebElement statusDropDown;
    @FindBy(
            xpath = "//body//div//form//fieldset//ol//li//select[@name='status']"
    )
    public WebElement statusDropDownbyName;

    @FindBy(
            xpath = "//input[@id='btnSave']"
    )
    public WebElement saveEmployeeBtn;
    @FindBy(
            xpath = "//option[@value='Enabled']"
    )
    public WebElement optEnabledDD;
    @FindBy(
            xpath = "//option[@value='Disabled']"
    )
   public WebElement optDisapbledDD;

    public void addFirstAndLastName(String firstName,String lastName){
        sendText(firstNameTextBox, firstName);
        sendText(lastNameTextbox,lastName);
    }
    public void addFirstMiddleAndLastName(String firstName,String middleName,String lastName){
        sendText(firstNameTextBox, firstName);
        sendText(lastNameTextbox,lastName);
        sendText(midleNameTextBox,middleName);
    }
    public void enterEmployeeID(String employeeID){
        sendText(empIDTextbox,  employeeID);
    }
    public void clickOnSaveBtn(){
        jsClick(saveEmployeeBtn);
    }
    public AddEmployeePage() {
        PageFactory.initElements(driver, this);
    }

}
//    When I land on dashboard page
//    And click on PIM menu
//        And I land on viewEmployeeList page
//        Then I click on add button
//        And land on addEmployee page
//        Then I fill out necessary fields
//        And click save button
//        then I land on viewPersonalDetails page on Personal Details tab
//        and verify that employee's name was displayed