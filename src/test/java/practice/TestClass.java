package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
    public static String url= "http://syntaxtechs.com/selenium-practice/window-popup-modal-demo.php";
    public static void main(String[] args) {
        System.out.println( System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver","C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
//        WebElement instaButton= driver.findElement(By.linkText(" Follow on Instagram " ));
//        WebElement fbButton = driver.findElement(By.linkText(" like us on Facebook "));
//        WebElement instaAndFbButton= driver.findElement(By.linkText("Follow Instagram & Facebook"));

//        instaButton.click();
//        fbButton.click();
//        instaAndFbButton.click();



    }
}
