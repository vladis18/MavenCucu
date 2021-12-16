package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeListPage extends CommonMethods {
@FindBy(id ="empsearch_id")
public WebElement employeeIDtxt;

@FindBy(id="searchBtn")
public WebElement searchBtn;

@FindBy(xpath = "//tbody//tr/td/a")
public WebElement empIDrecordValue;

@FindBy(id = "btnDelete")
public WebElement btnDelete;

@FindBy(id="dialogDeleteBtn")
public WebElement btnConfirmDelete;

@FindBy(xpath = "//input[@class='btn cancel']")
public WebElement btnCancelDelete;

@FindBy(xpath=("//a[contains(text(),'Next')]"))
public WebElement nextButton;


public EmployeeListPage(){

    PageFactory.initElements(driver,this);
}

}
