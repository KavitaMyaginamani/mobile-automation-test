package com.kinship.automation.testcases.web;

// import com.kinship.automation.utils.Retry;
import com.kinship.automation.base.WebBaseTest;
import com.kinship.automation.config.FrameworkConfigFactory;
import com.kinship.automation.utils.listeners.Retry;
import com.kinship.automation.utils.listeners.TestListener;
import com.kinship.automation.utils.testrail.TestRails;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import java.awt.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class VerifyGoodFriendTest extends WebBaseTest {

  private String testPetParentBookAppointment;

  @TestRails(id = "1010026")
  @Description("Test to verify good friend homepage header")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("HomePage Verification")
  public void testVerifyAGoodFriendHomePage() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to validate Home Page and login ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    Assert.assertTrue(
        goodFriendHomePage.isGoodFriendHeaderPresent(),
        "Verifying the presence of good friend header");
    // Assert.assertTrue(goodFriendHomePage.isSignUpLinkPresent(),"Verifying the presence of signup
    // link");
  }

  @TestRails(id = "1010029")
  @Description("Test to Search by city")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Search by city Verification")
  public void searchByCity() throws Exception {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to Search by city");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.searchByCity(FrameworkConfigFactory.getConfig().searchedCityName());
    Assert.assertTrue(
        goodFriendHomePage.verifySearchByCityResult(), "Failed to login as pet parent");
  }

  @TestRails(id = "1010030")
  @Description("Test to Search by services")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Search by city Verification")
  public void searchByServices() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to Search by city");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.searchByCity(FrameworkConfigFactory.getConfig().searchedCityName());
    goodFriendHomePage.searchByServices(FrameworkConfigFactory.getConfig().serviceName());
    Assert.assertTrue(
        goodFriendHomePage.verifySearchByServicesResult(
            FrameworkConfigFactory.getConfig().serviceName().toUpperCase()),
        "Failed to login as pet parent");
  }

  @TestRails(id = "1010031")
  @Description("Test to Search by business Name")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Search by business name Verification")
  public void searchByBusinessName() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to Search by business name");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.searchByBusinessName(
        FrameworkConfigFactory.getConfig().businessName(),
        FrameworkConfigFactory.getConfig().businessFullName());
    Assert.assertTrue(
        goodFriendHomePage.verifySearchByBusinessNameResult(
            FrameworkConfigFactory.getConfig().businessFullName()),
        "Failed to login as pet parent");
  }

  @TestRails(id = "1010027")
  @Description("Test to verify Pet Parent Login")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Pet Parent Login Verification")
  public void testVerifyPetParentLogin() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to validate Home Page and login ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    //
    // Assert.assertTrue(goodFriendHomePage.isPetParentLoggedIn(FrameworkConfigFactory.getConfig().petParentFullName()),"Failed to login as pet parent");
    goodFriendHomePage.Logout();
    Assert.assertTrue(goodFriendHomePage.verifyLogout(), "Failed to logout as pet parent");
  }

  @TestRails(id = "1010028")
  @Description("Test to verify Business Owner Login")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Business Owner Login Verification")
  public void testVerifyBusinessOwnerLogin() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to validate Home Page and login ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsBusinessOwner();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().businessOwnerEmail(),
        FrameworkConfigFactory.getConfig().businessOwnerPassword());
    //
    // Assert.assertTrue(goodFriendHomePage.isBusinessOwnerLoggedIn(FrameworkConfigFactory.getConfig().businessOwnerFullName()),"Failed to login as business owner");
    //        goodFriendHomePage.Logout();
    //        Assert.assertTrue(goodFriendHomePage.verifyLogout(),"Failed to logout as business
    // owner");
  }

  @TestRails(id = "1010028")
  @Description("Test to verify Business Owner Login")
  @Test(
      groups = {"P0", "BAT"},
      priority = 0,
      retryAnalyzer = Retry.class)
  @Feature("Business Owner Login Verification from list your business page")
  public void testVerifyBusinessOwnerLoginFromListYourBusinessPage() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to validate Home Page and login ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.clickListYourBusinessButton();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().businessOwnerEmail(),
        FrameworkConfigFactory.getConfig().businessOwnerPassword());
    // Assert.assertTrue(goodFriendHomePage.isBusinessOwnerLoggedIn(FrameworkConfigFactory.getConfig().businessOwnerFullName()),"Failed to login as business owner");
    // goodFriendHomePage.Logout();
    // Assert.assertTrue(goodFriendHomePage.verifyLogout(),"Failed to logout as business owner");
  }

  @TestRails(id = "1010036")
  @Description("Test to verify Create Pet Parent Login")
  @Test(
      groups = {"P0", "Regression"},
      priority = 1,
      retryAnalyzer = Retry.class)
  @Feature("Pet Parent Account Creation Verification")
  public void testVerifyCreatePetParent() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify Create Pet Parent Login");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmail(FrameworkConfigFactory.getConfig().newPetParentEmail());
    goodFriendHomePage.petOwnerDetails(
        FrameworkConfigFactory.getConfig().petParentFirstName(),
        FrameworkConfigFactory.getConfig().petParentLastName(),
        FrameworkConfigFactory.getConfig().petParentPhoneNumber(),
        FrameworkConfigFactory.getConfig().petParentNewPassword(),
        FrameworkConfigFactory.getConfig().petParentNewPassword());
    Assert.assertTrue(
        goodFriendHomePage.isPetParentLoggedIn(FrameworkConfigFactory.getConfig().newFullName()),
        "Failed to login as pet parent");
    goodFriendHomePage.Logout();
    Assert.assertTrue(goodFriendHomePage.verifyLogout(), "Failed to logout as pet parent");
  }

  @TestRails(id = "1010040")
  @Description("Test to verify Edit User Profile")
  @Test(
      groups = {"P0", "Regression"},
      priority = 1,
      retryAnalyzer = Retry.class)
  @Feature("verify Edit User Profile")
  public void testVerifyEditUserProfile() {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify Edit User Profile ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    goodFriendHomePage.editLastName(FrameworkConfigFactory.getConfig().newLastName());
    goodFriendHomePage.Logout();
    Assert.assertTrue(goodFriendHomePage.verifyLogout(), "Failed to logout as pet parent");
  }

  @TestRails(id = "1010037")
  @Description("Test to verify Add the Pet")
  @Test(
      groups = {"P0", "Regression"},
      priority = 1,
      retryAnalyzer = Retry.class)
  @Feature("verify Add the pet")
  public void testVerifyAddPet() throws AWTException {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify Edit User Profile ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.enterEmailAndClickSubmit(
        FrameworkConfigFactory.getConfig().petParentEmail(),
        FrameworkConfigFactory.getConfig().petParentPassword());
    goodFriendHomePage.clickMyPet();
    goodFriendHomePage.addPet(
        FrameworkConfigFactory.getConfig().petName(),
        FrameworkConfigFactory.getConfig().petType(),
        FrameworkConfigFactory.getConfig().petBirthDate(),
        FrameworkConfigFactory.getConfig().petBreed(),
        FrameworkConfigFactory.getConfig().petWeight(),
        FrameworkConfigFactory.getConfig().petGender());
    goodFriendHomePage.Logout();
    Assert.assertTrue(goodFriendHomePage.verifyLogout(), "Failed to logout as pet parent");
  }

  @TestRails(id = "1014020")
  @Description("Test to verify Terms Of Conditions")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("verify Terms Of Conditions")
  public void verifyTermsOfConditions() throws AWTException {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify terms of service page ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.clickTermsOfService();
    Assert.assertTrue(
        goodFriendHomePage.VerifyTermsOfServicePage(), "Failed to Open term of service page");
  }

  @TestRails(id = "1014025")
  @Description("Test to verify privacy policy page")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("verify privacy policy page")
  public void verifyPrivacyPolicyPageLanguageSelection() throws AWTException {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify terms of service page ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.clickPrivacyPolicy(FrameworkConfigFactory.getConfig().language());
  }

  @TestRails(id = "1014025")
  @Description("Test to verify privacy policy page")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("verify privacy policy page")
  public void verifyGoodFriendEventPage() throws AWTException {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify terms of service page ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendEventPage(FrameworkConfigFactory.getConfig().url());
    Assert.assertTrue(goodFriendHomePage.verifyGoodFriendEventPage(), "Failed to open event page");
  }

  @TestRails(id = "1014025")
  @Description("Test to verify privacy policy page")
  @Test(
      groups = {"P0", "Regression"},
      priority = 2,
      retryAnalyzer = Retry.class)
  @Feature("verify privacy policy page")
  public void verifyGoodFriendLandingPage() throws AWTException {
    System.out.println(FrameworkConfigFactory.getConfig().browser());
    System.out.println(FrameworkConfigFactory.getConfig().remoteType());
    log.info(" Starting test case to verify terms of service page ");
    goodFriendHomePage =
        goodFriendBasePage.navigateToGoodFriendHomePage(FrameworkConfigFactory.getConfig().url());
    goodFriendHomePage.loginAsPetParent();
    goodFriendHomePage.clickGoodFriendLogo();
    Assert.assertTrue(
        goodFriendHomePage.isGoodFriendHeaderPresent(),
        "Verifying the presence of good friend header");

    goodFriendHomePage.loginAsBusinessOwner();
    goodFriendHomePage.clickGoodFriendLogo();
    Assert.assertTrue(
        goodFriendHomePage.isGoodFriendHeaderPresent(),
        "Verifying the presence of good friend header");

    goodFriendHomePage.searchByCity(FrameworkConfigFactory.getConfig().searchedCityName());
    goodFriendHomePage.clickGoodFriendLogo();
    Assert.assertTrue(
        goodFriendHomePage.isGoodFriendHeaderPresent(),
        "Verifying the presence of good friend header");
  }
}
