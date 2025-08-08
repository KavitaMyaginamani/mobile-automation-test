package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SuccessfullyRepeatBasicHeaderNavigationTestonTheFollowingPages extends WebBaseTest {
  // Added by Ganesh
  @TestRails(id = "C1013912")
  @Description("Test to Basic Header Navigation")
  @Test(
      groups = {"P0", "Regression"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("HomePage Verification")
  public void testVerifyBasicHeaderNavigation() {
    log.info(" Starting test case to validate basic header navigation ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(
            FrameworkConfigFactory.getConfig().customerRegistrationPage());
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().customerRegistrationPage()),
        "Failed to navigate Customer Registration page");
    goodFriendHomePage.loginAsPetParent();
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().loginSignupPage()),
        "Failed to navigate  Login signup page");

    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(
            FrameworkConfigFactory.getConfig().customerLoginPage());
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().customerLoginPage()),
        "Failed to navigate Customer Login page");
    goodFriendHomePage.loginAsPetParent();
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().loginSignupPage()),
        "Failed to navigate  Login signup page");

    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(
            FrameworkConfigFactory.getConfig().providerRegistrationPage());
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().providerRegistrationPage()),
        "Failed to navigate provider Registration page");
    goodFriendHomePage.loginAsPetParent();
    // Assert.assertTrue(testDriver.expectedUrl(FrameworkConfigFactory.getConfig().loginSignupPage()),"Failed to navigate  Login signup page");

    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(
            FrameworkConfigFactory.getConfig().providerLoginPage());
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().providerLoginPage()),
        "Failed to navigate provider Login page");
    goodFriendHomePage.loginAsPetParent();
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().loginSignupPage()),
        "Failed to navigate  Login signup page");

    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    Assert.assertTrue(
        testDriver.expectedUrl(FrameworkConfigFactory.getConfig().loginSignupPage()),
        "Failed to navigate  Login signup page");
    log.info(" Successfully executed basic header navigation  ");
  }
}
