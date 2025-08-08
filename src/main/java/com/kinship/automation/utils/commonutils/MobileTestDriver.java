package com.kinship.automation.utils.commonutils;

import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MobileTestDriver {

  private AppiumDriver<MobileElement> appiumDriver;
  private WebDriverWait wait;
  private static final Duration SCROLL_DUR = Duration.ofMillis(1000);
  private static final double SCROLL_RATIO = 0.8;
  private static final int SCROLL_DIVISOR = 3;
  private final long explicitWait = 10;

  public MobileTestDriver(AppiumDriver<MobileElement> appiumdriver) {
    this.appiumDriver = appiumDriver;
    System.out.println("Driver initialized: " + (appiumDriver != null));
  }

  public MobileElement findElement(By by) {
    return appiumDriver.findElement(by);
  }

  public List<MobileElement> findElements(By by) {
    return appiumDriver.findElements(by);
  }

  public void clickLocator(By by, int timeOutInSeconds) {
    wait = new WebDriverWait(this.appiumDriver, timeOutInSeconds);
    wait.until(ExpectedConditions.elementToBeClickable(by)).click();
  }

  public void clickLocator(By by) {
    clickLocator(by, (int) explicitWait);
  }

  public MobileElement waitForElementToBeClickable(By by, int timeOutInSeconds) {
    MobileElement element =
        (MobileElement)
            new WebDriverWait(MobileDriverManager.getDriver(), timeOutInSeconds)
                .until(ExpectedConditions.elementToBeClickable(by));
    return element;

    //            MobileElement element= new WebDriverWait(driver, timeOutInSeconds);
    //                  element.until(ExpectedConditions.elementToBeClickable(by));
  }

  public MobileElement waitForElementToBeVisible(By by, int timeOutInSeconds) {
    return (MobileElement)
        new WebDriverWait(MobileDriverManager.getDriver(), timeOutInSeconds)
            .until(ExpectedConditions.visibilityOfElementLocated(by));
  }

  public MobileElement waitForElementToBePresent(By by, int timeOutInSeconds) {
    return (MobileElement)
        new WebDriverWait(this.appiumDriver, timeOutInSeconds)
            .until(ExpectedConditions.presenceOfElementLocated(by));
  }

  public void waitForElementStaleness(MobileElement element, int timeOutInSeconds) {
    new WebDriverWait(appiumDriver, timeOutInSeconds)
        .until(ExpectedConditions.stalenessOf(element));
  }

  public void scrollDown() {
    Dimension size = appiumDriver.manage().window().getSize();
    int startY = (int) (size.height * SCROLL_RATIO);
    int endY = (int) (size.height / SCROLL_DIVISOR);
    int centerX = size.width / 2;

    new TouchAction<>(appiumDriver)
        .press(PointOption.point(centerX, startY))
        .waitAction(WaitOptions.waitOptions(SCROLL_DUR))
        .moveTo(PointOption.point(centerX, endY))
        .release()
        .perform();
  }

  public MobileElement waitForElement(By by) {
    WebDriverWait wait = new WebDriverWait(appiumDriver, explicitWait);
    wait.until(ExpectedConditions.presenceOfElementLocated(by));
    return (MobileElement) wait.until(ExpectedConditions.visibilityOfElementLocated(by));
  }

  public boolean checkForElement(By by) {
    try {
      WebDriverWait shortWait = new WebDriverWait(appiumDriver, explicitWait);
      MobileElement element =
          (MobileElement) shortWait.until(ExpectedConditions.visibilityOfElementLocated(by));
      return element.isDisplayed();
    } catch (Exception e) {
      return false;
    }

    //        public void swipeToElement(By by, ScrollDirection direction, int maxSwipes, int
    // waitBetweenSwipesSeconds) {
    //            int swipeCount = 0;
    //            while (swipeCount < maxSwipes) {
    //                try {
    //                    WebDriverWait wait = new WebDriverWait(MobileDriverManager.getDriver(),
    // 2);
    //                    MobileElement element = (MobileElement)
    // wait.until(ExpectedConditions.presenceOfElementLocated(by));
    //                    if (element.isDisplayed()) {
    //                        return; // 🎉 Found the element
    //                    }
    //                } catch (TimeoutException e) {
    //                    // Element not found yet — keep swiping
    //                }
    //                swipe(direction);
    //                pauseExecutionFor(waitBetweenSwipesSeconds);
    //                swipeCount++;
    //            }
    //            throw new NoSuchElementException("Could not find element after " + maxSwipes + "
    // swipes.");
    //        }

  }
}
