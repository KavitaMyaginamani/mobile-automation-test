package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchToolbarEditSearch extends WebBaseTest {

  // Added by Ganesh,Priya
  @TestRails(id = "C1013943")
  @Description("Test to select toolbar edit search fields")
  @Test(
      groups = {"P0", "Regression"},
      priority = 4,
      retryAnalyzer = Retry.class)
  @Feature("Search field into search category")
  public void searchToolbarEdit() throws Exception {
    log.info(" Starting test case to validate Booked Appointment ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.selectGrooming(
        FrameworkConfigFactory.getConfig().searchedCityName(),
        FrameworkConfigFactory.getConfig().serviceName());
    Assert.assertTrue(testDriver.getCurrenturl(), "Failed to display Grooming services");
    goodFriendHomePage.selectTraining(FrameworkConfigFactory.getConfig().serviceName2());
    Assert.assertTrue(testDriver.gettraining(), "Failed to display Training services");
    goodFriendHomePage.selectAllServices(FrameworkConfigFactory.getConfig().serviceName1());
    Assert.assertTrue(testDriver.getALL(), "Failed to display All services");
    log.info(" Sucessfully executed  Test to select toolbar edit search fields ");
  }
}
