package com.kinship.automation.utils.commonutils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

public class AndroidHelper {

  protected AndroidDriver<AndroidElement> androidDriver;

  public AndroidHelper(AndroidDriver<AndroidElement> androidDriver) {
    this.androidDriver = androidDriver;
  }

  public void scrollToText(String text) {
    androidDriver.findElementByAndroidUIAutomator(
        "new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
  }

  public void tapByText(String text) {
    MobileElement el = androidDriver.findElement(By.xpath("//*[@text='" + text + "']"));
    el.click();
  }
}
