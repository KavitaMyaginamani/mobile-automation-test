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
}
