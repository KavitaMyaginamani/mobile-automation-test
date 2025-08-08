package com.kinship.automation.base;

import com.kinship.automation.utils.commonutils.ActionHelper;
import com.kinship.automation.utils.commonutils.AndroidHelper;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class BaseScreen {

  protected AppiumDriver appiumDriver;
  protected ActionHelper actionHelper;
  protected AppiumHelper appiumHelper;
  protected AndroidHelper androidHelper;
  protected AndroidDriver androidDriver;

  public BaseScreen(AppiumDriver appiumDriver, AndroidDriver androidDriver) {
    this.appiumDriver = appiumDriver;
    this.androidDriver = androidDriver;

    // Initialize all helper classes with the driver
    this.actionHelper = new ActionHelper(appiumDriver);
    this.appiumHelper = new AppiumHelper(appiumDriver);
    this.androidHelper = new AndroidHelper(androidDriver);
  }
}
