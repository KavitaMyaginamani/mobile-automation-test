package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author priya.mishra01 @Date 06-06-2022
 */
public class TestTermsOfServiceFooter extends WebBaseTest {

  // Added by Priya
  // Clicking on Terms Of Service Footer and opening Terms of Service Page.
  @TestRails(id = "C1013906")
  @Description("Test for Clicking on Terms Of Service Logo Footer")
  @Test(
      groups = {"P0", "Regression"},
      priority = 5,
      retryAnalyzer = Retry.class)
  @Feature("Clicking on Terms Of Service Logo Footer")
  public void testTermsOfServiceLogoFooter() throws Exception {
    log.info(" Starting test case to click and open Terms of Service Page");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    testDriver.windowScroll();
    goodFriendHomePage.clickOnTermsOfServiceLogo();
    Assert.assertTrue(
        goodFriendHomePage.verifyTermsOfServiceUrl(
            FrameworkConfigFactory.getConfig().termsOfServiceUrl()),
        " Not able to open Terms of Service Page");
    log.info(" Successfully executed test case to click and open Terms of Service Page ");
  }
}
