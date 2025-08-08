package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.Login;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class AndroidLoginScreen implements Login {

  protected AppiumDriver appiumDriver;
  //  protected AndroidDriver androidDriver;
  protected AppiumHelper appiumHelper;
  private By uniquePageLocator = By.xpath("//android.widget.TextView[@text='Login']");
  // private String usernameField = "//android.widget.TextView[@text='Username']";
  private String usernameField =
      "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[1]";

  // private String passwordField = "//android.widget.TextView[@text='Password']";
  private String passwordField =
      "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.widget.EditText[2]";
  // private String usernameField = "Username";
  private String loginButton = "//android.widget.TextView[@text='LOGIN']";

  public AndroidLoginScreen(AppiumDriver appiumDriver, AppiumHelper appiumHelper) {
    this.appiumDriver = appiumDriver;
    this.appiumHelper = appiumHelper;
    //      this.androidDriver = androidDriver;
  }

  @Override
  public boolean isVisble(int timeoutInSeconds) {
    //
    return appiumHelper.isElementVisible(uniquePageLocator, 50);

    // return appiumHelper.isElementVisible(uniquePagelocator,15);
  }

  @Override
  public void login(String username, String password) {
    // appiumDriver.findElement(By.xpath(usernameField)).click();
    appiumDriver.findElement(By.xpath(usernameField)).sendKeys(username);

    // appiumDriver.findElementByAndroidUIAutomator(uiAutomatorString);
    // appiumHelper.findElementByText(appiumDriver,usernameField).sendKeys(username);
    appiumDriver.findElement(By.xpath(passwordField)).sendKeys(password);
    appiumDriver.findElement(By.xpath(loginButton)).click();
    // appiumDriver.fin
  }
}

//    public AndroidLoginScreen getAndroidLoginScreen() {
//          //     retur
//
//    }
