package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DashboardPage extends CommonMethods {
    @FindBy(
            id = "welcome"
    )
    public WebElement welcomeMessage;
    @FindBy(
            xpath = "//a[@id='menu_pim_viewPimModule']/b"
    )
    public WebElement PIMButton;
    @FindBy(
            xpath = "//b[text()='PIM']"
    )
    public WebElement menuPIM;
    @FindBy(id = "menu_pim_addEmployee") public WebElement addEmployeeMenu;
    public void clickOnAddEmployeeBtn(){
        addEmployeeMenu.click();
    }
    public void clickOnPim(){
        jsClick(menuPIM);
    }
    @FindBy(
            id = "btnAdd"
    )
    public WebElement addEmployeeBtn;


    @FindBy(xpath = "//div[@class='menu']//b")
    public List<WebElement> dashTabs;

    public List<String> getDashTabs() {
        List<String> dashTabText = new ArrayList<>();


            for (WebElement dashTab : dashTabs) {
                dashTabText.add(dashTab.getText());

            }
            return dashTabText;

    }
    public DashboardPage() {
        PageFactory.initElements(driver, this);
        }
}
