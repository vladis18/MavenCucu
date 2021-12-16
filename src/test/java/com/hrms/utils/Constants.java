package com.hrms.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Constants {
    public static final String CONFIGURATION_FILEPATH= System.getProperty("user.dir") +"\\src\\test\\resources\\configs\\configuration.properties";


   // ("user.dir")+"\\src\\test\\resources\\configs\\configuration.properties";

    //  C:\TryAgain\CucumberFrameworkVlad\src\test\resources\configs\configuration.properties
//    public  static    String userNAME = ConfigsReader.getPropertyValue("username");
//    public  static   String passWORD = ConfigsReader.getPropertyValue("password");

    public static final String TESTDATA_FILEPATH="C:\\TryAgain\\ProjectFiles\\Employees.xlsx";
    public static final String SCREENSHOT_FILEPATH=System.getProperty("user.dir")+"\\screenshots\\";
    public static final int IMPLICIT_WAIT=10;
    public static final int EXPLICIT_WAIT=20;
    public static final String EXCELPATH="C:\\TryAgain\\ProjectFiles\\Employees.xlsx";
//    public static    String USERNAME = userNAME;
//    public static String PASSWORD = passWORD;
//    public   static final      String USERNAME = ConfigsReader.getPropertyValue("username");
//    public   static final   String PASSWORD = ConfigsReader.getPropertyValue("password");

}
