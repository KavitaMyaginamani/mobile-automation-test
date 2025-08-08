package com.kinship.automation.contracts;

public interface OtpVerification {

  boolean isAuthenticationScreenDisplayed();

  void enterOTP(String otp);

  void clickContinueButton();
}
