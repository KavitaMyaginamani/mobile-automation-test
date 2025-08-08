package com.kinship.automation.config;

import com.kinship.automation.constants.RunType;
import java.lang.reflect.Method;
import org.aeonbits.owner.Converter;

public class StringToRunTypeConverter implements Converter<RunType> {

  @Override
  public RunType convert(Method method, String runType) {

    return RunType.valueOf(runType.toUpperCase());
  }
}
