package com.kinship.automation.config;

import com.kinship.automation.constants.MobileDriverType;
import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

public class StringToMobileDriverTypeConverter implements Converter<MobileDriverType> {

  @Override
  public MobileDriverType convert(Method method, String mobileDriverType) {
    return MobileDriverType.valueOf(mobileDriverType.toUpperCase());
  }
}
