package com.kinship.automation.contracts;

public interface Login {

  boolean isVisble(int timeoutInSeconds);

  void login(String username, String password);

  void enterPassword(String password);

  boolean isPasswordMasked();

  void clickEyeIcon();

  boolean isPasswordVisible();

  String getErrorMessage();

  boolean isRegisterLinkDisplayed();

  void clickRegisterLink();

  void restartApp();
}
