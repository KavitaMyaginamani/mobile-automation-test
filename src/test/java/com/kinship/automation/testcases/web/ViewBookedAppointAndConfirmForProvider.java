package com.kinship.automation.testcases.web;

import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.annotations.Test;

public class ViewBookedAppointAndConfirmForProvider extends WebBaseTest {

  // run after appointment has been successfully booked.
  // Added by Priya
  @TestRails(id = "C1013946")
  @Description(
      "Test to View Customer Appointment from Pet Owner and Confirm Appointment from Business Owner")
  @Test(
      groups = {"P0", "Regression"},
      priority = 3,
      retryAnalyzer = Retry.class)
  @Feature("Cancelling Booking of  Pet Owner")
  public void testViewAllCustomerAppointment() throws Exception {
    log.info(
        " Starting test case to validate View Customer Appointment from Pet Owner and Confirm Appointment from Business Owner  ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    goodFriendHomePage.viewCustomerAppointmentList();
    // testDriver.windowScroll();
    goodFriendHomePage.Logout();
    goodFriendHomePage.loginAsBusinessOwner();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().businessOwnerEmail(),
        FrameworkConfigFactory.getConfig().businessOwnerPassword());
    goodFriendHomePage.viewAppointmentandConfirm();
    goodFriendHomePage.testCheckinAppointment();
    goodFriendHomePage.testviewCheckInAppointment();
    log.info(
        " Successfully executed test case to validate View Customer Appointment from Pet Owner and Confirm Appointment from Business Owner  ");
  }
}
