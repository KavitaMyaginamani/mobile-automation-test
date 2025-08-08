package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

/**
 * @author priya.mishra01 @Date 07-06-2022
 */
public class TestPrivacyPolicyFooter extends WebBaseTest {

  // Added by Priya
  // Clicking on Privacy Logo in Footer and opening Privacy Policy Page.
  @TestRails(id = "C1013907")
  @Description("Test for Clicking on Privacy Logo Footer")
  @Test(
      groups = {"P0", "Regression"},
      priority = 6,
      retryAnalyzer = Retry.class)
  @Feature("Clicking on Terms Of Service Logo Footer")
  public void testPrivacyLogoFooter() throws Exception {
    log.info(" Starting test case to click and open Privacy Policy Page");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    testDriver.windowScroll();
    goodFriendHomePage.clickOnPrivacyLogo();
    // Assert.assertTrue(goodFriendHomePage.verifyPrivacyLogoUrl("https://www.mars.com/privacy"),"Not able to open Privacy Policy Page");
    log.info(" Successfully executed test case to click and open Privacy Policy Page ");
  }
}
