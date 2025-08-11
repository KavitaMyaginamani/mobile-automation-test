package stepdefinitions;

import com.kinship.automation.contracts.Login;
import com.kinship.automation.contracts.OtpVerification;
import com.kinship.automation.mobilescreens.OtpVerificationScreen;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import static com.kinship.automation.utils.commonutils.Utils.getValuesFromPropertiesFile;

public class OtpVerificationSteps {
    private static final Logger log = LogManager.getLogger(LoginSteps.class);
    protected OtpVerification otpVerification;

    public OtpVerificationSteps() {
        AppiumDriver appiumDriver = MobileDriverManager.getDriver();
        otpVerification = new OtpVerificationScreen(appiumDriver, new AppiumHelper(appiumDriver));
    }

    @Then("user is navigated to the OTP verification screen")
    public void user_is_navigated_to_otp_verification_screen() {
        log.info("Navigating to otp verification screen...");
        boolean actual = otpVerification.isAuthenticationScreenDisplayed();
        String reasonForFailure = "OTP Verification screen is not visible.";
        Assert.assertTrue(actual, reasonForFailure);
    }

    @When("user enters the OTP")
    public void user_enters_the_OTP() {
        log.info("Entering OTP...");
        String otp = getValuesFromPropertiesFile("testdata", "otp");
        otpVerification.enterOTP(otp);
    }

    @Then("user taps the continue button")
    public void user_taps_the_continue_button() {
        otpVerification.clickContinueButton();
    }
}
