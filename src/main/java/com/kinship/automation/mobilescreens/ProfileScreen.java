package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.Profile;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class ProfileScreen implements Profile {

    private String profileButton = "//android.widget.TextView[@text='Profile']";
    private String logOutButton = "//android.widget.Button";
    protected AppiumDriver appiumDriver;
    protected AppiumHelper appiumHelper;



public ProfileScreen(AppiumDriver appiumDriver,  AppiumHelper appiumHelper) {
    this.appiumDriver = appiumDriver;
    this.appiumHelper = appiumHelper;

}

    @Override
    public void clicksProfileButton() {
        appiumDriver.findElement(By.xpath(profileButton)).click();

    }

    @Override
    public boolean isProfileScreenDisplayed() {
        return appiumHelper.isElementVisible(By.xpath(profileButton),5);
    }

    @Override
    public void clickLogOutButton() {
        appiumDriver.findElement(By.xpath(logOutButton)).click();
    }
}
