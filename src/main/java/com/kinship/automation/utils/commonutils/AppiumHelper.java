package com.kinship.automation.utils.commonutils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AppiumHelper {

  protected AppiumDriver appiumDriver;
  protected AndroidDriver androidDriver;

  //  protected By uniquePageLocator;

  public AppiumHelper(AppiumDriver appiumdriver) {
    this.appiumDriver = appiumdriver;
    this.androidDriver = (AndroidDriver) appiumdriver;
  }

  public boolean isElementVisible(By locator, int timeoutInSeconds) {
    try {
      WebDriverWait wait = new WebDriverWait(appiumDriver, timeoutInSeconds);
      // By uniquePageLocator;
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      return true;
    } catch (Exception e) {
      return false;
    }
  }

  public WebElement waitForElement(By locator, int timeoutInSeconds) {
    WebDriverWait wait = new WebDriverWait(appiumDriver, timeoutInSeconds);
    return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
  }

  public void click(By locator) {
    waitForElement(locator, 10).click();
  }

  public MobileElement findElementByText(AppiumDriver<MobileElement> driver, String visibleText) {
    String xpath = String.format("//*[@text='%s']", visibleText);
    return driver.findElement(By.xpath(xpath));
  }

  public MobileElement findElementByTextUIAutomator(
      AndroidDriver<MobileElement> driver, String visibleText) {
    String uiAutomatorString = String.format("new UiSelector().text(\"%s\")", visibleText);
    return driver.findElementByAndroidUIAutomator(uiAutomatorString);
  }
}
