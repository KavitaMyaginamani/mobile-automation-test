package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class EditBusinessProfile extends WebBaseTest {

  @TestRails(id = "C1013923")
  @Description("Test to Valida Edit misc. details of your Business Profile ")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("Test to Valida Edit misc. details of your Business Profile")
  public void editBusinessProfilePage() throws Exception {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Test to Valida Edit misc. details of your Business Profile  ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsBusinessOwner();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().businessOwnerEmail(),
        FrameworkConfigFactory.getConfig().businessOwnerPassword());
    goodFriendHomePage.editBusinessProfile(
        FrameworkConfigFactory.getConfig().businessNumber(),
        FrameworkConfigFactory.getConfig().businessAddress());
  }
}
