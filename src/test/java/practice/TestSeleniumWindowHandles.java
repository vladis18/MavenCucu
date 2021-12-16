package practice;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class TestSeleniumWindowHandles extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        BaseClass.SetUp();
     driver.get("https://www.google.com/");

      //getJSExecutor().executeScript("window.open()");
      //getJSExecutor().executeScript("window.open('https://google.com')");
   //   ((JavascriptExecutor) driver).executeScript("window.open()");
//        Open new window with specific URL:
//        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com')");
        for (int i =0; i<=3;i++) {
            getJSExecutor().executeScript("window.open('https://google.com')");
            driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
            System.out.println(i);
        }
        Set<String> windows = driver.getWindowHandles();
        for(String handle:windows){
            System.out.println(handle);
        }
        //Set<Integer> index= driver.getWindowHandles();
         int index=0;
        for (String handles2:windows){
            driver.switchTo().defaultContent();
            driver.switchTo().window(handles2);


            driver.manage().window().fullscreen();
            Thread.sleep(1000);
            driver.manage().window().maximize();
            System.out.println("My second loop: "  + handles2);

        }
    }
}
//    public void switchToWindowIndex(int index) {
//        Set<String> windows = driver.getWindowHandles();
//        int totalWin = windows.size();
//        String winTitle = null;
//        for (int i =0; i<= totalWin; i++) {
//            if (i == index) {
//                winTitle = windows.toArray()[i].toString();
//                return;
//            }
//            System.out.println(windows.toArray()[i].toString());
//
//        }
//        driver.switchTo().window(winTitle);
//        logger.info("Switched to " + driver.getTitle());
//    }