package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodFriendInstagramFooter extends WebBaseTest {
  // Added by Ganesh
  @TestRails(id = "C1013909")
  @Description("Test to navigate to Good Friend Instagram page")
  @Test(
      groups = {"P0", "Regression"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("HomePage Verification")
  public void testVerifyAGoodFriendInstagramPage() throws Exception {
    log.info(" Starting test case to navigate navigate to Good Friend Instagram page ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    testDriver.windowScroll();
    Assert.assertTrue(
        goodFriendHomePage.isInstagramLogoPresent(),
        "Failed to Verify of Instagram Logo in Footer");
    goodFriendHomePage.clickOnInstaLogo();
    testDriver.switchWindow();
    // goodFriendHomePage.instaLogin();
    // Assert.assertTrue(testDriver.getExpectedInstaurl(),"Failed to navigate Good Friend Instagram
    // page");
    log.info(" Successfully executed navigate to Good Friend Instagram page ");
  }
}
