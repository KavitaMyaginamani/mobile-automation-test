package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class DeleteAStaffMember extends WebBaseTest {

  @TestRails(id = "1013995")
  @Description("Delete a staff member")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("Delete a staff member")
  public void testDeleteStaffMember() throws Exception {
    log.info(" Starting test case to Delete a staff member ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.clickListYourBusinessButton();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().businessOwnerEmail(),
        FrameworkConfigFactory.getConfig().businessOwnerPassword());
    goodFriendHomePage.deleteStaff();
  }
}
