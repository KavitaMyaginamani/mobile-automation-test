package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CancelBookAppointmentForPetParent extends WebBaseTest {

  // Added by Priya
  // appointment can not be cancelled for backdated booking.
  @TestRails(id = "C1013947")
  @Description("Test to Cancel Book Appointment for Pet Parent")
  @Test(
      groups = {"P0", "Regression"},
      priority = 1,
      retryAnalyzer = Retry.class)
  @Feature("Cancelling Booking of  Pet Owner")
  public void testCancelBookAppointmentFromPetParent() throws Exception {
    log.info(" Starting test case to Cancel Booking of  Pet Owner ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    goodFriendHomePage.clickCancelAppointment();
    Assert.assertTrue(
        goodFriendHomePage.verifyCancelledAppointment(), " Cancellation Booking is failed");
    log.info(" Successfully executed test case to Cancel booking ");
  }
}
