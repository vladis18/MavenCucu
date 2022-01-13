package practice;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestCreateAndDeleteTableRow  extends CommonMethods {
    public static void main(String[] args) {
        String empID;
        BaseClass.SetUp();
        loginPage.login(ConfigsReader.getPropertyValue("username"),ConfigsReader.getPropertyValue("password" ));

       //loginPage.login(Constants.USERNAME, Constants.PASSWORD);
        loginPage.clickOnLoginBtn();
        dashboardPage.clickOnPim();
        dashboardPage.clickOnAddEmployeeBtn();
        addEmployeePage.addFirstMiddleAndLastName("Alison", "Hope","Smith");
        empID= addEmployeePage.empIDTextbox.getAttribute("value");
        addEmployeePage.clickOnSaveBtn();
        personalDetailsPage.employeeListBtn.click();

        List<WebElement> tableRows;
        boolean flag = true;
        while (flag) {
            tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

            for (int i = 0; i < tableRows.size(); i++) {
                String rowText = tableRows.get(i).getText();
                if (rowText.contains(empID)) {
                    flag = false;
                    WebElement checkBox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[1]"));
                    checkBox.click();
                    employeeListPage.btnDelete.click();
                    employeeListPage.btnConfirmDelete.click();
                    break;
                }
            }
            employeeListPage.nextButton.click();
        }
        BaseClass.tearDown();
    }
}