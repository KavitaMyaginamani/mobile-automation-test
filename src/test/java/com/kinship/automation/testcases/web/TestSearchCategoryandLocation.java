package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

/**
 * @author priya.mishra01 @Date 17-06-2022
 */
public class TestSearchCategoryandLocation extends WebBaseTest {

  // Added by Ganesh,Priya
  @TestRails(id = "C1014431")
  @Description("Test to select toolbar edit loaction and category fields")
  @Test(
      groups = {"P0", "Regression"},
      priority = 4,
      retryAnalyzer = Retry.class)
  @Feature("Search field for Category and Location Field")
  public void searchEditCategoryandLocation() throws Exception {
    log.info(" Starting test case to validate Booked Appointment ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.selectGrooming(
        FrameworkConfigFactory.getConfig().searchedCityName(),
        FrameworkConfigFactory.getConfig().serviceName());
    goodFriendHomePage.selectTraining(FrameworkConfigFactory.getConfig().serviceName2());
    goodFriendHomePage.selectAllServices(FrameworkConfigFactory.getConfig().serviceName1());
    log.info("Sucessfully executed  Test to Search field for Category and Location Field");
  }
}
