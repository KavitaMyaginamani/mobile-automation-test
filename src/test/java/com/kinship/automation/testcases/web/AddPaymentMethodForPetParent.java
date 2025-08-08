package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddPaymentMethodForPetParent extends WebBaseTest {

  // added by Ganesh
  @TestRails(id = "C1013945")
  @Description("Test to Add payment Method for Pet Parent")
  @Test(
      groups = {"P0", "Regression"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Test to Add payment Method for Pet Parent")
  public void testAddPaymentMethodForPetParent() {
    log.info(" Starting Test to Add payment Method for Pet Parent ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    goodFriendHomePage.clickAddPaymentMethod(
        FrameworkConfigFactory.getConfig().cardNo1(),
        FrameworkConfigFactory.getConfig().cardNo2(),
        FrameworkConfigFactory.getConfig().cardNo3(),
        FrameworkConfigFactory.getConfig().cardNo4(),
        FrameworkConfigFactory.getConfig().expdate(),
        FrameworkConfigFactory.getConfig().cvvzip(),
        FrameworkConfigFactory.getConfig().CardName());
    Assert.assertTrue(goodFriendHomePage.verifyCardAddedorNot(), "Card Not Added Successfully");
    log.info(" successfully executed to Add payment Method for Pet Parent ");
    // goodFriendHomePage.searchbyLocationandService(FrameworkConfigFactory.getConfig().searchedCityName(),FrameworkConfigFactory.getConfig().serviceName());
  }
}
