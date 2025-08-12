package stepdefinitions;

import static com.kinship.automation.utils.commonutils.Utils.getValuesFromPropertiesFile;

import com.kinship.automation.contracts.Login;
import com.kinship.automation.mobilescreens.AndroidLoginScreen;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class LoginSteps {

  private static final Logger log = LogManager.getLogger(LoginSteps.class);
  protected Login login;


  public LoginSteps() {
    AppiumDriver appiumDriver = MobileDriverManager.getDriver();
    login = new AndroidLoginScreen(appiumDriver, new AppiumHelper(appiumDriver));
  }

  @Given("user is on the login page")
  @Then("the Login Page should be displayed")
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

  @When("^the user enters (.*) username and (.*) password$")
        public void enterUsernameAndPassword(String usernameStatus, String passwordStatus) {
            String username;
            String password;

            switch (usernameStatus.toLowerCase()) {
                case "valid":
                    username = getValuesFromPropertiesFile("testdata", "validUser");
                    break;
                case "invalid":
                    username = getValuesFromPropertiesFile("testdata", "invalidUser");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid username status: " + usernameStatus);
            }

            switch (passwordStatus.toLowerCase()) {
                case "valid":
                    password = getValuesFromPropertiesFile("testdata", "validPass");
                    break;
                case "invalid":
                    password = getValuesFromPropertiesFile("testdata", "invalidPass");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid password status: " + passwordStatus);
            }
            login.login(username, password);
        }

    @Then("^the user should see the appropriate error message$")
    public void the_user_should_see_the_appropriate_error_message() {
     String actual = login.getErrorMessage();
     String expected = "Invalid credentials";
     String reasonForFailure = "error message is not displayed.";
     Assert.assertEquals(actual, expected, reasonForFailure);
  }

  @When("^the user restarts the app$")
    public void the_user_restarts_the_app() {
      login.restartApp();
  }

  @Then("^user sees Register Link on the Login page$")
    public void user_sees_Register_Link_on_the_Login_page() {
     boolean actual = login.isRegisterLinkDisplayed();
     boolean expected = true;
     Assert.assertEquals(actual, expected, "Register link is not displayed.");
  }

  @When("^the user clicks on Register link$")
    public void the_user_clicks_on_Register_link() {
      login.clickRegisterLink();
  }

  @When("the user enters a password in the password field")
    public void the_user_enters_a_Password_in_the_password_field() {
      String password = getValuesFromPropertiesFile("testdata", "password");
      login.enterPassword(password);
  }

  @Then("the password should be masked")
    public void the_password_should_be_masked() {
      boolean actual = login.isPasswordMasked();
      boolean expected = true;
      Assert.assertEquals(actual, expected, "Password shown is not masked.");
  }

  @When("the user clicks the eye icon")
    public void the_user_clicks_the_eye_icon() {
      login.clickEyeIcon();
  }

  @Then("the password should be visible")
    public void the_password_should_be_visible() {
      boolean actual = login.isPasswordVisible();
      boolean expected = true;
      Assert.assertEquals(actual, expected, "Password visible is not visible");
  }
    }

