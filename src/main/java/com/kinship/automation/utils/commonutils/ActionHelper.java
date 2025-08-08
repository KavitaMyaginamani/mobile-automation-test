package com.kinship.automation.utils.commonutils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionHelper {
  protected AppiumDriver driver;

  public ActionHelper(AppiumDriver driver) {
    this.driver = driver;
  }

  public void swipe(Direction direction, int durationMs) {
    Dimension size = driver.manage().window().getSize();

    int startX, startY, endX, endY;
    startX = size.width / 2;
    startY = size.height / 2;

    switch (direction) {
      case UP:
        endX = startX;
        endY = startY - (size.height / 4);
        break;
      case DOWN:
        endX = startX;
        endY = startY + (size.height / 4);
        break;
      case LEFT:
        endX = startX - (size.width / 4);
        endY = startY;
        break;
      case RIGHT:
        endX = startX + (size.width / 4);
        endY = startY;
        break;
      default:
        throw new IllegalArgumentException("Unsupported swipe direction");
    }

    new TouchAction(driver)
        .press(PointOption.point(startX, startY))
        .waitAction(WaitOptions.waitOptions(Duration.ofMillis(durationMs)))
        .moveTo(PointOption.point(endX, endY))
        .release()
        .perform();
  }

  public enum Direction {
    UP,
    DOWN,
    LEFT,
    RIGHT
  }

  public boolean isElementVisible(By locator, int timeoutSeconds) {
    try {
      WebDriverWait wait = new WebDriverWait(driver, timeoutSeconds);
      wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
      return true;
    } catch (TimeoutException e) {
      return false;
    }
  }
}
