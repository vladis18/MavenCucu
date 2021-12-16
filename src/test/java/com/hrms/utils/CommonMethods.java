package com.hrms.utils;

import com.hrms.testbase.BaseClass;
import com.hrms.testbase.PageInitializer;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class CommonMethods extends PageInitializer {
    /**
     * This method will read a value from a property file based on provided key and directory
     * @param key
     * @param directory
     * @return
     * @throws IOException
     */
    public static String returnPropertyValue(String key,String directory) throws IOException {
        FileReader reader=new FileReader(directory);
        Properties p=new Properties();
        p.load(reader);
        return p.getProperty(key);
    }


    /**
     * This method will clear a textbox and send text to it
     * @param element
     * @param textToSend
     */
    public static void sendText(WebElement element, String textToSend){
        element.clear();
        element.sendKeys(textToSend);
    }

    /**
     * This method will return an object of Explicit wait with time set to 20 sec.
     * @return
     */
    public static WebDriverWait getWait(){
        WebDriverWait wait = new WebDriverWait(driver,Constants.EXPLICIT_WAIT);
        return  wait;
    }

    /**
     * this method will wait untill given element is clickable
     * @param element
     */
    public static  void waitForClickability(WebElement element){
        getWait().until(ExpectedConditions.elementToBeClickable(element));
    }

    /**
     * this method will wait and click on any given  element
     * @param element
     */
    public static void click(WebElement element){
        waitForClickability(element);
        element.click();
    }

    /**
     * This method will return an abject of JavaScriptExecutor
     * @return
     */
    public static JavascriptExecutor getJSExecutor(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        return js;
    }

    /**
     *
     * @param element
     */
    public static void jsClick(WebElement element){
        getJSExecutor().executeScript ("arguments[0].click();",element);


    }

    /**
     *
     * @param fileName
     */
    public static void takeScreenshot(String fileName){
        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFire = ts.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(sourceFire,new File
                    (Constants.SCREENSHOT_FILEPATH+fileName+ getTimeStamp("yy-MM-dd-HH-mm-ss") + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static byte[] screenshotTaker(String fileName){
        TakesScreenshot ts=(TakesScreenshot) driver;
        File sourceFire = ts.getScreenshotAs(OutputType.FILE);
        byte[] bytes=ts.getScreenshotAs(OutputType.BYTES);

        try {
            FileUtils.copyFile(sourceFire,new File
                    (Constants.SCREENSHOT_FILEPATH+fileName+ getTimeStamp("yy-MM-dd-HH-mm-ss") + ".png"));
        }catch(IOException e){
            e.printStackTrace();
        }
        return bytes;
    }

    /**
     *
     * @return
     */
    public static String getTimeStamp(String pattern){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date) ;
        //System.err.println("Philadelphiskoe neponyatnoe Vremya " + date.getTime());
        //System.out.println("Philadelphiskoe ponyatnoe Vremya " + date);
    }

    /**
     * this method will click on any radio button or check box by the given list of elements and the value
     * @param radioBrnOrChkBoxes
     * @param value
     */
    public static void clickRadioBtnOrCheckBoxByValue(List<WebElement> radioBrnOrChkBoxes,String value){
        for(WebElement radioBtnOrChkBox: radioBrnOrChkBoxes){
            String actualValue = radioBtnOrChkBox.getAttribute("value").trim();
            if(radioBtnOrChkBox.isEnabled()&& actualValue.equals(value)){
                System.out.println(actualValue);
                //jsClick(radioBtnOrChkBox);
                click(radioBtnOrChkBox);
                break;
            }
        }
    }
    /**
     * this method will click on any radio button or check box by the given list of elements and the value
     * @param radioBrnOrChkBoxes
     * @param text
     */
    public static void clickRadioBtnOrCheckBoxByText(List<WebElement> radioBrnOrChkBoxes,String text){
        for(WebElement radioBtnOrChkBox: radioBrnOrChkBoxes){
            String actualValue = radioBtnOrChkBox.getText().trim();
            System.out.println(actualValue);
            if(actualValue.equals(text)){
                //jsClick(radioBtnOrChkBox);
                click(radioBtnOrChkBox);
                break;
            }
        }
    }



    /**
     * this method will select a value from any dropDown box by the given visible text
     * @param dropDown
     * @param visibleText
     */
    public static  void selectDropDownValue(WebElement dropDown, String visibleText) {
    try {
        Select select = new Select(dropDown);
        List<WebElement> options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().trim().equals(visibleText)) {
                select.selectByVisibleText(visibleText);
                break;
            }
        }
    }catch (UnexpectedTagNameException e){
        e.printStackTrace();
    }
}

    /**
     * this method will switch to the child window
     */
    public static void switchToChildWindow(){
        String mainWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        for(String window:allWindows){
            if(!window.equals(mainWindow)){
                driver.switchTo().window(window);
                break;
            }
        }
}
    /**
     * this method will select a value from a given dropDown by the given index
     * @param dropDown
     * @param index
     */
    public static void selectDropDownValue(WebElement dropDown, int index){
        try {
            Select select = new Select(dropDown);
            List<WebElement> options = select.getOptions();
            int dropDownSize= options.size();

            if(dropDownSize > index){
                select.selectByIndex(index);
            }
        }catch (UnexpectedTagNameException e){
            e.printStackTrace();
        }

}


    /**
     * this method will switch to any frame by the given frame index
     * @param frameIndex
     */
    public static void switchToFrame(int frameIndex){
        try {
            driver.switchTo().frame(frameIndex);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
}
    /**
     * this method will switch to any frame by the given frame name or ID
     * @param nameOrId
     */
    public static void switchToFrame(String nameOrId){
        try {
            driver.switchTo().frame(nameOrId);
        }catch (NoSuchFrameException e){
            e.printStackTrace();
        }
    }
}
