package com.kinship.automation.utils.drivers;

import java.util.Objects;

public final class KinshipDriver {

  private static KinshipDriver driver;

  //    static {
  //        driver = new KinshipDriver();
  //    }

  private KinshipDriver() {}

  public static KinshipDriver getInstance() {
    if (driver == null) {
      driver = new KinshipDriver();
    }
    return driver;
  }

  public KinshipDriver setUpBrowserDriver() {
    if (Objects.isNull(DriverManager.getDriver()))
      DriverManager.setDriver(DriverFactory.getBrowserDriver());
    return this;
  }

  public KinshipDriver setUpMobileDriver() {
    //        if (Objects.isNull(DriverManager.getDriver()))
    //            DriverManager.setDriver(DriverFactory.getMobileDriver());
    if (Objects.isNull(MobileDriverManager.getDriver()))
      MobileDriverManager.setDriver(DriverFactory.getMobileDriver());
    return this;
  }

  public void tearDownDriver() {
    if (Objects.nonNull(DriverManager.getDriver())) {
      DriverManager.unload();
    }
    if (Objects.nonNull(MobileDriverManager.getDriver())) {
      MobileDriverManager.unload();
    }
  }
}
