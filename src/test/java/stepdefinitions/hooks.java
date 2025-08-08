package stepdefinitions;

import com.kinship.automation.pageobjects.web.GoodFriendBasePage;
import com.kinship.automation.utils.commonutils.AppiumHelper;
import com.kinship.automation.utils.commonutils.TestDriver;
import com.kinship.automation.utils.drivers.KinshipDriver;
import com.kinship.automation.utils.drivers.MobileDriverManager;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class hooks {
  private TestDriver testDriver;
  private GoodFriendBasePage goodFriendBasePage;
  private AppiumHelper appiumHelper;

  @Before
  public void setUp(Scenario scenario) {
    KinshipDriver.getInstance().setUpMobileDriver();
    //  KinshipDriver.getInstance().setUpMobileDriver();
    AppiumDriver appiumDriver = MobileDriverManager.getDriver();
    //  WebDriver driver = DriverManager.getDriver();
    // You must manually initialize this because TestNG annotations won't run
    appiumHelper = new AppiumHelper(appiumDriver);
    // testDriver = new TestDriver(appiumDriver);
    //  goodFriendBasePage = new GoodFriendBasePage(testDriver);
  }

  @After
  public void tearDown(Scenario scenario) {

    //	WebDriver driver = DriverManager.getDriver();
    AppiumDriver driver = MobileDriverManager.getDriver();
    if (driver != null && driver instanceof TakesScreenshot) {
      byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
      String status = scenario.isFailed() ? "Failure Screenshot" : "Passed Screenshot";
      scenario.attach(screenshot, "image/png", status);
    }

    KinshipDriver.getInstance().tearDownDriver(); // Proper cleanup
  }
}
