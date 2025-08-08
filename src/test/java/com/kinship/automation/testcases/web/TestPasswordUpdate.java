package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

/**
 * @author priya.mishra01 @Date 20-06-2022
 */
public class TestPasswordUpdate extends WebBaseTest {

  // Added by Ganesh
  @TestRails(id = "C1014106")
  @Description("Test to Book Appointment for Pet Parent")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("Appointment Booking of  Pet Owner")
  public void testPetParentUpdatePassword() throws Exception {
    log.info(" Starting test case to validate Booked Appointment ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    goodFriendHomePage.updateExistPassword(
        FrameworkConfigFactory.getConfig().currentpassword(),
        FrameworkConfigFactory.getConfig().newpassword());
    Thread.sleep(20000);
  }
}
