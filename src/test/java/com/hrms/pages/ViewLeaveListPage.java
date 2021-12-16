package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import com.sun.corba.se.impl.encoding.CDRInputObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewLeaveListPage extends CommonMethods {
    @FindBy(linkText = "Leave")
    public WebElement leaveBtn;
    @FindBy(linkText = "Leave List")
    public WebElement leaveListBtn;
    @FindBy(id="calFromDate")
    public WebElement fromCalendar;
    //@FindBy(className = "ui-datepicker-month")
    @FindBy(xpath = "//select[@class = 'ui-datepicker-month']")
    public WebElement monthDropDown;
    @FindBy(className ="ui-datepicker-year" )
    public WebElement yearDropDown;


public ViewLeaveListPage(){
    PageFactory.initElements(driver,this);
    }
}
