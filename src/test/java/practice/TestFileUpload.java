package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestFileUpload {
    public static void main(String[] vlad) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement fileUploadLink = driver.findElement(By.linkText("File Upload"));
        fileUploadLink.click();
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\Vladb\\Desktop\\PhoneNumberCiti.txt");
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        Thread.sleep(2000);
        uploadButton.click();
        driver.get("");
        driver.navigate();


    }
}
