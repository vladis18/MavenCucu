package practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFrames {
    public static void main(String[] args  ) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://uitestpractice.com/Students/Switchto");
        driver.switchTo().frame(0);
        WebElement textBox=driver.findElement(By.id("name"));
        textBox.sendKeys("Hello Mother Fuckers");
        JavascriptExecutor js  = (JavascriptExecutor) driver;

//        driver.switchTo().defaultContent();
//        WebElement alertButton = driver.findElement(By.id("alert"));
//        js.executeScript("document.getElementById('alert').click();");

//        //alertButton.click();
//        Thread.sleep(1000);
//        Alert alert = driver.switchTo().alert();
//        alert.accept();

//iframe[@name='iframe_a']
        driver.switchTo().defaultContent();
        driver.switchTo().frame("iframe_a");
        textBox.sendKeys(" and Assholes");
        driver.manage().window().maximize();
        driver.switchTo().defaultContent();
        WebElement myFrame= driver.findElement(By.xpath("//iframe[@src='/Demo.html']"));
        driver.switchTo().frame(myFrame);
        textBox.sendKeys( " and Fagots too");
        Thread.sleep(3000);
        driver.quit();
    }


}
