package stepdefinitions;


import com.kinship.automation.contracts.Profile;
import com.kinship.automation.mobilescreens.AndroidLoginScreen;
import com.kinship.automation.mobilescreens.ProfileScreen;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class ProfileSteps {

    private static final Logger log = LogManager.getLogger(LoginSteps.class);
    protected Profile profile;


    public ProfileSteps() {
        AppiumDriver appiumDriver = MobileDriverManager.getDriver();
        profile = new ProfileScreen(appiumDriver, new AppiumHelper(appiumDriver));
    }

    @Given("^the user logged out of the app$")
    public void the_user_logged_out_of_the_app() {
        log.info("user logged out of the app.....");
        profile.clicksProfileButton();
        profile.clickLogOutButton();
    }
}
