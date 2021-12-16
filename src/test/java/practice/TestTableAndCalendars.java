package practice;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestTableAndCalendars extends CommonMethods {

    //table[@id='resultTable']/thead/tr[1]/th[4] Controls the column's names

    public static void main(String [] arg){
        BaseClass.SetUp();
        loginPage.login("admin","Hum@nhrm123");
       // loginPage.login(Constants.USERNAME,Constants.PASSWORD);
        loginPage.clickOnLoginBtn();
        dashboardPage.clickOnPim();
        List<WebElement> tableRows;//=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
       WebElement nextButton= driver.findElement(By.xpath("//a[contains(text(),'Next')]"));
       // System.out.println(tableRows.size());
        System.out.println( "Attribute's class is " + nextButton.getAttribute("class"));
        boolean flag=true;
        while (flag){
           tableRows=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
           for(WebElement row:tableRows){
               String rowText  = row.getText();
               System.out.println("RowText is " + rowText);
               if(rowText.contains("jack olena")){
                   System.out.println(rowText);
                   String newRowValue = rowText.substring(0, 5);
                   String ckBoxById=driver.findElement(By.xpath("//input[@value='"+newRowValue+"']")).getAttribute("value");
                   //driver.findElement(By.xpath("//input[@value='"+newRowValue+"']"));
                   System.out.println("new String is " + newRowValue);
                   System.out.println(" value of the row " + ckBoxById);
                   flag=false;
                   break;

                   //input[@value='20401']
               }
       }
           System.out.println("I am about to click on the next button");
           if(flag) {
               click(nextButton);
           }
       }
       BaseClass.tearDown();
    }
}
