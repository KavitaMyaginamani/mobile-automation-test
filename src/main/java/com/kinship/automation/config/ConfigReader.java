package com.kinship.automation.config;

import com.kinship.automation.constants.MobileDriverType;
import com.kinship.automation.constants.RemoteType;
import com.kinship.automation.constants.RunType;
import com.kinship.automation.constants.WebDriverType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
  "file:${user.dir}/src/test/resources/config.properties",
  "file:${user.dir}/src/test/resources/testData.properties",
  "file:${user.dir}/src/test/resources/android.properties",
  "file:${user.dir}/src/test/resources/ios.properties",
  "system:properties"
  // "file:${user.dir}/src/test/resources/{platform}.properties",
})
public interface ConfigReader extends Config {

  @Key("baseUrl")
  String url();

  @ConverterClass(value = StringToWebDriverTypeConverter.class)
  @DefaultValue("chrome")
  WebDriverType browser();

  @ConverterClass(value = StringToRemoteTypeConverter.class)
  @DefaultValue("browserstack")
  RemoteType remoteType();

  @ConverterClass(value = StringToRunTypeConverter.class)
  @Key("runType")
  RunType runType();

  @Key("gridusername")
  String gridUserName();

  @Key("gridaccesskey")
  String gridAccessKey();

  @ConverterClass(value = StringToMobileDriverTypeConverter.class)
  MobileDriverType platform();

  @Key("appActivity")
  String appActivity();

  @Key("appPackage")
  String appPackage();

  @Key("androidDevice")
  String androidDevice();

  @Key("iosDevice")
  String iosDevice();

  @Key("iosversion")
  String iosversion();

  @Key("androidversion")
  String androidversion();

  @Key("androidApp")
  String androidApp();

  @Key("iosApp")
  String iosApp();

  @Key("timeout")
  String mobileTimeout();

  @Key("bundleId")
  String bundleId();

  @Key("udid")
  String udid();

  @Key("baseUrlAPI")
  String baseUrlAPI();

  @Key("testRailUsername")
  String testRailUsername();

  @Key("testRailPassword")
  String testRailPassword();

  @Key("updateTestRailFlag")
  String updateTestRailFlag();

  @Key("existingRunID")
  String existingRunID();

  @Key("createNewTestRun")
  String createNewTestRun();

  @Key("slackWebHookURL")
  String slackWebHookURL();

  @Key("searchedCityName")
  String searchedCityName();

  @Key("searchedCityName1")
  String searchedCityName1();

  @Key("resultCityName")
  String resultCityName();

  @Key("serviceName")
  String serviceName();

  @Key("serviceName2")
  String serviceName2();

  @Key("serviceName1")
  String serviceName1();

  @Key("businessName")
  String businessName();

  @Key("businessFullName")
  String businessFullName();

  @Key("petParentEmail")
  String petParentEmail();

  @Key("petParentPassword")
  String petParentPassword();

  @Key("petParentFullName")
  String petParentFullName();

  @Key("businessOwnerEmail")
  String businessOwnerEmail();

  @Key("businessOwnerPassword")
  String businessOwnerPassword();

  @Key("businessOwnerFullName")
  String businessOwnerFullName();

  @Key("cardNo1")
  String cardNo1();

  @Key("cardNo2")
  String cardNo2();

  @Key("cardNo3")
  String cardNo3();

  @Key("cardNo4")
  String cardNo4();

  @Key("expdate")
  String expdate();

  @Key("cvvzip")
  String cvvzip();

  @Key("CardName")
  String CardName();

  @Key("newPetParentEmail")
  String newPetParentEmail();

  @Key("petParentFirstName")
  String petParentFirstName();

  @Key("petParentLastName")
  String petParentLastName();

  @Key("petParentPhoneNumber")
  String petParentPhoneNumber();

  @Key("petParentNewPassword")
  String petParentNewPassword();

  @Key("newFullName")
  String newFullName();

  @Key("newLastName")
  String newLastName();

  @Key("petName")
  String petName();

  @Key("petType")
  String petType();

  @Key("petBirthDate")
  String petBirthDate();

  @Key("petBreed")
  String petBreed();

  @Key("petWeight")
  String petWeight();

  @Key("petGender")
  String petGender();

  @Key("language")
  String language();

  @Config.Key("customerRegistrationPage")
  String customerRegistrationPage();

  @Config.Key("customerLoginPage")
  String customerLoginPage();

  @Config.Key("providerRegistrationPage")
  String providerRegistrationPage();

  @Config.Key("providerLoginPage")
  String providerLoginPage();

  @Config.Key("loginSignupPage")
  String loginSignupPage();

  @Config.Key("facebookPageUrl")
  String facebookPageUrl();

  @Config.Key("instagramPageUrl")
  String instagramPageUrl();

  @Config.Key("termsOfServiceUrl")
  String termsOfServiceUrl();

  @Config.Key("currentpassword")
  String currentpassword();

  @Config.Key("newpassword")
  String newpassword();

  @Config.Key("newpasswordpolicy")
  String newpasswordpolicy();

  @Config.Key("businessFirstName")
  String businessFirstName();

  @Config.Key("businessLastName")
  String businessLastName();

  @Config.Key("businessNumber")
  String businessNumber();

  @Key("businessAddress")
  String businessAddress();
}
