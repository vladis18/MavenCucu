package practice;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import com.hrms.utils.Constants;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class TestScreenShots extends CommonMethods {
    public static void main(String[] args) throws IOException {
        BaseClass.SetUp();
        //returnPropertyValue("username","password" );
        loginPage.login(returnPropertyValue("username", Constants.CONFIGURATION_FILEPATH),returnPropertyValue("password",Constants.CONFIGURATION_FILEPATH));

        TakesScreenshot screenshot = (TakesScreenshot) driver;
         File sourceFile=  screenshot.getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(sourceFile, new File("myScreenShots/CucumberFrameWorkVlad/adminLogin.png"));


    }




}
