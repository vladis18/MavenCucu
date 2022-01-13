package com.hrms.stepdefinitions;


import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
    @Before
    public void StartTest(Scenario scenario){
        System.out.println("Before tag  scenario is " + scenario.getName());
        BaseClass.SetUp();
    }
    @After
    public void endTest(Scenario scenario){
        byte[] screenshot;
        //screenshot=CommonMethods.screenshotTaker("willSee/" + scenario.getName());
        if (scenario.isFailed()){
            screenshot=CommonMethods.screenshotTaker("failed/" + scenario.getName());
        }else {
            screenshot=CommonMethods.screenshotTaker("passed/" + scenario.getName());
        }
        scenario.attach(screenshot,"image.png",scenario.getName());
        System.out.println("After tag  scenario is " + scenario.getName());
        BaseClass.tearDown();
    }
}
