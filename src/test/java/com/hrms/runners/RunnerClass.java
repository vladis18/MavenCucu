package com.hrms.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // publish = true,
        stepNotifications = false,
        strict = true,
        features =
 "C:\\TryAgain\\CucumberFrameworkVlad\\src\\test\\resources\\features",
        //"\\src\\test\\resources\\features\\emp.feature",
        glue = "com\\hrms\\stepdefinitions",
        dryRun = false,
       // tags={"@excelTask"},
        tags={"@excelTask"},
        monochrome = true,
        plugin = {"pretty","html:target/cucumber-default-reports","rerun:target/FailedTests.txt",
       "json:target/cucumber.json"}
        //@dtWithHeader //@pim // @excelTask
)
//"@validLogin",

public class RunnerClass {
}
