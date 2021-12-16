package com.hrms.pages;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonMethods {
    @FindBy(
            id = "txtUsername"
    )
    public WebElement usernameBox;
    @FindBy(
            xpath = "//input[@id='txtPassword']"
    )
    public WebElement passwordBox;
    @FindBy(
            css = "input#btnLogin"
    )
    public WebElement loginBtn;
    @FindBy(
            xpath = "//a[@id='welcome']"
    )
    public WebElement welcomeLink;
    @FindBy(
            xpath = "//span[text()='Username cannot be empty']"
    )
    public WebElement messageUserName;
    @FindBy(
            xpath = "//span[text()='Password cannot be empty']"
    )
    public WebElement messagePassword;
    @FindBy(
            xpath = "//span[text()='Invalid credentials']"
    )
    public WebElement messageInvalidCredentials;
    @FindBy(
            xpath = "//span[@id='spanMessage']"
    )
    public WebElement displayedErrorMessage;

    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        sendText(this.usernameBox, username);
        sendText(this.passwordBox, password);
        //click(this.loginBtn);
    }
    public void clickOnLoginBtn(){
        click(this.loginBtn);
    }

    public String  getErrorMessage(){
      return   displayedErrorMessage.getText();
    }
}

