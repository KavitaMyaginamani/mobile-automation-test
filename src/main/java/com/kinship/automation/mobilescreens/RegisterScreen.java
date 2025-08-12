package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.Register;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RegisterScreen implements Register {

    private String registerTitle = "//android.widget.TextView[@text='USER REGISTRATION']";
    private String backButton = "//android.view.View[@content-desc='Back']";

    protected AppiumDriver appiumDriver;
    protected AppiumHelper appiumHelper;
    public RegisterScreen(AppiumDriver appiumDriver, AppiumHelper appiumHelper) {
        this.appiumDriver = appiumDriver;
        this.appiumHelper = appiumHelper;

    }

    public boolean isRegisterPageDisplayed() {
        return appiumHelper.isElementVisible(By.xpath(registerTitle),5);
    }

    @Override
    public void clickBackButton() {
        appiumDriver.findElement(By.xpath(backButton)).click();
    }
}
