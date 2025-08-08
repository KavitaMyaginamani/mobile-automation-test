package com.kinship.automation.pageobjects.web;

import com.kinship.automation.utils.commonutils.TestDriver;
import io.qameta.allure.Step;

public class GoodFriendBasePage {

  protected TestDriver driver;

  public GoodFriendBasePage() {}

  public GoodFriendBasePage(TestDriver driver) {
    this.driver = driver;
  }

  @Step("Navigating to home url")
  public GoodFriendPage navigateToGoodFriendHomePage(String url) {
    driver.navigateTo(url);
    return new GoodFriendPage(driver);
  }

  @Step("Navigating to home url")
  public GoodFriendPage navigateToGoodFriendEventPage(String url) {
    driver.navigateTo(url + "provider/events");
    return new GoodFriendPage(driver);
  }

  @Step("Login to Goodfriend")
  public GoodFriendPage login(String url) {
    driver.navigateTo(url);
    return new GoodFriendPage(driver);
  }
}
