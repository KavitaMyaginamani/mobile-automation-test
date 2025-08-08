package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BusinessOwnerRegistrationPageValidationTest extends WebBaseTest {

  @TestRails(id = "1014002")
  @Description("Test to Valida Business Owner Registration Page ")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("Test to Valida Business Owner Registration Page")
  public void businessOwnerRegistrationPage() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Test to Valida Business Owner Registration Page  ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.signupNow();
    Assert.assertTrue(
        goodFriendHomePage.validateEmail(FrameworkConfigFactory.getConfig().newPetParentEmail()),
        "Validating email address of the pet owner");
    Assert.assertTrue(
        goodFriendHomePage.validateFirstName(
            FrameworkConfigFactory.getConfig().petParentFirstName()),
        "Validating First Name of the pet owner");
    Assert.assertTrue(
        goodFriendHomePage.validateLastName(FrameworkConfigFactory.getConfig().petParentLastName()),
        "Validating Last Name of the pet owner");
    Assert.assertTrue(
        goodFriendHomePage.validatePhoneNumber(
            FrameworkConfigFactory.getConfig().petParentPhoneNumber()),
        "Validating Phone Number of the pet owner");
    Assert.assertTrue(
        goodFriendHomePage.validatePassword(
            FrameworkConfigFactory.getConfig().petParentNewPassword()),
        "Validating Password of the pet owner");
  }
}
