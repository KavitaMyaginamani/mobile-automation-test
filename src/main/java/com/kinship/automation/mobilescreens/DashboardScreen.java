package com.kinship.automation.mobilescreens;

import com.kinship.automation.contracts.Dashboard;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;


public class DashboardScreen implements Dashboard {

    protected AppiumHelper appiumHelper;
    protected AppiumDriver appiumDriver;
    private String dashboardTitle = "(//android.widget.TextView[@text=\"Dashboard\"])[1]";

    public DashboardScreen(AppiumDriver appiumDriver,AppiumHelper appiumHelper) {
        this.appiumDriver = appiumDriver;
        this.appiumHelper = appiumHelper;
    }

    @Override
    public boolean isDashboardScreenVisible() {
        return appiumHelper.isElementVisible(By.xpath(dashboardTitle),20);
    }
}
