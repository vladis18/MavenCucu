package com.hrms.stepdefinitions;

import com.hrms.utils.CommonMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class DashboardStepDefinitions extends CommonMethods {
    @Then("verify the following tabs are on the dashboard")
    public void verify_the_following_tabs_are_on_the_dashboard(DataTable dashboardTabs) {
        List<String> expectedDashTabs= dashboardTabs.asList();
        List<String > actualDashTabs= dashboardPage.getDashTabs();
        System.out.println("expected" + expectedDashTabs);
        System.out.println("actual" + actualDashTabs);
        Assert.assertEquals("Verifying Dashboard Tabs" ,expectedDashTabs,actualDashTabs);
    }

}
