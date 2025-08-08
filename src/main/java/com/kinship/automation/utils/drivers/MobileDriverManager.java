package com.kinship.automation.utils.drivers;

import io.appium.java_client.AppiumDriver;

public class MobileDriverManager {

  private static final ThreadLocal<AppiumDriver> driver = new ThreadLocal<>();

  private MobileDriverManager() {}

  public static AppiumDriver getDriver() {
    return driver.get();
  }

  public static void setDriver(AppiumDriver appiumDriver) {
    MobileDriverManager.driver.set(appiumDriver);
  }

  public static void unload() {
    MobileDriverManager.driver.get().quit();
    driver.remove();
  }
}
