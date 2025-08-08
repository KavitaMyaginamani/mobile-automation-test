package com.kinship.automation.pageobjects.web;

import com.kinship.automation.utils.commonutils.ByT;
import com.kinship.automation.utils.commonutils.TestDriver;
import io.qameta.allure.Step;
import java.awt.*;
import java.awt.event.KeyEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

public class GoodFriendPage extends GoodFriendBasePage {
  protected final Logger log = LogManager.getLogger(GoodFriendBasePage.class);
  protected TestDriver driver;

  private By goodFriendHeader =
      ByT.locator(By.xpath("//*[@class='LandingPageSearch__Title-sc-1ne4zo3-11 cQwsHm']"));
  private By loginLabel = ByT.locator(By.xpath("//div[contains(text(),'LOG IN')]"));

  private By listYourBusiness = ByT.locator(By.xpath("//a[contains(text(),'List your business')]"));

  private By loginAsPetParentLabel2 =
      ByT.locator(By.xpath("//span[contains(text(),'Log in or sign up as a pet parent')]"));
  private By loginAsPetParentLabel =
      ByT.locator(By.xpath("//div[contains(text(),'AS PET PARENT')]"));
  private By loginAsBusinessOwnerLabel =
      ByT.locator(By.xpath("//div[contains(text(),'AS BUSINESS OWNER')]"));
  private By emailInput = ByT.locator(By.xpath("//input[contains(@name,'email')]"));
  private By loginSubmitBt = ByT.locator(By.xpath("//button[contains(@type,'submit')]"));
  private By passwordInput = ByT.locator(By.xpath("//input[contains(@name,'password')]"));
  private By petParentLabel = ByT.locator(By.xpath("//div[contains(text(),\"Pet's Parent\")]"));
  private By logoutBt =
      ByT.locator(
          By.xpath(
              "//div[@class='dropdown__DropDownList-sc-1qwsbky-0 bBtaha']//div//div[@class='LogoutButtonLink__TextWrapper-sc-10xnfxp-4 bQifUS'][normalize-space()='LOGOUT']"));
  private By profileDiv =
      ByT.locator(By.xpath("//div[contains(@class,\"Profile__ProfileWrapper\")]"));
  private By setUpBusinessLabel =
      ByT.locator(By.xpath("//div[contains(text(),'SET UP BUSINESS')]"));
  private By searchByCityInput = ByT.locator(By.xpath("//input[@id='google-api-autocomplete']"));
  private By goodfriendlogo =
      ByT.locator(
          By.xpath(
              "//div[@class='navigation__LogoWrapperLg-sc-1m2gqg8-2 cQQBJU']//a//*[name()='svg']"));

  // input[contains(@placeholder,'Location')]
  private By searchByServicesDD = ByT.locator(By.xpath("//div[contains(text(),'All Services')]"));
  private By searchByBusinessNameInput =
      ByT.locator(By.xpath("//input[contains(@placeholder,'Business Name')]"));
  private By searchBt = ByT.locator(By.xpath("//div[contains(text(),'Search')]//parent::button"));
  private By petpiclocator =
      ByT.locator(
          By.xpath(
              "//li[@class='BusinessResultItem__Container-sc-1ie3t71-1 flqNvf']//div[@class='BusinessResultItem__ImageContainer-sc-1ie3t71-2 eAJXer']//div//img[@class='BusinessResultItem__Image-sc-1ie3t71-3 RfXYB']"));
  private By findYourPetLabel = ByT.locator(By.xpath("//h2[contains(text(),'Find your')]"));

  private By timeslotbtn = ByT.locator(By.xpath("(//span[text()='8:30 PM'])[6]"));

  private By selectpetbtn =
      ByT.locator(By.xpath("//div/h4[text()='Select Your Pet']/following::div[1]/button[1]"));
  private By continuebtn =
      ByT.locator(
          By.xpath(
              "//button[@class='Button-sc-1ol8229-0 ivijus BookingWrapper__ContinueButton-sc-tk5ppy-8 lkBbwI']"));
  private By selectservice =
      ByT.locator(By.xpath("//div[@class='RadioButton__Label-sc-17wklsa-3 kAjfYd']"));
  private By selecttime =
      ByT.locator(
          By.xpath(
              "(//div[@class='availability__TimeslotContainer-sc-1j7bcn9-9 jtspTV']/button)["
                  + TestDriver.getRandomTime()
                  + "]"));
  private By continuebtncal =
      ByT.locator(By.xpath("//div[@class='Button__TextWrapper-sc-1ol8229-3 fIMBpi']"));
  private By payagreechkbox =
      ByT.locator(By.xpath("//span[@class='Checkbox__LabelText-sc-17d4542-3 iZukgk']"));
  private By bookappointmentbtn =
      ByT.locator(By.xpath("//div[contains(text(),'Book Appointment')]"));

  private By petownerMyappointment = ByT.locator(By.xpath("(//div[text()='MY APPOINTMENTS'])[1]"));

  private By requestbtn =
      ByT.locator(
          By.xpath(
              "(//div[@class='Pill__PillWrapper-sc-skfju6-0 gkvYCa' and text()='REQUESTED'])[1]"));

  private By cancelrequestbtn =
      ByT.locator(By.xpath("//button[contains(text(),'Cancel appointment')]"));

  private By yesconfirmationbtn =
      ByT.locator(
          By.xpath(
              "//div[@class='Button__TextWrapper-sc-1ol8229-3 fIMBpi' and text()= 'Yes, cancel']"));

  private By bookappointmentlabel =
      ByT.locator(By.xpath("//div[text()='Your appointment has been Requested!']"));
  private By myrequestslabel = ByT.locator(By.xpath("//span[normalize-space()='My Requests']"));
  private By BusappointmentLabel =
      ByT.locator(By.xpath("//nav[3]//div[1]//ul[1]//li[3]//div[1]//a[1]//div[2]"));
  private By BusrequestedLabel = ByT.locator(By.xpath("//a/p[contains(text(),'Requests')]"));

  private By Busrequestedbtn =
      ByT.locator(By.xpath("//div[@class='card__PillWrapper-sc-1fmrbcm-25 fpthve']"));
  private By Busappointmentconfirmbutton =
      ByT.locator(By.xpath("(//div/button[text()='Confirm'])[1]"));
  private By BusConfirmedLabel = ByT.locator(By.xpath("//button[text()='Confirmed']"));
  private By BusConfirmedBtn = ByT.locator(By.xpath("(//div[text()='CONFIRMED'])[1]"));
  private By BusCheckinBtn = ByT.locator(By.xpath("(//div[text()='Check in'])[2]"));
  private By checkedInLabel = ByT.locator(By.xpath("//button[normalize-space()='Checked In']"));
  private By ServiceLabel = ByT.locator(By.xpath("(//div[text()='SERVICES'])[2]"));
  private By businessnamesearchbox =
      ByT.locator(By.xpath("//input[@placeholder='Business Name (Optional)']"));
  private By paymentsettingbtn =
      ByT.locator(
          By.cssSelector(
              "div[class='dropdown__DropDownList-sc-1qwsbky-0 bBtaha'] div:nth-child(2) div:nth-child(1) a:nth-child(1)"));

  private By addnewcard = ByT.locator(By.xpath("//div[normalize-space()='+ Add new card']"));
  private By cardnumber =
      ByT.locator(
          By.xpath(
              "//div[@class='CardSection__CardInput-sc-xgnd22-1 kuZhgN StripeElement StripeElement--empty']"));

  private By cardName = ByT.locator(By.xpath("//input[@type='text'and @maxlength='26']"));
  private By chckboxdefaultcard = ByT.locator(By.xpath("//span[text()=' Set as default card']"));
  private By addnewcardbtn = ByT.locator(By.xpath("//div[text()='Add New Card']"));
  private By SomethingWentlbl =
      ByT.locator(
          By.xpath("//div/h2[@class='payment-confirmation__ErrorHeader-sc-o76ayr-1 icLYYL']"));
  private By okbtn =
      ByT.locator(
          By.xpath(
              "//div[@class='payment-confirmation__ErrorButtonWrapper-sc-o76ayr-2 IZCHY']//button[@class='Button-sc-1ol8229-0 ivijus']"));
  private By okbookingbtn =
      ByT.locator(
          By.xpath(
              "//div[@class='modal__ButtonWrapper-sc-1bsoovl-4 hsGdxz']//button[@class='Button-sc-1ol8229-0 ivijus']"));
  private By nextTime = ByT.locator(By.xpath("(//button[normalize-space()='3:30 AM'])[1]"));
  private By trainingService = ByT.locator(By.xpath("//div[contains(text(),'Training')]"));
  private By groomingService = ByT.locator(By.xpath("//div[contains(text(),'Grooming')]"));
  private By morebtn = ByT.locator(By.xpath("(//*[@href='#icon-chevron-12'])[6]"));
  private By firstName = ByT.locator(By.xpath("//input[@name='first_name']"));
  private By lastName = ByT.locator(By.xpath("//input[@name='last_name']"));
  private By phoneNumber = ByT.locator(By.xpath("//input[@name='phone_number']"));
  private By password = ByT.locator(By.xpath("//input[@id='password']"));
  private By confirmPassword = ByT.locator(By.xpath("//input[@name='password_confirmation']"));
  private By myProfile =
      ByT.locator(
          By.xpath(
              "//div[@class='dropdown__DropDownList-sc-1qwsbky-0 bBtaha']//descendant::div[text()='MY PROFILE']"));
  private By customerUserLastName = ByT.locator(By.id("customerUser-last-name"));
  private By myPet =
      ByT.locator(
          By.xpath(
              "//div[@class='CustomerNavigation__HeaderActionItemWrapper-sc-1vgvbw8-6 LjgVY']//div[@class='ActionItem__TextWrapper-sc-15edsh7-2 iakWVm' and text()='MY PETS']"));
  private By addMyPet =
      ByT.locator(
          By.xpath(
              "//div[@class='Button__TextWrapper-sc-1ol8229-3 fIMBpi' and text()='Add New Pet']"));
  private By addMyPetHeader =
      ByT.locator(By.xpath("//h2[normalize-space()='Add Your Pet to GoodFriend']"));
  private By petName = ByT.locator(By.xpath("//input[@id='pet-name']"));
  private By petType = ByT.locator(By.xpath("//label[text()='Pet type']//following-sibling::div"));
  private By petBirthDate = ByT.locator(By.name("pet.attributes.birthdate"));
  private By petBreed =
      ByT.locator(
          By.xpath(
              "//label[contains(text(),' breed')]//parent::div//descendant::div[@class='gfx-select__control css-yk16xz-control']"));
  private By petWeight = ByT.locator(By.xpath("//input[@id='pet-weight']"));
  private By petGender =
      ByT.locator(
          By.xpath(
              "//label[contains(text(),'gender')]//following::div[@class='gfx-select__control css-yk16xz-control']"));
  private By petSpayed = ByT.locator(By.xpath("//input[@value='false']//parent::span"));
  private By petNeutered = ByT.locator(By.xpath("//input[@value='true']//parent::span"));
  private By petVetName = ByT.locator(By.xpath("//input[@id='pet-vet-name']"));

  private By termsOfServiceLink = ByT.locator(By.xpath("//a[contains(text(),'Terms of Service')]"));

  private By TermsOfServiceHeader =
      ByT.locator(By.xpath("//div[contains(text(),'Terms of Service')]"));

  private By privacyPolicyLink =
      ByT.locator(
          By.xpath(
              "//a[contains(text(),'Terms of Service')]//ancestor::div[4]//descendant::a[text()='Privacy']"));

  private By privacyPolicyHeader = ByT.locator(By.xpath("//a[contains(@title,'Mars Home page')]"));
  private By selectLanguage = ByT.locator(By.xpath("//select[@id='ctarowDropdown']"));
  private By btnGetStarted = ByT.locator(By.xpath("//button[@class='Button-sc-1ol8229-0 hinraf']"));

  private By btnSignupNow = ByT.locator(By.xpath("//div[normalize-space()='Sign up now']"));

  private By facebookLogo =
      ByT.locator(By.xpath("//*[name()='use' and contains(@href,'#icon-sn-f')]"));
  private By instagramLogo =
      ByT.locator(By.xpath("//*[name()='use' and contains(@href,'#icon-sn-i')]"));
  private By goodfriendfblabel = ByT.locator(By.xpath("//div/span/h1[text()='GoodFriend']"));
  private By termsOfServiceLogo = ByT.locator(By.xpath("//a[text()='Terms of Service']"));
  private By privacyLogo = ByT.locator(By.xpath("//a[normalize-space()='Privacy']"));
  private By cookiesLogo = ByT.locator(By.xpath("//a[normalize-space()='Cookies']"));
  private By savebtncookies =
      ByT.locator(
          By.xpath("//button[@class='osano-cm-save osano-cm-view__button osano-cm-button']"));

  private By instausernamefield = ByT.locator(By.xpath("//input[@name='username']"));
  private By instapasswordfield = ByT.locator(By.xpath("//input[@name='password']"));
  private By instaloginbtn = ByT.locator(By.xpath("//div[contains(text(),'Log In')]"));
  private By upcomingEventLabel =
      ByT.locator(By.xpath("//div[contains(text(),'Upcoming events')]"));
  private By pastEventLabel = ByT.locator(By.xpath("//div[contains(text(),'Past events')]"));
  private By goodFriendLogo =
      ByT.locator(By.xpath("//div[contains(@class,'GenericNavigation__LogoWrapperLg')]"));

  // sprint 3 changes by Priya
  private By curpassword = ByT.locator(By.xpath("//input[@name='currentPassword']"));
  private By newpassword = ByT.locator(By.xpath("//input[@id='password']"));
  private By confirmpassword = ByT.locator(By.xpath("//input[@name='passwordConfirmation']"));
  private By updatepasswordbtn =
      ByT.locator(By.xpath("//div[normalize-space()='Update Password']"));
  private By appointment =
      ByT.locator(
          By.xpath("(//li[@class='GlobalSide__ActionItemWrapper-sc-1051khe-6 jxfToo'])[8]//a"));
  private By calender =
      ByT.locator(
          By.xpath("//a[@class='calendar__LinkTitle-sc-ztv2nl-2 hGOYKC']//p[text()='Calendar']"));
  private By puppy = ByT.locator(By.xpath("//h3[normalize-space()='Denver Puppy Academy']"));
  private By phoneNo = ByT.locator(By.xpath("//a[normalize-space()='+1 (973) 051-3330']"));
  private By website = ByT.locator(By.xpath("//a[normalize-space()='Visit Website']"));
  private By businessProfile = ByT.locator(By.xpath("(//div[text()='BUSINESS PROFILE'])[2]"));
  private By businessNumber =
      ByT.locator(
          By.xpath(
              "//div[@class='ProviderProfileForm__HalfWidthRow-sc-in3anf-5 jzWLLr']//input[@id='pet-notes']"));
  private By businessAddress = ByT.locator(By.xpath("//input[@id='business-address']"));

  public GoodFriendPage() {}

  public GoodFriendPage(TestDriver driver) {
    this.driver = driver;
  }

  @Step("verify present of Good Friend Page Header")
  public boolean isGoodFriendHeaderPresent() {
    boolean flag = false;
    flag = driver.isElementPresent(goodFriendHeader);
    return flag;
  }

  @Step("login as pet parent")
  public void clickListYourBusinessButton() {
    driver.waitForElementToBeVisible(listYourBusiness);
    driver.clickLocator(listYourBusiness);
  }

  @Step("login as pet parent")
  public void clickParentLoginFromListYourBusinessButton() {
    driver.waitForElementToBeVisible(loginAsPetParentLabel2);
    driver.clickLocator(loginAsPetParentLabel2);
  }

  @Step("login as pet parent")
  public void loginAsPetParent() {
    driver.clickLocator(loginLabel);
    driver.waitForElementToBeVisible(loginAsPetParentLabel);
    driver.clickLocator(loginAsPetParentLabel);
  }

  @Step("login as business owner")
  public void loginAsBusinessOwner() {
    driver.waitForElementToBeVisible(loginLabel, 20);
    driver.clickLocator(loginLabel);
    driver.waitForElementToBeVisible(loginAsBusinessOwnerLabel);
    driver.clickLocator(loginAsBusinessOwnerLabel);
  }

  @Step("enter email address and click submit")
  public void enterEmailAndClickSubmit(String email, String password) {
    driver.waitForElementToBeVisible(emailInput);
    driver.type(emailInput, email);
    driver.clickLocator(loginSubmitBt);
    driver.waitForElementToBeVisible(passwordInput);
    driver.type(passwordInput, password);
    driver.clickLocator(loginSubmitBt);
  }

  @Step("verify business owner logged in")
  public boolean isBusinessOwnerLoggedIn(String businessOwnerName) {
    driver.pauseExecutionFor(15);
    boolean flag1 = false;
    By businessOwnerNameLabel =
        ByT.locator(By.xpath("//div[contains(text(),'" + businessOwnerName + "')]"));
    driver.waitForElementToBeVisible(businessOwnerNameLabel, 35);
    flag1 = driver.isElementPresent(businessOwnerNameLabel);
    return flag1;
  }

  @Step("verify pet parent logged in")
  public boolean isPetParentLoggedIn(String petParentName) {
    driver.pauseExecutionFor(15);
    boolean flag1 = false;
    boolean flag2 = false;
    driver.waitForElementToBeVisible(petParentLabel, 25);
    By petParentNameLabel =
        ByT.locator(By.xpath("//div[contains(text(),'" + petParentName + "')]"));
    flag1 = driver.isElementPresent(petParentNameLabel);
    flag2 = driver.isElementPresent(petParentLabel);
    return flag1 && flag2;
  }

  @Step("verify is business user logged in")
  public boolean isBusinessUserLoggedIn(String petParentName) {
    boolean flag1 = false;
    boolean flag2 = false;
    driver.waitForElementToBeVisible(petParentLabel);
    By petParentNameLabel =
        ByT.locator(By.xpath("//div[contains(text(),'" + petParentName + "')]"));
    flag1 = driver.isElementPresent(petParentNameLabel);
    flag2 = driver.isElementPresent(petParentLabel);
    return flag1 && flag2;
  }

  @Step("click logout button")
  public void Logout() {
    driver.pauseExecutionFor(5);
    driver.clickLocator(profileDiv);
    driver.pauseExecutionFor(3);
    driver.waitForElementToBeVisible(logoutBt);
    driver.clickLocator(logoutBt);
  }

  @Step("verify user logout")
  public boolean verifyLogout() {
    boolean flag1 = false;
    driver.waitForElementToBeVisible(loginLabel, 15);
    flag1 = driver.isElementPresent(loginLabel);
    return flag1;
  }

  @Step("Search by city")
  public void searchByCity(String cityName) {
    driver.waitForElementToBeVisible(searchByCityInput, 20);
    driver.clearField(searchByCityInput);
    driver.type(searchByCityInput, cityName);
    driver.pauseExecutionFor(5);
    driver.clickLocator(findYourPetLabel);
    driver.waitForElementToBeVisible(searchBt);
    driver.clickLocator(searchBt);
  }

  @Step("verify search result by city name")
  public boolean verifySearchByCityResult() {
    boolean flag1 = false;
    By cityNameLabel = ByT.locator(By.xpath("//input[@id='google-api-autocomplete']"));
    driver.waitForElementToBeVisible(cityNameLabel, 10);
    flag1 = driver.isElementPresent(cityNameLabel);
    return flag1;
  }

  @Step("Search by services")
  public void searchByServices(String serviceName) {
    driver.pauseExecutionFor(5);
    driver.waitForElementToBeVisible(searchByServicesDD);
    driver.clickLocator(searchByServicesDD);
    By service = ByT.locator(By.xpath("//*[contains(text(),'" + serviceName + "')]"));
    driver.waitForElementToBeVisible(service, 10);
    driver.clickLocator(service);
    driver.clickLocator(searchBt);
  }

  @Step("verify search by services ")
  public boolean verifySearchByServicesResult(String serviceName) {
    boolean flag1 = false;
    By serviceLabel = ByT.locator(By.xpath("//li[contains(text(),'" + serviceName + "')]"));
    driver.waitForElementToBeVisible(serviceLabel, 10);
    flag1 = driver.isElementPresent(serviceLabel);
    return flag1;
  }

  @Step("Search by business name")
  public void searchByBusinessName(String businessName, String fullName) {
    driver.pauseExecutionFor(10);
    driver.waitForElementToBeVisible(searchByBusinessNameInput, 10);
    driver.clearField(searchByBusinessNameInput);
    driver.type(searchByBusinessNameInput, businessName);
    By fullNameLabel = ByT.locator(By.xpath("//h4[contains(text(),'" + fullName + "')]"));
    driver.waitForElementToBeClickable(fullNameLabel, 10);
    driver.clickLocator(fullNameLabel);
  }

  @Step("verify search result by business name")
  public boolean verifySearchByBusinessNameResult(String fullName) {
    boolean flag1 = false;
    By fullNameLabel = ByT.locator(By.xpath("//h2[contains(text(),'" + fullName + "')]"));
    driver.waitForElementToBeVisible(fullNameLabel, 10);
    flag1 = driver.isElementPresent(fullNameLabel);
    return flag1;
  }

  @Step("Search by Location and Service")
  public void searchbyLocationandService(String cityName, String serviceName, String businessName) {
    driver.waitForElementToBeVisible(searchByCityInput, 30);
    driver.clearField(searchByCityInput);
    driver.type(searchByCityInput, cityName);
    driver.waitForElementToBeVisible(searchByServicesDD);
    driver.clickLocator(searchByServicesDD);
    By service = ByT.locator(By.xpath("//*[contains(text(),'" + serviceName + "')]"));
    driver.waitForElementToBeVisible(service, 10);
    driver.clickLocator(service);
    driver.clickLocator(businessnamesearchbox);
    driver.type(businessnamesearchbox, businessName);
    ;
    driver.waitForElementToBeVisible(searchBt);
    driver.clickLocator(searchBt);
  }

  @Step("Click on time slot")
  public void clickTimeSlot() {
    driver.waitForElementToBeVisible(morebtn);
    driver.clickLocator(morebtn);
    driver.pauseExecutionFor(3);
    driver.waitForElementToBeVisible(timeslotbtn, 20);
    driver.clickLocator(timeslotbtn);
  }

  public void selectTraining(String serviceName2) {
    driver.waitForElementToBeVisible(groomingService);
    driver.clickLocator(groomingService);
    By service = ByT.locator(By.xpath("//*[contains(text(),'" + serviceName2 + "')]"));
    driver.waitForElementToBeVisible(service, 10);
    driver.clickLocator(service);
    driver.waitForElementToBeVisible(searchBt, 10);
    driver.clickLocator(searchBt);
    driver.pauseExecutionFor(2);
  }

  public void selectGrooming(String cityName, String serviceName) {
    By service = ByT.locator(By.xpath("//*[contains(text(),'" + serviceName + "')]"));
    driver.waitForElementToBeVisible(searchByCityInput, 30);
    driver.clearField(searchByCityInput);
    driver.type(searchByCityInput, cityName);
    driver.waitForElementToBeVisible(searchByServicesDD);
    driver.clickLocator(searchByServicesDD);
    driver.waitForElementToBeVisible(service, 10);
    driver.clickLocator(service);
    driver.waitForElementToBeVisible(searchBt, 10);
    driver.clickLocator(searchBt);
    driver.pauseExecutionFor(2);
  }

  public void selectAllServices(String serviceName1) {
    driver.waitForElementToBeVisible(trainingService);
    driver.clickLocator(trainingService);
    By service = ByT.locator(By.xpath("//*[contains(text(),'" + serviceName1 + "')]"));
    driver.waitForElementToBeVisible(service, 10);
    driver.clickLocator(service);
    driver.waitForElementToBeVisible(searchBt, 10);
    driver.clickLocator(searchBt);
    driver.pauseExecutionFor(2);
  }

  @Step("Select Pet to book Appointment")
  public void selectPet() {
    driver.waitForElementToBeVisible(selectpetbtn, 20);
    driver.clickLocator(selectpetbtn);
    driver.waitForElementToBeVisible(continuebtn);
    driver.clickLocator(continuebtn);
    driver.waitForElementToBeVisible(selectservice);
    driver.clickLocator(selectservice);
    driver.clickLocator(continuebtn);
    driver.clickLocator(selecttime);
    driver.clickLocator(continuebtncal);
    driver.clickLocator(payagreechkbox);
    driver.clickLocator(bookappointmentbtn);
  }

  @Step("Select Pet to book Appointment")
  public void selectPetAndBookAppointment() {
    driver.waitForElementToBeVisible(selectpetbtn, 20);
    driver.clickLocator(selectpetbtn);
    driver.waitForElementToBeVisible(continuebtn);
    driver.clickLocator(continuebtn);
    driver.waitForElementToBeVisible(selectservice);
    driver.clickLocator(selectservice);
    driver.clickLocator(continuebtn);
    driver.clickLocator(selecttime);
    driver.clickLocator(continuebtn);
    driver.clickLocator(payagreechkbox);
    driver.clickLocator(loginSubmitBt);
    driver.clickLocator(okbookingbtn);
    // for booking appointment that is already booked with different timeslot
    // driver.waitForElementToBeVisible(SomethingWentlbl,10);
    if (driver.isElementPresent(SomethingWentlbl)) {
      driver.waitForElementToBeVisible(okbtn, 10);
      driver.clickLocator(okbtn);
      driver.navigateToBack();
      driver.clickLocator(nextTime);
      driver.clickLocator(continuebtncal);
      driver.clickLocator(payagreechkbox);
      driver.clickLocator(loginSubmitBt);
    }
  }

  @Step("verify book appointment")
  public boolean verifyBookAppointment() {
    boolean flag1 = false;
    driver.waitForElementToBeVisible(bookappointmentlabel, 15);
    flag1 = driver.isElementPresent(bookappointmentlabel);
    return flag1;
  }

  @Step("cancel book Appointment")
  public void clickCancelAppointment() {
    driver.waitForElementToBeVisible(petownerMyappointment);
    driver.clickLocator(petownerMyappointment);
    driver.waitForElementToBeVisible(myrequestslabel);
    driver.clickLocator(myrequestslabel);
    driver.waitForElementToBeVisible(requestbtn);
    driver.clickLocator(requestbtn);
    driver.waitForElementToBeVisible(cancelrequestbtn);
    driver.clickLocator(cancelrequestbtn);
    driver.waitForElementToBeVisible(yesconfirmationbtn);
    driver.clickLocator(yesconfirmationbtn);
  }

  @Step("verify Cancelled  appointment")
  public boolean verifyCancelledAppointment() {
    boolean flag1 = false;
    driver.waitForElementToBeVisible(yesconfirmationbtn, 15);
    flag1 = driver.isElementPresent(yesconfirmationbtn);
    log.info("Your appointment has been cancelled sucessfully");
    return flag1;
  }

  @Step("View Customer  Appointment List")
  public void viewCustomerAppointmentList() {
    driver.waitForElementToBeVisible(petownerMyappointment);
    driver.clickLocator(petownerMyappointment);
    driver.waitForElementToBeVisible(myrequestslabel);
    driver.clickLocator(myrequestslabel);
  }

  @Step("verify Card Added or Not")
  public boolean verifyCardAddedorNot() {
    boolean flag1 = false;
    flag1 = driver.isElementPresent(addnewcardbtn);
    return flag1;
  }

  @Step("click Add payment")
  public void clickAddPaymentMethod(
      String cardno1,
      String cardno2,
      String cardno3,
      String cardno4,
      String expdate,
      String cvvzip,
      String CardName) {
    driver.waitForElementToBeVisible(profileDiv);
    driver.clickLocator(profileDiv);
    driver.waitForElementToBeVisible(paymentsettingbtn);
    driver.clickLocator(paymentsettingbtn);
    driver.waitForElementToBeVisible(addnewcard);
    driver.clickLocator(addnewcard);
    driver.waitForElementToBeVisible(cardnumber, 20);
    driver.clickLocator(cardnumber);

    // for entering Card Number since it has spaces
    driver.sendText(cardno1);
    driver.pauseExecutionFor(1);
    driver.sendText(cardno2);
    driver.sendText(cardno3);
    driver.sendText(cardno4);
    // for month and YY
    driver.sendText(expdate);

    // for cvv and zip
    driver.sendText(cvvzip);
    // waiting for element
    driver.waitForElementToBeVisible(cardName);
    // for clicking locator of CardName
    driver.clickLocator(cardName);
    // for entering CardName
    driver.sendText(CardName);
    // for  clicking on checkbox of defaultcard
    driver.clickLocator(chckboxdefaultcard);
    driver.clickLocator(addnewcardbtn);
  }

  @Step("View Appointment and Confirm from Business Profile")
  public void viewAppointmentandConfirm() {
    driver.waitForElementToBeVisible(BusappointmentLabel, 20);
    driver.clickLocator(BusappointmentLabel);
    driver.waitForElementToBeVisible(BusrequestedLabel);
    driver.clickLocator(BusrequestedLabel);

    if (driver.isElementPresent(Busrequestedbtn)) {
      //			driver.waitForElementToBeVisible(Busrequestedbtn, 10);
      //			driver.clickLocator(Busrequestedbtn);
      driver.waitForElementToBeVisible(Busappointmentconfirmbutton, 10);
      driver.clickLocator(Busappointmentconfirmbutton);
      driver.clickLocator(BusappointmentLabel);
    } else {
      log.info(" You do not have any appointments yet");
    }
  }

  @Step("Checkin ConfirmedAppointment")
  public void testCheckinAppointment() {
    driver.clickLocator(BusappointmentLabel);
    driver.waitForElementToBeVisible(BusConfirmedLabel);
    driver.clickLocator(BusConfirmedLabel);

    if (driver.isElementPresent(BusConfirmedBtn)) {
      log.info("in if part since appointments are there to be confirmed");
      driver.clickLocator(BusConfirmedBtn);
      driver.waitForElementToBeVisible(BusCheckinBtn);
      driver.clickLocator(BusCheckinBtn);
    } else {
      log.info(" You do not have any appointments yet to be confirmed");
    }
  }

  @Step("view Checked in appointment")
  public void testviewCheckInAppointment() {
    //	        driver.waitForElementToBeVisible(ServiceLabel, 20);
    //			driver.clickLocator(ServiceLabel);
    driver.waitForElementToBeVisible(BusappointmentLabel, 20);
    driver.clickLocator(BusappointmentLabel);
    driver.waitForElementToBeVisible(checkedInLabel, 20);
    driver.clickLocator(checkedInLabel);
  }

  @Step("Enter the email")
  public void enterEmail(String email) {

    driver.waitForElementToBeVisible(emailInput);
    driver.type(emailInput, driver.getAlphaNumericString(5) + email);
    driver.clickLocator(loginSubmitBt);
  }

  @Step("Enter the petOwner details")
  public void petOwnerDetails(
      String first_Name,
      String last_Name,
      String phone_Number,
      String newPassword,
      String newConfirmPassword) {
    driver.type(firstName, first_Name);
    driver.type(lastName, last_Name);
    driver.type(phoneNumber, phone_Number);
    driver.type(password, newPassword);
    driver.type(confirmPassword, newConfirmPassword);
    driver.clickLocator(loginSubmitBt);
  }

  @Step("edit the last name")
  public void editLastName(String newLastName) {
    driver.pauseExecutionFor(10);
    driver.clickLocator(profileDiv);
    driver.waitForElementToBeVisible(myProfile);
    driver.clickLocator(myProfile);
    driver.waitForElementToBeVisible(customerUserLastName);
    driver.clearField(customerUserLastName);
    driver.type(customerUserLastName, newLastName);
    driver.clickLocator(loginSubmitBt);
    driver.clickLocator(goodFriendLogo);
  }

  @Step("click my pet icon")
  public void clickMyPet() {
    driver.pauseExecutionFor(10);
    //		driver.waitForElementToBeVisible(myPet);
    driver.click(myPet);
    driver.waitForElementToBeVisible(addMyPet);
    driver.clickLocator(addMyPet);
  }

  @Step("enter the pet details")
  public void addPet(
      String name, String type, String date, String breed, String weight, String gender)
      throws AWTException {
    driver.waitForElementToBeVisible(petName);
    driver.clearField(petName);
    driver.type(petName, name);
    driver.waitForElementToBeVisible(petType);
    driver.clickLocator(petType);
    Robot robot = new Robot();
    switch (type) {
      case "Dog":
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        break;
      case "Cat":
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        break;
    }
    driver.clearField(petBirthDate);
    driver.clickLocator(petBirthDate);
    driver.type(petBirthDate, date);
    driver.clickLocator(petBreed);
    driver.sendKeys(breed);
    driver.sendKeys(petWeight, weight);
    driver.clickLocator(petGender);
    switch (gender) {
      case "Male":
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        break;
      case "Female":
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        break;
    }
    driver.clickLocator(petNeutered);
    driver.clickLocator(loginSubmitBt);
    driver.clickLocator(goodFriendLogo);
  }

  @Step("click terms of service link")
  public void clickTermsOfService() {
    driver.scrollPageUPOrDown(TestDriver.ScrollDirection.DOWN, 10, 10);
    driver.waitForElementToBeVisible(termsOfServiceLink);
    driver.clickLocator(termsOfServiceLink);
    driver.switchToNewWindow();
  }

  @Step("Verify terms of service link")
  public Boolean VerifyTermsOfServicePage() {

    boolean flag1 = false;
    driver.waitForElementToBeVisible(TermsOfServiceHeader, 35);
    flag1 = driver.isElementPresent(TermsOfServiceHeader);
    return flag1;
  }

  @Step("click terms of service link")
  public void clickPrivacyPolicy(String text) {
    // driver.scrollPageUPOrDown(TestDriver.ScrollDirection.DOWN, 10, 10);
    driver.moveToElement(privacyPolicyLink);
    driver.waitForElementToBeVisible(privacyPolicyLink);
    driver.clickLocator(privacyPolicyLink);
    driver.switchToNewWindow();
    driver.selectByText(selectLanguage, text);
    driver.pauseExecutionFor(5);
  }

  @Step("Verify terms of service link")
  public Boolean VerifyPrivacyPolicyPage() {
    boolean flag1 = false;
    driver.waitForElementToBeVisible(privacyPolicyHeader, 35);
    flag1 = driver.isElementPresent(privacyPolicyHeader);
    return flag1;
  }

  @Step("Business Owner Registration Page Validation Test")
  public void signupNow() {
    driver.waitForElementToBeVisible(btnGetStarted);
    driver.moveToElement(btnGetStarted);
    driver.clickLocator(btnGetStarted);
    driver.waitForElementToBeVisible(btnSignupNow);
    driver.clickLocator(btnSignupNow);
  }

  @Step("Validate Email ")
  public Boolean validateEmail(String email) {
    driver.waitForElementToBeVisible(emailInput);
    driver.type(emailInput, driver.getAlphaNumericString(5) + email);
    String mail = driver.getAttribute(emailInput, "value");
    boolean flag1 = false;
    flag1 = driver.isValid(mail);
    return flag1;
  }

  @Step("To validate first name ")
  public Boolean validateFirstName(String name) {
    driver.clickLocator(loginSubmitBt);
    driver.waitForElementToBeVisible(firstName);
    driver.type(firstName, name);
    String firstName1 = driver.getAttribute(firstName, "value");
    boolean flag1 = false;
    flag1 = driver.isStringOnlyAlphabet(firstName1);
    return flag1;
  }

  @Step("To validate Last Name ")
  public Boolean validateLastName(String name) {
    driver.waitForElementToBeVisible(lastName);
    driver.type(lastName, name);
    String lastName1 = driver.getAttribute(lastName, "value");
    boolean flag1 = false;
    flag1 = driver.isStringOnlyAlphabet(lastName1);
    return flag1;
  }

  @Step("To validate phone number ")
  public Boolean validatePhoneNumber(String number) {
    driver.waitForElementToBeVisible(phoneNumber);
    driver.type(phoneNumber, number);
    String phoneNumber1 = driver.getAttribute(phoneNumber, "value");
    boolean flag1 = false;
    flag1 = driver.isValidPhoneNumber(phoneNumber1);
    return flag1;
  }

  @Step("To validate password ")
  public Boolean validatePassword(String number) {
    driver.waitForElementToBeVisible(passwordInput);
    driver.type(passwordInput, number);
    String password = driver.getAttribute(passwordInput, "value");
    boolean flag1 = false;
    flag1 = driver.isValidPassword(password);
    return flag1;
  }

  public boolean isFacbookLogoPresent() {
    boolean flag = false;
    flag = driver.isElementPresent(facebookLogo);
    return flag;
  }

  public void clickOnFacbookLogo() {
    driver.pauseExecutionFor(5);
    driver.waitForElementToBeVisible(facebookLogo, 10);
    driver.click(facebookLogo);
    driver.pauseExecutionFor(10);
  }

  public boolean isInstagramLogoPresent() {
    boolean flag = false;
    flag = driver.isElementPresent(instagramLogo);
    return flag;
  }

  public void clickOnInstaLogo() {
    driver.pauseExecutionFor(6);
    driver.waitForElementToBeVisible(instagramLogo, 10);
    driver.click(instagramLogo);
    driver.pauseExecutionFor(10);
  }

  public void clickOnCookiesLogo() {
    driver.pauseExecutionFor(5);
    driver.waitForElementToBeVisible(cookiesLogo, 10);
    driver.clickLocator(cookiesLogo);
    driver.pauseExecutionFor(10);
    driver.scrollToWebElement(savebtncookies);
    driver.clickLocator(savebtncookies);
    driver.pauseExecutionFor(2);
  }

  public void clickOnPrivacyLogo() {
    driver.pauseExecutionFor(5);
    driver.waitForElementToBeVisible(privacyLogo, 10);
    driver.clickLocator(privacyLogo);
    driver.pauseExecutionFor(10);
  }

  public void clickOnTermsOfServiceLogo() {
    driver.pauseExecutionFor(5);
    driver.waitForElementToBeVisible(termsOfServiceLogo, 10);
    driver.clickLocator(termsOfServiceLogo);
    driver.pauseExecutionFor(10);
  }

  @Step("verify Terms Of Service Url")
  public boolean verifyTermsOfServiceUrl(String url) {
    boolean flag1 = true;
    driver.expectedUrl("https://staging--goodfriend-web.netlify.app/customer/terms-service?");
    return flag1;
  }

  @Step("click terms of service link")
  public Boolean verifyGoodFriendEventPage() {
    boolean flag1 = false;
    boolean flag2 = false;
    flag1 = driver.isElementPresent(upcomingEventLabel);
    flag2 = driver.isElementPresent(pastEventLabel);
    return flag1 && flag2;
  }

  @Step("click terms of service link")
  public void clickGoodFriendLogo() {
    driver.waitForElementToBeVisible(goodFriendLogo);
    driver.clickLocator(goodFriendLogo);
  }

  @Step("Search by Location by Provider Account")
  public void searchByCitybyProvider(String cityName) {
    driver.waitForElementToBeVisible(goodfriendlogo, 20);
    driver.clickLocator(goodfriendlogo);
    driver.waitForElementToBeVisible(searchByCityInput, 10);
    driver.clearField(searchByCityInput);
    driver.type(searchByCityInput, cityName);
    driver.clickLocator(findYourPetLabel);
    driver.waitForElementToBeVisible(searchBt);
    driver.clickLocator(searchBt);
  }

  // sprint 3 changes by Priya
  @Step("Update Existing Password from Pet Parent Login")
  public void updateExistPassword(String curpass, String newpass) {
    driver.pauseExecutionFor(5);
    driver.clickLocator(profileDiv);
    driver.waitForElementToBeVisible(myProfile);
    driver.clickLocator(myProfile);
    driver.clickLocator(curpassword);
    driver.sendText(curpass);
    driver.clickLocator(newpassword);
    driver.sendText(newpass);
    driver.pauseExecutionFor(3);
    driver.clickLocator(confirmpassword);
    driver.sendText(newpass);
    driver.waitForElementToBeVisible(updatepasswordbtn);
    driver.clickLocator(updatepasswordbtn);
  }

  @Step("Update Existing Password from Pet Parent Login")
  public void checkPasswordPolicy(String curpass, String newpass) {
    driver.pauseExecutionFor(5);
    driver.clickLocator(profileDiv);
    driver.waitForElementToBeVisible(myProfile);
    driver.clickLocator(myProfile);
    driver.clickLocator(curpassword);
    driver.sendText(curpass);
    driver.clickLocator(newpassword);
    driver.sendText(newpass);
    driver.pauseExecutionFor(3);
    driver.clickLocator(confirmpassword);
    driver.sendText(newpass);
    driver.waitForElementToBeVisible(updatepasswordbtn);
    driver.clickLocator(updatepasswordbtn);
  }

  @Step("Delete the staff")
  public void deleteStaff() {
    driver.pauseExecutionFor(10);
    driver.clickLocator(appointment);
    driver.pauseExecutionFor(5);
    driver.clickLocator(calender);
  }

  public void phoneNumber() {
    driver.pauseExecutionFor(5);
    driver.clickLocator(puppy);
    driver.waitForElementToBeVisible(phoneNo);
    String phone = driver.getText(phoneNo, "phone number");
    driver.clickLocator(website);
  }

  public void editBusinessProfile(String text, String address) {
    driver.pauseExecutionFor(10);
    driver.clickLocator(businessProfile);
    driver.waitForElementToBeVisible(businessNumber);
    driver.type(businessNumber, text);
    driver.clickLocator(loginSubmitBt);
    driver.pauseExecutionFor(5);
    driver.waitForElementToBeVisible(businessAddress);
    driver.type(businessAddress, address);
    driver.clickLocator(loginSubmitBt);
  }
}
