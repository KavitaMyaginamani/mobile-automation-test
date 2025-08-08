package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.OtpVerification;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OtpVerificationScreen implements OtpVerification {

  protected AppiumDriver appiumDriver;
  protected AppiumHelper appiumHelper;
  private String otpScreen = "//android.widget.TextView[@text='OTP Verification']";
  private final String otpBox1 = "";
  private final String otpBox2 = "";
  private final String otpBox3 = "";
  private final String otpBox4 = "";
  private final String continueButton = "";

  public OtpVerificationScreen(AppiumDriver appiumDriver, AppiumHelper appiumHelper) {
    this.appiumDriver = appiumDriver;
    this.appiumHelper = appiumHelper;

    PageFactory.initElements(appiumDriver, this);
  }

  @FindBy(xpath = otpBox1)
  private MobileElement otpInput1;

  @FindBy(xpath = otpBox2)
  private MobileElement otpInput2;

  @FindBy(xpath = otpBox3)
  private MobileElement otpInput3;

  @FindBy(xpath = otpBox4)
  private MobileElement otpInput4;

  @Override
  public boolean isAuthenticationScreenDisplayed() {
    return appiumHelper.isElementVisible(By.xpath(otpScreen), 30);
  }

  @Override
  public void enterOTP(String otp) {
    otpInput1.sendKeys(String.valueOf(otp.charAt(0)));
    otpInput2.sendKeys(String.valueOf(otp.charAt(1)));
    otpInput3.sendKeys(String.valueOf(otp.charAt(2)));
    otpInput4.sendKeys(String.valueOf(otp.charAt(3)));
  }

  @Override
  public void clickContinueButton() {
    appiumDriver.findElement(By.xpath(continueButton)).click();
  }
}
