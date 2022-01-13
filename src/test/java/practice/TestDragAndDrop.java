package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class TestDragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver  myDriver  = new ChromeDriver();
        myDriver.get("https://jqueryui.com/droppable/");
        myDriver.switchTo().frame(0);
        WebElement draggable = myDriver.findElement(By.id("draggable"));
        WebElement droppable = myDriver.findElement(By.id("droppable"));
        Actions actions = new Actions(myDriver);
        //actions.dragAndDrop(draggable,droppable).perform();// shorter way //another way
        Thread.sleep(2000);
        actions.clickAndHold(draggable).moveToElement(droppable).release().build().perform(); //could work without build
        System.out.println(  "my title is " + myDriver.getTitle());

        myDriver.close();
        System.out.println("Hello");
        System.out.println(  "my title is " + myDriver.getTitle());
//        try {
//            Thread.sleep(2000);
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
//      finally {
//
//
//            myDriver.quit();
//        }



    }

}
