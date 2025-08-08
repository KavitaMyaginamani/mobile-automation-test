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

  @Given("user is on login page")
  @Feature("Test to Add payment Method for Pet Parent")
  public void user_is_on_login_page() {
    System.out.println("Navigating to login page...");
    log.info("Navigating to login page... ");

    boolean actual = login.isVisble(10);
    String reasonForFailure = "Login page is not visible.";
    Assert.assertTrue(actual, reasonForFailure);
  }

  @When("user enters valid credentials")
  public void user_enters_valid_credentials() {
    System.out.println("Entering credentials...");
    String username = getValuesFromPropertiesFile("testdata", "username");
    String password = getValuesFromPropertiesFile("testdata", "password");
    login.login(username, password);
  }

  @Then("user is on otp verification screen")
  public void use_can_see_authentication_screen() {
    boolean actual = otpVerification.isAuthenticationScreenDisplayed();
    String reasonForFailure = "OTP Verification screen is not visible.";
    Assert.assertTrue(actual, reasonForFailure);
  }

  @When("user enters the OTP")
  public void user_enters_the_OTP() {
    System.out.println("Entering OTP...");
    String otp = getValuesFromPropertiesFile("testdata", "otp");
    otpVerification.enterOTP(otp);
  }

  @Then("user taps on continue button")
  public void user_taps_on_continue_button() {
    otpVerification.clickContinueButton();
  }

  @Then("user should be redirected to dashboard")
  public void user_should_be_redirected_to_dashboard() {
    System.out.println("Redirected to dashboard.");
  }
}
