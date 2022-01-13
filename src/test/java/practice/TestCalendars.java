package practice;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.List;

public class TestCalendars extends CommonMethods {
    public static   String USERNAME; //= ConfigsReader.getPropertyValue("username");
    public static String PASSWORD; //= ConfigsReader.getPropertyValue("password");
    public static void main(String [] args) throws IOException {

        SetUp();
//           USERNAME = ConfigsReader.getPropertyValue("username");
//           PASSWORD = ConfigsReader.getPropertyValue("password");
          loginPage.login(returnPropertyValue("username", Constants.CONFIGURATION_FILEPATH),returnPropertyValue("password",Constants.CONFIGURATION_FILEPATH));
          loginPage.clickOnLoginBtn();
           //loginPage.login(USERNAME,PASSWORD);
        //loginPage.login(ConfigsReader.getPropertyValue("username"),ConfigsReader.getPropertyValue("password"));
      viewLeaveListPage.leaveBtn.click();
      viewLeaveListPage.leaveListBtn.click();
      viewLeaveListPage.fromCalendar.click();
        selectDropDownValue(viewLeaveListPage.monthDropDown, "Jul");
        selectDropDownValue(viewLeaveListPage.yearDropDown, "2022");
        List<WebElement> fromDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement fromDate :fromDates){
            if(fromDate.getText().equals("4")){
                fromDate.click();
                break;
            }
        }
        tearDown();
    }
    //table[@class='ui-datepicker-calendar']/tbody/tr/td
    public static void main(int[] args) {
        System.out.println("Hello");
    }

}
