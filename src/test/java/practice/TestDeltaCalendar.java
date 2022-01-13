package practice;

import com.hrms.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.List;

public class TestDeltaCalendar {
    public static void main(String[] args) throws InterruptedException {
        String url = "http://delta.com";

        System.setProperty("webdriver.chrome.driver","C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.navigate().to(url);
        driver.manage().window().maximize();
        WebElement calendar = driver.findElement(By.id("input_departureDate_1"));
        calendar.click();

        WebElement dMonth= driver .findElement(By.className("dl-datepicker-month-0"));
        WebElement btnNext= driver.findElement(By.xpath("//span[text()='Next']"));
        String departMonthText=dMonth.getText();

        while (!departMonthText.equals("July")){
            btnNext.click();
            departMonthText=dMonth.getText();
        }

    List<WebElement> departDates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-0']/tr/td"));
        for(WebElement departureDate : departDates){
            if(departureDate.getText().equals("8")){
                departureDate.click();
                break;
            }
        }
        WebElement rMonth= driver.findElement(By.className("dl-datepicker-month-1"));
        String returnMonth=rMonth.getText();

        while (!returnMonth.equals("September")) {
            //js.executeScript("arguments[0].click();", returnMonth);
            //js.executeScript("arguments[0].click();","btnNext");
            //CommonMethods.jsClick(btnNext);
             btnNext.click();
            returnMonth = rMonth.getText();
        }


        List<WebElement> returnDates=driver.findElements(By.xpath("//tbody[@class='dl-datepicker-tbody-1']/tr/td"));
        for(WebElement returnDate : returnDates){
            if(returnDate.getText().equals("12")){
               // js.executeScript("arguments[0].click();", returnDate);
                    returnDate.click();
                break;
            }
        }
        Thread.sleep(2000);
        WebElement doneButton = driver.findElement(By.className("donebutton"));
        doneButton.click();
    // driver.quit();
    }


}
