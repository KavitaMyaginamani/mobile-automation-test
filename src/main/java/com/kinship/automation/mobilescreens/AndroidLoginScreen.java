package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.Login;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;


public class AndroidLoginScreen implements Login {

  protected AppiumDriver appiumDriver;
  protected AppiumHelper appiumHelper;
  protected AndroidDriver androidDriver;
  private By uniquePageLocator = By.xpath("//android.widget.TextView[@text='Login']");
  private String usernameField =
      "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[1]";
  private String passwordField =
      "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]";
  private String loginButton = "//android.widget.TextView[@text='LOGIN']";
  private String errorMessage = "//android.widget.Toast";

  public AndroidLoginScreen(AppiumDriver appiumDriver, AppiumHelper appiumHelper) {
    this.appiumDriver = appiumDriver;
    this.appiumHelper = appiumHelper;
    androidDriver = (AndroidDriver) appiumDriver;
  }

  @Override
  public boolean isVisble(int timeoutInSeconds) {
    return appiumHelper.isElementVisible(uniquePageLocator, 50);
  }

  @Override
  public void login(String username, String password) {
    appiumDriver.findElement(By.xpath(usernameField)).sendKeys(username);
    appiumDriver.findElement(By.xpath(passwordField)).sendKeys(password);
    appiumDriver.findElement(By.xpath(loginButton)).click();
  }

  @Override
  public String getErrorMessage() {
    try {
      // Use polling wait to avoid StaleElementReferenceException
      Wait<AppiumDriver> fluentWait = new FluentWait<>(appiumDriver)
              .withTimeout(Duration.ofSeconds(3))
              .pollingEvery(Duration.ofMillis(200))
              .ignoring(NoSuchElementException.class)
              .ignoring(StaleElementReferenceException.class);

      MobileElement toast = (MobileElement) fluentWait.until(driver ->
              driver.findElement(By.xpath(errorMessage))
      );
      return toast.getText();
    } catch (Exception e) {
      System.out.println("Toast not found: " + e.getMessage());
      return "";
    }
  }

  @Override
  public void restartApp() {
   String appPackage = "com.example.dummyinvestmentbankingapp"; // Replace with your app's actual package name
//
    // Kill the app
    if (appiumDriver.isAppInstalled(appPackage)) {
      appiumDriver.terminateApp(appPackage);
    }
    // Restart the app
    appiumDriver.activateApp(appPackage);

  }
}