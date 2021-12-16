package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PIMConfigurationPage extends CommonMethods {
    @FindBy (id="menu_pim_Configuration")
    WebElement menuPimConfiguration;
    @FindBy(id="menu_pim_configurePim")
    public WebElement optionalFields;
    @FindBy(xpath = "//input[@value='Edit']")
    public WebElement editButton;
    @FindBy(xpath = "//li[@class='checkbox']")
    public List<WebElement> checkBoxes;
    @FindBy(id="btnSave")
    public WebElement btnSave;

    public void clickOnSaveBtn(){
        click(btnSave);
    }
    public void clickOnConfigMenuDropDown(){
        jsClick(menuPimConfiguration);
    }
    public void clickOnOptionalFields(){
        jsClick(optionalFields);
    }
    public void clickOnEditButton(){
        jsClick(editButton);
    }

    public PIMConfigurationPage(){
        PageFactory.initElements(driver,this);
    }
}
