package practice;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestHoverOver extends CommonMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver myDriver  = new ChromeDriver();
        myDriver.get("https:/amazon.com/");
        WebElement acountsAndLists= myDriver.findElement(By.id("nav-link-accountList"));

        Actions actions=new Actions(myDriver);
        actions.moveToElement(acountsAndLists).perform();

        myDriver.quit();
        BaseClass.tearDown();

    }
}
