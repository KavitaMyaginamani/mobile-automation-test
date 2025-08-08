package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class ProviderWebsitePhoneNumberValidation extends WebBaseTest {

  @TestRails(id = "1014027")
  @Description("Provider Website, Phone Number Validation")
  @Test(
      groups = {"P0", "Regression"},
      priority = 1,
      retryAnalyzer = Retry.class)
  @Feature("Provider Website, Phone Number Validation")
  public void testProviderWebsitePhoneNumberValidation() throws Exception {
    log.info(" Starting test case to Provider Website, Phone Number Validation ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.searchByCity(FrameworkConfigFactory.getConfig().searchedCityName());
    goodFriendHomePage.phoneNumber();
  }
}
