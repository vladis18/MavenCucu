package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandlesTest {
    public static void main(String [] arg) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/signup");
        String mainHandle = driver.getWindowHandle();
        System.out.println(mainHandle);
        WebElement helpLink = driver.findElement(By.linkText("Help"));
        helpLink.click();
        Set<String> allWindowHandles=driver.getWindowHandles();//automatialy converts intoa LinkedHashSet
        System.out.println(allWindowHandles.size() + " " + allWindowHandles);
        Iterator<String> it = allWindowHandles.iterator();
        mainHandle=it.next();
        String childHandle = it.next();
        System.out.println("Child window " + childHandle);
        Thread.sleep(2000);
        driver.switchTo().window(mainHandle);
        driver.quit();


    }
}
