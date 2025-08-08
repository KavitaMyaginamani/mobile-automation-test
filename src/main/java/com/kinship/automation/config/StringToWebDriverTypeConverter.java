package com.kinship.automation.config;

import com.kinship.automation.constants.WebDriverType;
import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

public class StringToWebDriverTypeConverter implements Converter<WebDriverType> {

  @Override
  public WebDriverType convert(Method method, String browername) {

    return WebDriverType.valueOf(browername.toUpperCase());
  }
}
