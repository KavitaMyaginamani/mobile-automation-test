package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.OtpVerification;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

public class OtpVerificationScreen implements OtpVerification {

  protected AppiumDriver appiumDriver;
  protected AppiumHelper appiumHelper;
  private final String otpScreen = "//android.widget.TextView[@text='OTP Verification']";
  private final String continueButton = "//androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
  private final String otpInputBoxes = "android.widget.EditText";

  public OtpVerificationScreen(AppiumDriver appiumDriver, AppiumHelper appiumHelper) {
    this.appiumDriver = appiumDriver;
    this.appiumHelper = appiumHelper;
  }

  @Override
  public boolean isAuthenticationScreenDisplayed() {
    return appiumHelper.isElementVisible(By.xpath(otpScreen), 50);
  }

  @Override
    public void enterOTP(String otp) {
    try {
      Thread.sleep(10000); // 20 seconds
    } catch (InterruptedException e) {
      e.printStackTrace(); // or handle it properly
    }
      List<MobileElement> otpBoxes = appiumDriver.findElements(By.className(otpInputBoxes));
      otpBoxes.get(1).sendKeys(String.valueOf(otp.charAt(0)));
      otpBoxes.get(2).sendKeys(String.valueOf(otp.charAt(1)));
      otpBoxes.get(3).sendKeys(String.valueOf(otp.charAt(2)));
      otpBoxes.get(4).sendKeys(String.valueOf(otp.charAt(3)));
  }

  @Override
  public void clickContinueButton() {
    appiumDriver.findElement(By.xpath(continueButton)).click();
  }
}
