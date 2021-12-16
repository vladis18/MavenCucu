package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestAlerts {
    public static void main(String args []) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js =  (JavascriptExecutor)driver;


        driver.get("http://uitestpractice.com");
        String title =driver.getTitle();
 System.out.println(title);

        // WebElement btnSwchTo = driver.findElement(By.xpath("//a[contains(text(),'Switch to')]"));

        WebElement btnSwchTo = driver.findElement(By.xpath("//li//a[contains(text(),'Switch')]"));
//li//a[contains(text(),'Switch')]
            btnSwchTo.click();
        WebDriverWait explicitWait = new WebDriverWait(driver,30);
       // WebElement btnAlert= driver.findElement(By.id("alert"));

        WebElement btnAlert= driver.findElement(By.xpath("//button[@id='alert']"));
        js.executeScript("document.getElementById('alert').click();");
        //js.executeScript ("arguments[0].click();",btnAlert);

        //explicitWait.until(ExpectedConditions.elementToBeClickable(btnAlert));



        //a[contains(text(),'Switch to')]

        //button[@type='button']

        // WebElement btnAlert= driver.findElement(By.id("id= alert"));
        //WebElement btnAlert= driver.findElement(By.xpath("//button[@type='button']"));
         //btnAlert.click();
 //Thread.sleep(1000);

//        Alert alert = driver.switchTo().alert();
        Alert alert = driver.switchTo().alert();
        String alertMsg= alert.getText();
        alert.accept();
        driver.manage().window().maximize();
        System.out.println(alertMsg);

        Thread.sleep(2000);
        driver.quit();


    }



}
