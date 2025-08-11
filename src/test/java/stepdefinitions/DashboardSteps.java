package stepdefinitions;

import com.kinship.automation.contracts.Dashboard;
import com.kinship.automation.mobilescreens.DashboardScreen;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class DashboardSteps {

    private Dashboard dashboard;
    private static final Logger log = LogManager.getLogger(LoginSteps.class);

    public DashboardSteps() {
        AppiumDriver appiumDriver = MobileDriverManager.getDriver();
        dashboard = new DashboardScreen(appiumDriver, new AppiumHelper(appiumDriver));
    }

    @Given("user should be redirected to dashboard")
    public void user_should_be_redirected_to_dashboard() {
        log.info("Navigating to Dashboard page... ");
        boolean actual = dashboard.isDashboardScreenVisible();
        String reasonForFailure = "Dashboard page is not visible.";
        Assert.assertTrue(actual, reasonForFailure);
    }
}
