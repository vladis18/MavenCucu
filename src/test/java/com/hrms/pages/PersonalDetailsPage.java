package com.hrms.pages;

import com.hrms.testbase.PageInitializer;
import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage extends CommonMethods {
    @FindBy(xpath = "//h1[text()='Personal Details']")
    public WebElement personalDetails;

    @FindBy(id="personal_txtEmployeeId")
    public WebElement employeeIDTxt;

    @FindBy(id="personal_txtEmpFirstName")
    public WebElement firstNameTxt;

    @FindBy(id="personal_txtEmpLastName")
    public WebElement lastNameTxt;

    @FindBy(id="personal_txtMiddleName")
    public WebElement middleNameTxt;

    @FindBy(xpath = "//h1[contains(text(),'Puffy')]")
    public WebElement lblEmployeeName;

    @FindBy(xpath="//div[@id='profile-pic']//following-sibling::h1")
        public WebElement  empProfileNameLbl;
    @FindBy(linkText = "Employee List")
    public WebElement employeeListBtn;

    public String getEmpProfileName(){
        return empProfileNameLbl.getText();
    }

    public PersonalDetailsPage(){
        PageFactory.initElements(driver,this);
    }

}
