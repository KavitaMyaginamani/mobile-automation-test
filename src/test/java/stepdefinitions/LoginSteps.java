package stepdefinitions;

import static com.kinship.automation.utils.commonutils.Utils.getValuesFromPropertiesFile;

import com.kinship.automation.contracts.Login;
import com.kinship.automation.contracts.OtpVerification;
import com.kinship.automation.mobilescreens.AndroidLoginScreen;
import com.kinship.automation.mobilescreens.OtpVerificationScreen;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;
import io.qameta.allure.Feature;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class LoginSteps {

  private static final Logger log = LogManager.getLogger(LoginSteps.class);
  protected Login login;
  protected OtpVerification otpVerification;


  public LoginSteps() {
    AppiumDriver appiumDriver = MobileDriverManager.getDriver();
    login = new AndroidLoginScreen(appiumDriver, new AppiumHelper(appiumDriver));
    otpVerification = new OtpVerificationScreen(appiumDriver, new AppiumHelper(appiumDriver));
  }

  @Given("user is on the login page")
  public void user_is_on_the_login_page() {
   log.info("Navigating to login page... ");
    boolean actual = login.isVisble(40);
    String reasonForFailure = "Login page is not visible.";
    Assert.assertTrue(actual, reasonForFailure);
  }

  @When("user enters valid credentials")
  public void user_enters_valid_credentials() {
    log.info("Entering credentials...");
    String username = getValuesFromPropertiesFile("testdata", "username");
    String password = getValuesFromPropertiesFile("testdata", "password");
    login.login(username, password);
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
