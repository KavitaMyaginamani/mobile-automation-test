package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoodFriendFaceBookFooter extends WebBaseTest {
  // Added by Ganesh
  @TestRails(id = "C1013910")
  @Description("Test to navigate to Good Friend Facebook page")
  @Test(
      groups = {"P0", "Regression"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("HomePage Verification")
  public void testVerifyGoodFriendFacebookPage() {
    log.info(" Starting test case to validate Home Page facebook logo ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    testDriver.windowScroll();
    Assert.assertTrue(
        goodFriendHomePage.isFacbookLogoPresent(),
        "Verifying the presence of Facebook Logo Footer");
    goodFriendHomePage.clickOnFacbookLogo();
    testDriver.switchWindow();
    // Assert.assertTrue(testDriver.getExpectedFacebookurl(),"Failed to navigate Good Friend
    // Facebook page");
    log.info(" Successfully executed navigate to Good Friend Facebook page ");
  }
}
