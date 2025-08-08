package com.kinship.automation.base;

import com.kinship.automation.pageobjects.web.GoodFriendBasePage;
import com.kinship.automation.pageobjects.web.GoodFriendPage;
import com.kinship.automation.utils.commonutils.TestDriver;
import com.kinship.automation.utils.drivers.DriverManager;
import com.kinship.automation.utils.drivers.KinshipDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class WebBaseTest extends BaseTest {

  public TestDriver testDriver;

  public GoodFriendBasePage goodFriendBasePage;

  protected GoodFriendPage goodFriendHomePage;

  protected final Logger log = LogManager.getLogger(WebBaseTest.class);

  @BeforeMethod
  public void beforeMethod() {
    // Step 1: Set up the WebDriver via KinshipDriver
    KinshipDriver.getInstance().setUpBrowserDriver(); // this sets DriverManager.getDriver()

    // Step 2: Now safely pass it to TestDriver
    testDriver = new TestDriver(DriverManager.getDriver());

    // Step 3: Then initialize page objects
    goodFriendBasePage = new GoodFriendBasePage(testDriver);
  }

  @AfterMethod
  public void afterSuite() {
    KinshipDriver.getInstance().tearDownDriver();
  }
}
