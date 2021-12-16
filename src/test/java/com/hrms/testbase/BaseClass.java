package com.hrms.testbase;

import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    public static String USERNAME; //= ConfigsReader.getPropertyValue("username");
    public static  String PASSWORD; //= ConfigsReader.getPropertyValue("password");
    public static void SetUp(){
        ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);

//        System.out.println(ConfigsReader.getPropertyValue("browser"));
//        System.out.println(ConfigsReader.getPropertyValue("url"));
//        String myCase = ConfigsReader.getPropertyValue("browser");
        switch (ConfigsReader.getPropertyValue("browser").toLowerCase().trim()) {
            //switch (myCase){
            case "chrome":


                WebDriverManager.chromedriver().setup();
//                ChromeOptions chromeOptions = new ChromeOptions();
//                chromeOptions.setHeadless(true);
//                driver = new ChromeDriver(chromeOptions);
                //System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\ChromeDriver93\\chromedriver.exe");
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                //System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                throw new RuntimeException("Invalid browser");
        }

        driver.get(ConfigsReader.getPropertyValue("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
        PageInitializer.initializePageObjects();
    }
    /**
     * this method will close any open browser
     */

    public static void tearDown(){
        if(driver !=null){
            driver.quit();
        }
    }
}
