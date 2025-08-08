package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class VerifyAddingNewBusinessWithInvalidFirstNameLastName extends WebBaseTest {

  @TestRails(id = "1013995")
  @Description("Verify Adding new business with invalid First Name & Last Name")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("Verify Adding new business with invalid First Name & Last Name")
  public void businessOwnerRegistrationPage() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Test to Verify Adding new business with invalid First Name & Last Name ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.clickListYourBusinessButton();
    goodFriendHomePage.enterEmail(FrameworkConfigFactory.getConfig().newPetParentEmail());
    goodFriendHomePage.petOwnerDetails(
        FrameworkConfigFactory.getConfig().businessFirstName(),
        FrameworkConfigFactory.getConfig().businessLastName(),
        FrameworkConfigFactory.getConfig().petParentPhoneNumber(),
        FrameworkConfigFactory.getConfig().petParentNewPassword(),
        FrameworkConfigFactory.getConfig().petParentNewPassword());
  }
}
