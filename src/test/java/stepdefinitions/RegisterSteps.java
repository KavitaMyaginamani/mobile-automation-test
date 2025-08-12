package stepdefinitions;

import com.kinship.automation.contracts.Register;
import com.kinship.automation.mobilescreens.AndroidLoginScreen;
import com.kinship.automation.mobilescreens.RegisterScreen;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

public class RegisterSteps {
    private static final Logger log = LogManager.getLogger(LoginSteps.class);
    protected Register register;

    public RegisterSteps(){
        AppiumDriver appiumDriver = MobileDriverManager.getDriver();
        register = new RegisterScreen(appiumDriver, new AppiumHelper(appiumDriver));
    }

    @Given("^the Register Page should be displayed$")
    public void the_Register_Page_should_be_displayed() {
        log.info("landing on register page...");
        boolean actual = register.isRegisterPageDisplayed();
        boolean expected = true;
        Assert.assertEquals(actual, expected, "Register page is not displayed");
    }

    @When("^the user clicks the Back button on the Register Page$")
    public void theUser_clicks_the_Back_button_on_the_Register_Page() {
        register.clickBackButton();
    }


}
