package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

/**
 * @author priya.mishra01 @Date 16-06-2022
 */
public class TestEditLocation extends WebBaseTest {
  // Added by Ganesh,Priya
  @TestRails(id = "C1014430")
  @Description("Test to Search toolbar Edit Location Field")
  @Test(
      groups = {"P0", "Regression"},
      priority = 4,
      retryAnalyzer = Retry.class)
  @Feature("Search field into search category")
  public void testEditLocation() throws Exception {
    log.info(" Starting Test Case to Test Search toolbar Edit Location Field ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsBusinessOwner();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().businessOwnerEmail(),
        FrameworkConfigFactory.getConfig().businessOwnerPassword());
    goodFriendHomePage.searchByCitybyProvider(
        FrameworkConfigFactory.getConfig().searchedCityName());
    Thread.sleep(3000);
    goodFriendHomePage.searchByCitybyProvider(
        FrameworkConfigFactory.getConfig().searchedCityName1());
  }
}
